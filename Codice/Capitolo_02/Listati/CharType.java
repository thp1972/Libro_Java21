package LibroJava.Capitolo2;

import java.io.IOException;

public class CharType
{
    // throws è una keyword del linguaggio Java usabile nel contesto delle 
    // "eccezioni software" che saranno trattate nel Capitolo 11, Eccezioni e asserzioni
    // in questo ambito possiamo comunque accennare quanto segue:
    // dato che il metodo read potrebbe generare un'eccezione di tipo IOException
    // (un errore cioè di input/output) che però il metodo main decide di non "catturare
    // e gestire direttamente", ne notifica questa possibilità, tramite throws, al suo metodo
    // chiamante in modo che possa decidere il giusto comportamento (la gestirà lui?)
    // (in questo caso "il metodo chiamante" il main sarà la JVM stessa che però terminerà il programma)
    public static void main(String[] args) throws IOException // avvisa che delle statement nel suo
                                                              // body (il metodo read) possono generare
                                                              // un'eccezione IOException
    {
        System.out.printf("Digita un carattere in \"minuscolo\" [ ]\b\b");

        // ottiene un carattere dallo standard input in
        // che, ricordiamo, è un campo della classe System di tipo InputStream  
        int ch = System.in.read(); // può generare un'eccezione di tipo IOException a causa
                                   // cioè di un eventuale errore di input/output 

        // ne stampa una sua rappresentazione in maiuscolo
        int ch_U = toUpper(ch);

        System.out.printf("Maiuscolo del carattere %c digitato: %c [%d]\n", ch, ch_U, ch_U);
    }

    // converte un carattere in maiuscolo
    public static int toUpper(int ch)
    {
        if ('a' <= ch && ch <= 'z')
            return ch - 'a' + 'A';

        return ch; // se già maiuscolo o altro carattere restituiscilo direttamente
    }
}
