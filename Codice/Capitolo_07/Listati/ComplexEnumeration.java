package LibroJava.Capitolo7;

enum OS
{
    WINDOWS("10"),
    LINUX("Fedora 25"),
    MAC("Sierra"); // qui punto e virgola, IMPORTANTE! 

    private final String title;

    // un costruttore non può contenere gli specificatori di accesso
    // public e protected; esso, in assenza di specificatori,
    // è implicitamente private
    OS(String t) { title = t; }

    public String getTitle() { return title; }
}

public class ComplexEnumeration
{
    public static void main(String[] args)
    {
        System.out.println("Tipi di OS: ");

        // è interessante notare l'uso dello specificatore di formato %s
        // per l'argomento os; ciò è perfettamente lecito perché la valutazione
        // di os ritornerà una stringa che rappresenterà il nome della corrente
        // costante di enumerazione (per esempio, WINDOWS, ecc.)
        for (OS os : OS.values()) // eseguiamo un ciclo nell'array di OS 
            System.out.printf("[ %s %s ]%n", os, os.getTitle());

        System.out.print("OS scelto: ");

        OS a_s = OS.MAC; // assegniamo un valore di OS 
        switch (a_s) // stampiamo quello scelto 
        {
            case WINDOWS: System.out.println("Windows... "); break;
            case LINUX:   System.out.println("Linux... "); break;
            case MAC:     System.out.println("Mac... "); break;
        }
    }
}
