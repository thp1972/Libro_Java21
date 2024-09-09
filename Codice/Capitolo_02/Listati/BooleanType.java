package LibroJava.Capitolo2;

public class BooleanType
{
    public static void main(String[] args)
    {
        int a = 82, b = 90;

        // il simbolo != rappresenta l'operatore "non uguale a"
        boolean b1 = 10 != 0,
                b2 = -22 != 0,
                b3 = '\u0000' != 0, // ASCII code carattere NUL
                b4 = 'A' != 0,
                b5 = a < b; // valutazione di un'espressione

        System.out.printf("b1 è %b%n", b1);
        System.out.printf("b2 è %b%n", b2);
        System.out.printf("b3 è %b%n", b3);
        System.out.printf("b4 è %b%n", b4);
        System.out.printf("b5 è %b%n", b5);
    }
}
