package LibroJava.Capitolo7;

class Data
{
    // ATTENZIONE - è solo per motivi di snellezza dell'esempio
    // che si sono dichiarati dei campi pubblicamente accessibili!
    // come più volte detto è buona norma renderli sempre privati e
    // accessibili solo tramite dei metodi pubblici
    public int number;
    public static int counter;

    public Data() { counter++; } // ogni invocazione del costruttore
                                 // incrementerà counter e tale dato
                                 // sarà condiviso da ciascuna istanza
}

public class Snippet_7_6
{
    public static void main(String[] args)
    {
        // ogni istanza di Data avrà una copia privata del membro di istanza number
        // tuttavia ciascuna istanza condividerà la stessa locazione di memoria
        // del membro statico counter
        Data d1 = new Data(); // counter = 1
        d1.number = 100;
        Data d2 = new Data(); // counter = 2
        d2.number = 200;
        Data d3 = new Data(); // counter = 3  
        d3.number = 300;
        Data d4 = new Data(); // counter = 4
        d4.number = 400;
        
        // qui Data.counter varrà 4 anche se al tempo di creazione di d1 valeva 1
        // quell'area di memoria è infatti, condivisa tra tutti gli oggetti
        // e ogni sua modifica sarà sempre "aggiornata" per tutti gli oggetti
        int value = d1.number + Data.counter; // 104
    }
}
