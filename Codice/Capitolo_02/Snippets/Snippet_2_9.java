package LibroJava.Capitolo2;

public class Snippet_2_9
{
    public static void main(String[] args)
    {
        // CORRETTO - costante inizializzata contestualmente alla sua dichiarazione
        final float PI = 3.14159f; // constant variable
        
        // CORRETTO - costante inizializzata contestualmente alla sua dichiarazione
        final String name = "Pellegrino"; // constant variable

        // ERRORE - il valore della costante non può cambiare dopo la sua prima inizializzazione
        PI = 3.15; // error: cannot assign a value to final variable PI

        // ERRORE - sintassi alternativa NON accettata
        short final COUNT  = 10; // error: not a statement

        // CORRETTO - una costante può non essere contestualmente inizializzata
        final int FLAG; // blank final
        FLAG = 1000;    
        
        // CORRETTO - il valore da assegnare a una costante può derivare anche da 
        // un'espressione non costante
        final double DYN = Math.sqrt(44.44);
    }
}
