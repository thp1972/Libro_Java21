package LibroJava.Capitolo1;

/*
Primo programma in Java
 */
public class FirstProgram
{
    private static int counter = 10;
    private static final int multiplicand = 10;
    private static final int multiplier = 20;

    public static void main(String[] args)
    {
        // dichiarazione e inizializzazione contestuale
        // di più variabili di diverso tipo
        String text_1 = "Primo programma in Java:",
               text_2 = " Buon divertimento!";
        int a = 10, b = 20;

        float f; // dichiarazione
        f = 44.5f; // inizializzazione

        // stampa qualcosa... 
        System.out.printf("%s%s%n", text_1, text_2);
        System.out.printf("Stamperò un test condizionale tra a=%d e b=%d%n", a, b);

        if (a < b) // se a < b stampa quello che segue...
        {
            System.out.print("a < b VERO!");
        }
        else /* altrimenti stampa quest'altra stringa */
        {
            System.out.print("a > b VERO!");
        }

        System.out.print("\nStamperò un ciclo iterativo, dove leggerò ");
        System.out.println("per 10 volte il valore di a");

        /*
         * ciclo for
         */
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Passo %d ", i);
            System.out.printf("--> a=%d%n", a);
        }
        
        /*
            // esecuzione della moltiplicazione
        */
        System.out.printf("Ora eseguirò una moltiplicazione tra %d e %d%n", 
                          multiplicand, multiplier);
        
        int res = mult(multiplicand, multiplier); // invocazione di un metodo
        System.out.printf("Il risultato di %d x %d è: %d%n",
                          multiplicand, multiplier, res);        
    }
    
    /****************************************
    * Metodo: mult                          *
    * Scopo: moltiplicazione di due valori  *
    * Parametri: a, b -> int                *
    * Restituisce: int                      *
    ****************************************/
    private static int mult(int a, int b)
    {
        return a * b;
    }
}