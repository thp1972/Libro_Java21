package LibroJava.Capitolo3;

public class Snippet_3_4
{
    public static void main(String[] args)
    {
        // array initializer - I forma
        int[] a = new int[] { 1, 2, 4 };
        
        // ERRORE - non è possibile indicare il numero di elementi nell'espressione
        // di creazione dell'array se si usa anche un inizializzatore di array
        int[] a_2 = new int[3] { 1, 2, 4 }; // error: not a statement
         
        // array initializer - II forma
        int[] b = { 2, 3, 4 };
    }
}