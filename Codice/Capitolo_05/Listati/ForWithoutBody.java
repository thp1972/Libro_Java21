package LibroJava.Capitolo5;

public class ForWithoutBody
{
    public static void main(String[] args)
    {
        int val_max = 100, i;

         for (i = 0; i < val_max; i++) // ciclo senza corpo
            ; // istruzione nulla

         System.out.printf("i = %d%n", i); // i vale 100!!!
    }
}
