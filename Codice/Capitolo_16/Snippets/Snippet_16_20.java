package LibroJava.Capitolo16;

public class Snippet_16_20
{
    public static void main(String[] args)
    {
        String s1 = "Sono una stringa!";
        
        // l'array c sarà inizializzato con 20 caratteri con valore '\u0000'
        // dopo l'esecuzione del metodo getChars i caratteri string si troveranno
        // dalla posizione 5 alla posizione 10
        char c[] = new char[20];
        
        // è importante precisare che il valore dell’indice finale deve essere sempre 
        // a una posizione in più rispetto al valore dell’indice del carattere scelto
        // infatti, nel nostro caso, abbiamo scritto il valore d’indice 15 per identificare
        // il carattere g che invece ha un valore d’indice pari a 14
        s1.getChars(9, 15, c, 5); // c =     string        
    }
}
