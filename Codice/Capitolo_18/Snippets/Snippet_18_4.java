package LibroJava.Capitolo18;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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

public class Snippet_18_4
{
    public static void main(String[] args)
    {
        List<Integer> a_list = List.of(1, 2, 3, 4, 5, 6, 7);
        Set<String> a_set = new TreeSet<>();
        a_set.add("Pellegrino");
        a_set.add("Marco");
        a_set.add("Carlo");
        a_set.add("Domenico");
        a_set.add("Roberto");

        // ritorna una lista con gli elementi 4, 5, 6, 7 
        List<Integer> another_list = a_list.stream().skip(3).collect(Collectors.toList());
        System.out.println(another_list); // [4, 5, 6, 7]

        // ritorna un set con gli elementi Carlo, Domenico 
        Set<String> another_set = a_set.stream().limit(2).collect(Collectors.toSet());
        System.out.println(another_set); // [Carlo, Domenico] 

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
        
        // ritorna una mappa dove le chiavi sono il nome dei modelli delle car 
        // della collezione cars e i valori sono i rispettivi colori 
        Map<String, Colors> model_map = cars.stream()
                .distinct()
                .collect(Collectors.toMap(car -> car.getModel(), car -> car.getColor()));
        
        // RENAULT BLACK
        // FIAT RED
        // TOYOTA BLACK
        // BMW BLACK
        // MASERATI YELLOW
        for (Map.Entry<String, Colors> entry : model_map.entrySet())
        {
            String key = entry.getKey();
            Colors value = entry.getValue();
            System.out.printf("%s %s%n", key, value);
        };
    }
}
