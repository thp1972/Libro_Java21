package LibroJava.Capitolo18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

enum Colors { RED, BLUE, BLACK, YELLOW, GREEN, WHITE } 
 
class Car
{
    private String model;
    private Colors color;
    private int code;

    public Car(String model, Colors color, int code)
    {
        this.model = model;
        this.color = color;
        this.code = code;
    }

    public String getModel() { return model; }
    public Colors getColor() { return color; }
    public int getCode() { return code; }

    public String toString() { return getModel(); }

    public boolean equals(Object obj)
    {
        return ((Car) obj).getModel().equals(this.getModel());
    }
    
    public int hashCode() { return model.hashCode(); }
}

public class StreamTutorial
{
    public static int nr;

    public static void makeAverage(Collection<Car> cars)
    {
        // trova tutte le macchine con il colore BLACK e per ognuna 
        // ritorna il codice e poi ne fa la media 
        OptionalDouble average = cars.stream()
                .filter(car -> car.getColor() == Colors.BLACK) // operazione intermedia 
                .mapToInt(car -> car.getCode()) // operazione intermedia 
                .average(); // operazione terminale 

        System.out.printf("La media dei codici degli elementi di tipo Car è: %.2f%n", 
                          average.getAsDouble());
    }
    
    public static void makeExternalIteration(Collection<Car> cars)
    {
        int nr = 0;

        // utilizzo esplicito di iterator per mostrare l'iterazione esterna 
        // quanto scritto è come il compilatore traduce il seguente for "migliorato": 
        // for (Car car : cars) { if (car.getColor() == Colors.BLACK) nr++; } 
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext())
        {
            Car car;
            if ((car = iterator.next()).getColor() != Colors.BLACK)
                continue;
            ++nr;
        }
        System.out.printf
        ("Nella collezione corrente ci sono %d macchine con il colore BLACK%n", nr);
    }
    
    public static void makeInternalIteration(Collection<Car> cars)
    {
        // utilizzo del metodo forEach del tipo Stream che usa un'iterazione 
        // interna per processare gli elementi della collezione 
        // in base alla funzionalità fornita dalla lambda expression indicata 
        cars.stream()
                .forEach(car -> // operazione terminale 
                {
                    if (car.getColor() == Colors.BLACK)
                        nr++;
                });
        System.out.printf
        ("Nella collezione corrente ci sono %d macchine con il colore BLACK%n", nr);
    }
    
    public static void shortCircuiting(Collection<Car> cars)
    {
        // qui il metodo findFirst è eager ma può usare uno short-circuiting 
        // nel momento in cui trova la prima macchina BLACK 
        // findFirst ritorna un tipo Optional<Car> che rappresenta un oggetto container 
        // che può o non può contenere un non-null value 
        Optional<Car> firstBlack = cars.stream()
                .filter(car -> car.getColor() == Colors.BLACK) // operazione intermedia 
                .findFirst(); // operazione terminale di tipo short-circuiting 
        System.out.printf("La prima macchina BLACK trovata nella collezione è una %s%n",
                          firstBlack.get());
    }
    
    public static void executeParallelOperations(Collection<Car> cars)
    {
        // esegue, in parallelo, un conteggio di tutte le macchine della 
        // collezione cars escludendo, però, quelle che hanno la stessa marca 
        long count = cars.parallelStream()
                .distinct() // operazione intermedia stateful 
                .count(); // operazione terminale 
        System.out.printf("Numero di macchine escludendo quelle con la stessa marca: %d%n", 
                          count);
    }
    
    public static void ordering(Collection<Car> cars)
    {
        // esegue in parallelo le seguenti operazioni: 
        // ritorna per ogni macchina il modello e lo stampa
        // la I e la II computazione ritorneranno un risultato differente 
        // e nessun eventuale ordinamento è rispettato 
        // con forEachOrdered invece, nella III computazione l'ordinamento incontrato 
        // è rispettato 

        // I COMPUTAZIONE 
        System.out.print("Prima computazione in ordering: [ ");
        cars.parallelStream()
                .map(car -> car.getModel()) // operazione intermedia 
                .forEach(model -> System.out.printf("%s ", model)); // operazione terminale 
        System.out.println("]");

        // II COMPUTAZIONE 
        System.out.print("Seconda computazione in ordering: [ ");
        cars.parallelStream()
                .map(car -> car.getModel()) // operazione intermedia 
                .forEach(model -> System.out.printf("%s ", model)); // operazione terminale 
        System.out.println("]");

        // III COMPUTAZIONE 
        System.out.print("Terza computazione in ordering: [ ");
        cars.parallelStream()
                .map(car -> car.getModel()) // operazione intermedia 
                .forEachOrdered(model -> System.out.printf("%s ", model)); // operazione 
        // terminale 
        System.out.println("]");
    }
    
    public static void makeReduction(Collection<Car> cars)
    {
        // otteniamo la somma dei codici di tutte le macchine 
        int sum = cars.stream()
                .mapToInt(car -> car.getCode()) // operazione intermedia 
                .reduce(0, (a, b) -> a + b); // operazione terminale 
        System.out.printf("La somma di tutti i codici è: %d%n", sum);
    }
 
    public static void makeMutableReduction(Collection<Car> cars)
    {
        List<String> model_list
                     = cars.stream()
                        .map(car -> car.getModel()) // operazione intermedia 
                        // operazione terminale 
                        .collect(() -> new ArrayList<>(), // supplier - è OK anche ArrayList::new 
                                 // accumulator - è OK anche ArrayList::add 
                                 (container, element) -> container.add(element),
                                 // combiner - è OK anche ArrayList::addAll 
                                 (container_1, container_2) -> container_1.addAll(container_2));

        System.out.printf("Collezione dei modelli: %s%n", model_list);
    }
     
    public static void main(String[] args)
    {
        Collection<Car> cars = List.of
        (
                new Car("BMW", Colors.BLACK, 123),
                new Car("RENAULT", Colors.BLACK, 205),
                new Car("FIAT", Colors.RED, 10),
                new Car("MASERATI", Colors.YELLOW, 99),
                new Car("FIAT", Colors.WHITE, 10),
                new Car("MASERATI", Colors.RED, 99),
                new Car("TOYOTA", Colors.BLACK, 89)
        );
        
        makeAverage(cars);
        makeExternalIteration(cars);
        makeInternalIteration(cars);
        shortCircuiting(cars);
        executeParallelOperations(cars);
        ordering(cars);
        makeReduction(cars);
        makeMutableReduction(cars);        
    }
}
