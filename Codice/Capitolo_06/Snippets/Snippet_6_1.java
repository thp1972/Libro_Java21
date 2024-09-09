package LibroJava.Capitolo6;

public class Snippet_6_1
{
    // definizione della funzione cube
    private static long cube(long number)
    {
        long res; // variabile locale e privata alla funzione cube
        res = number * number * number; // algoritmo
        return res; // restituisce al chiamante il risultato della computazione
    }

    // definizione della funzione sqrt
    // usiamo la libreria matematica di Java 
    // e pertanto il nostro metodo è solo un "wrapper"
    public static double sqrt(double number)
    {
        final int MAX = 11; // costanti
        double val; // variabili
        val = number; // istruzioni
        return Math.sqrt(val); // valore restituito
    }

    public static void main(String[] args)
    {
    }
}
