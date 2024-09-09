package LibroJava.Capitolo7;

class SomeData
{
    // campi statici privati
    private static int a = 12;
    private static int b;
    private static String msg;

    static // inizializzatore statico
    {
        msg = "Inizializzazione: ";
        System.out.println(msg);
        b = 4;
    }

    public static void foo(int x) // metodo statico
    {
        System.out.printf("[ x = %d, a = %d, a/b = %d ]%n", x, a, a / b);
    }
}

public class StaticInitializers
{
    public static void main(String[] args)
    {
        SomeData.foo(42);
        SomeData.foo(45);
    }
}
