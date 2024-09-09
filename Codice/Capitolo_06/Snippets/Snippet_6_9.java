package LibroJava.Capitolo6;

public class Snippet_6_9
{
    public static void makeDivision(double dividend, double divisor)
    {
        // ritorno per evitare una divisione per 0 e l'istruzione printf
        // successiva non sarà mai eseguita
        if (divisor == 0)
            return; // return è posto in questo punto del codice 
                    // e non necessariamente alla fine

        System.out.printf("Il risultato della divisione tra %.1f e %.1f è: %.1f%n",
                          dividend, divisor, dividend / divisor);
    }

    public static void main(String[] args)
    {
         // divisione per 0...
         makeDivision(110, 0); 
         makeDivision(22.2, 11.1); // Il risultato della divisione tra 22,2 e 11,1 è: 2,0
    }
}
