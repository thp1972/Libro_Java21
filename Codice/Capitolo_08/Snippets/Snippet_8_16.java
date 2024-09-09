package LibroJava.Capitolo8;

class C { }
record Point(int x, int y) { }
enum Color { RED, GREEN, BLUE }

public class Snippet_8_16
{
    public static void main(String[] args)
    {
        // tutti tipi utilizzabili nella selector expression dello switch "avanzato"
        C c = new C(); // un'istanza di una classe: è un tipo riferimento
        Point p = new Point(10, 10); // un record: è un tipo riferimento
        Color col = Color.BLUE; // un enum: è un tipo riferimento
        float f = 11.2f; // un tipo float: dopo l'autoboxing, sarà un tipo riferimento
        int[] values =  { 1, 2, 3 }; // un array: è un tipo riferimento
        long l = 23123L; // un tipo long: dopo l'autoboxing, sarà un tipo riferimento

        // in tutti i sotto-elencati casi, switch ha come tipo della sua selector
        // expression un reference type quale è per l'appunto o (è di tipo Object)
        // in conseguenza ciascuna etichetta case può esprimere la ricerca di una
        // corrispondenza grazie all'utilizzo di un type pattern o per i record
        // di un record pattern
        // questo, a maggior ragione, diventa una caratteristica interessante quando
        // vogliamo verificare tipi non integrali come per esempio i float ma anche
        // tipi non ammessi come i long!
        Object o = p; // o è di tipo Point
        switch (o)
        {
            case null -> System.out.println("Attenzione passato valore nullo!");
            // case con un record pattern
            case Point(int x, int y) -> System.out.printf("[%d, %d]%n", x, y); // [10, 10]
            default -> System.out.println("#");
        }

        o = c; // o è ora di tipo C
        switch (o)
        {
            case null -> System.out.println("Attenzione passato valore nullo!");
            // case con un type pattern
            case C in -> System.out.printf("[%s]%n", in); // [LibroJava.Capitolo8.C@42110406]
            default -> System.out.println("#");
        }

        // assegnamento lecito: o è un Object ed l prima di essere assegnato a o
        // viene convertito in automatico nella corrispondente wrapper class Long
        // che è un tipo riferimento (autoboxing)
        // tuttavia, se o fosse stato di tipo long, non sarebbe stato utilizzabile come tipo
        // della selector expression perché ricordiamo i tipi long non sono consentiti
        o = l; // o è ora di tipo Long
        switch (o)
        {
            case null -> System.out.println("Attenzione passato valore nullo!");
            // case con un type pattern
            case Long number -> System.out.printf("%d%n", number); // 23123
            default -> System.out.println("#");
        }
    }
}
