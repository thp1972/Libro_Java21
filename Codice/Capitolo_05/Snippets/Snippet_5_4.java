package LibroJava.Capitolo5;

public class Snippet_5_4
{
    public static void main(String[] args)
    {
        int a = -5;
        if (a == -5) ;
            System.out.println("-5"); 
        else // ERRORE - error: 'else' without 'if'
            System.out.println("non -5");
    }
}
