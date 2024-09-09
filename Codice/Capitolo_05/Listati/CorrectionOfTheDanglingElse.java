package LibroJava.Capitolo5;

public class CorrectionOfTheDanglingElse
{
    public static void main(String[] args)
    {
        int a = 9, b = 3;

         // OK - dangling else corretto!
        if (a > 10)
        {
            if (b > 10)
                System.out.println("a e b > 10"); // se a e b sono maggiori di 10 
        }
        else
            System.out.println("a < 10");
    }
}
