package LibroJava.Capitolo7;

enum OS
{
    WINDOWS, // valore ordinale 0 (primo)
    LINUX,   // valore ordinale 1 (secondo)
    MAC      // valore ordinale 2 (terzo)
}

public class Snippet_7_11
{
    public static void main(String[] args)
    {
        OS os_1 = OS.WINDOWS;

        // ritorna -1 perché WINDOWS ha una posizione ordinale inferiore
        // rispetto a LINUX
        System.out.printf("%d%n", os_1.compareTo(OS.LINUX)); // -1

        OS os_2 = OS.WINDOWS;

        // nel caso delle enumerazioni equals ed == ritornano lo stesso risultato
        System.out.printf("%b%n", os_1.equals(os_2)); // true
        System.out.printf("%b%n", os_1 == os_2); // true

        System.out.printf("%s%n", os_1.name()); // WINDOWS

        for (OS os : OS.values())
        {
            // ritorna, in successione, i valori 0,1 e 2
            System.out.printf("%d%n", os.ordinal());
        }
    }
}
