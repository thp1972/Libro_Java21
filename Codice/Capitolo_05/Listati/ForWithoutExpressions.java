package LibroJava.Capitolo5;

public class ForWithoutExpressions
{
    public static void main(String[] args)
    {
        int a = 8;

        System.out.print("a = [ ");

        for (;;) // ciclo infinito che è interrotto dal break
        {
            if (a < 0)
                break; // senza questa istruzione il ciclo diventa infinito
            System.out.printf("%d ", a--);
        }

        System.out.println("]");
    }
}
