package LibroJava.Capitolo5;

public class DanglingElse
{
    public static void main(String[] args)
    {
        int a = 9, b = 3;

         // ATTENZIONE - dangling else: non viene stampato nulla!
        if (a > 10)
            if (b > 10)
                System.out.println("a e b > 10"); // eseguita se a e b sono maggiori di 10 
            else
                System.out.println("a < 10");
    }
}
