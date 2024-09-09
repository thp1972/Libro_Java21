package LibroJava.Capitolo3;

public class Snippet_3_17
{
    public static void main(String[] args)
    {
        // costante di tipo int[]
        final int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // OK - modifica degli elementi consentiti
        data[0] = 10;
        
        // ERRORE - data non può far riferimento a un altro array
        data = new int[] { 100, 3330, 440 }; // error: cannot assign a value 
                                             // to final variable data
    }
}
