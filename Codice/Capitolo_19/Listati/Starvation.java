package LibroJava.Capitolo19;

import java.util.Random;

class Buffer
{
    private int[] data = new int[20];

    public synchronized void initData() // inizializza i dati 
    {
        System.out.printf("%s sta inizializzando l'array...%n", 
                           Thread.currentThread().getName());
        
        for (int i = 0; i < data.length; i++)
        {
            data[i] = new Random().nextInt(500); // genera un valore random 
        }
        readData();
    }

    public synchronized void readData() // legge i dati 
    {
        System.out.printf("%s sta leggendo l'array...%n", 
                           Thread.currentThread().getName());
        
        for (int i = 0; i < data.length; i++)
        {
            int j = data[i] * new Random().nextInt(20); // scrive il dato rielaborandolo 
            while (!writeData(i, j));
        }
    }

    public synchronized boolean writeData(int ix, int d) // scrive i dati 
    {
        System.out.printf("%s sta scrivendo nell'array...%n",
                          Thread.currentThread().getName());
        data[ix] = d;
        return false; // causa un ciclo infinito 
    }
}

public class Starvation
{
    public static void main(String[] args)
    {
        Buffer ba = new Buffer();

        // NOTA - è possibile usare una lambda expression
        // ...new Thread(() -> { ba.initData(); });
        // 
        // ma anche un riferimento a metodo
        // ...new Thread(ba::initData);         
        Thread one = new Thread(new Runnable() // creo il primo thread 
        { 
             public void run() { ba.initData(); } 
        }); 
        one.setPriority(Thread.MAX_PRIORITY);
        one.start();

        // NOTA - è possibile usare una lambda expression
        // ...new Thread(() -> { ba.initData(); });
        // 
        // ma anche un riferimento a metodo
        // ...new Thread(ba::initData);      
        Thread two = new Thread(new Runnable() // creo il secondo thread 
        {
            public void run() { ba.initData(); }
        });
        two.setPriority(Thread.MIN_PRIORITY);
        two.start();
    }    
}
