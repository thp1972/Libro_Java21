package LibroJava.Capitolo3;

public class Snippet_3_5
{
    public static void main(String[] args)
    {
        final int SIZE = 10;
        int[] c = new int[SIZE];
        int u = 2, z = 4;
        c[1] = 333; // scrivo alla posizione con indice 1

        int x = c[u + z]; // leggo dalla posizione con indice 6

        // ATTENZIONE - accedo a un indice non valido
        // gli indici validi possono essere, infatti, solo tra 0 e 9
        c[10] = 1000; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
    }
}
