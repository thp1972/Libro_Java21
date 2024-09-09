package LibroJava.Capitolo2;

public class PrintIntegerTypes
{
    public static void main(String[] args)
    {
        // tipi di dato intero considerando i valori garantiti dallo standard Java
        byte b = 127;
        short s = -10000;
        int i = -2000004350;
        long l = -4223672038854775808L;

        System.out.printf("byte:%5d%n", b);
        System.out.printf("short:%7d%n", s);
        System.out.printf("int:%14d%n", i);
        System.out.printf("long:%22d%n", l);
    }
}
