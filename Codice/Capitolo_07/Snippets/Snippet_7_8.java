package LibroJava.Capitolo7;

import java.util.Random;

// gli identificatori dei campi costanti sono stati scritti seguendo 
// la naming convention di Java ossia:
// in maiuscolo e con il carattere di underscore _ che separa le 
// eventuali parole che li possono costituire
class Data
{
    // campo di istanza readonly:
    // non è necessario inizializzarlo contestualmente alla sua dichiarazione
    // in questo caso è però obbligatorio dargli un valore nell'inizializzatore
    // di istanze oppure in un costruttore di istanza pena la generazione di 
    // un apposito errore di compilazione
    private final int NUMBER_1;

    // campo di istanza readonly:
    // OK - consentito assegnare direttamente un valore a un campo readonly
    public final int DELTA_1 = 2;

    // campo statico readonly:
    // non è necessario inizializzarlo contestualmente alla sua dichiarazione
    // in questo caso è però obbligatorio dargli un valore nell'inizializzatore
    // statico pena la generazione di un apposito errore di compilazione
    public static final int DELTA_2;

    // campo statico readonly:
    // OK - consentito assegnare direttamente un valore a un campo readonly
    private static final int NUMBER_2 = new Random().nextInt(1000);

    public Data() // costruttore di istanza
    {
        // OK - nel costruttore permesso assegnamento del valore a
        // un campo readonly
        NUMBER_1 = 1000;
    }

    static // inizializzatore statico
    {
        // OK - nell'inizializzatore statico permesso assegnamento del valore a
        // un campo readonly
        DELTA_2 = 3;
    }

    public int getSum()
    {
        // OK - tutte referenziazioni lecite dei campi di sola lettura
        return NUMBER_1 + this.NUMBER_1 + NUMBER_2 + Data.NUMBER_2;
    }
}

public class Snippet_7_8
{
    public static void main(String[] args)
    {
        // OK - referenziazione del campo di istanza readonly tramite c.r
        Data d = new Data();
        int _d_1 = d.DELTA_1; // 2

        // OK - referenziazione del campo statico readonly tramite C.r
        int _d_2 = Data.DELTA_2; // 3
    }
}
