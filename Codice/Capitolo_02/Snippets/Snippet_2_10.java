package LibroJava.Capitolo2;

public class Snippet_2_10
{
    public static void main(String[] args)
    {
        int d = 10_000_000; // in base decimale con separatore 
        int o = 010; // in base ottale 
        int x = 0x10; // in base esadecimale 
        int b = 0B0000_1111; // in base binaria con separatore 

        System.out.printf("%d%n", d); // 10000000
        System.out.printf("%d%n", o); // 8
        System.out.printf("%d%n", x); // 16
        System.out.printf("%d%n", b); // 15 
    }
}
