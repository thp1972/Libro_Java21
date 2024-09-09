package LibroJava.Capitolo19;

import java.util.Random;

class Buffer
{
    private int data[]; // dato condiviso 
    private int nr_elem = 10; // max elem. di default 
    private boolean empty = true; // stato buffer all'inizio 

    public Buffer(int elem) // inizializzo il buffer 
    {
        if (elem != -1)
        {
            data = new int[elem];
            nr_elem = elem;
        }
        else
            data = new int[nr_elem];
    }

    public void write(int ix) // scrivo nel buffer; no sync
    {
        data[ix] = ix; // scrivo il dato 
        
        System.out.printf("%s ha scritto all'indice %d il valore: %d%n",
                           Thread.currentThread().getName(),
                           ix, 
                           data[ix]);
    }

    public int read(int ix) // leggo dal buffer; no sync
    {      
        System.out.printf("%s ha letto all'indice %d il valore: %d%n",
                          Thread.currentThread().getName(),
                          ix,
                          data[ix]);        
        return data[ix];        
    }

    public int getBufferElements() { return nr_elem; }
}

class RunProducer implements Runnable // Runnable per il thread 1 
{
    private Buffer b;

    public RunProducer(Buffer b) { this.b = b; }

    public void run()
    {
        for (int i = 0; i < b.getBufferElements(); i++)
        {
            Random r = new Random();
            int ms = r.nextInt(5000);
            try
            {
                Thread.sleep(ms); // un po' di attesa... 
                b.write(i);
            }
            catch (InterruptedException ex) { }
        }
    }
}

class RunConsumer implements Runnable // Runnable per il thread 2 
{
    private Buffer b;

    public RunConsumer(Buffer b) { this.b = b; }

    public void run()
    {
        for (int i = 0; i < b.getBufferElements(); i++)
        {
            Random r = new Random();
            int ms = r.nextInt(1500);
            try
            {
                Thread.sleep(ms); // un po' di attesa... 
                b.read(i);
            }
            catch (InterruptedException ex) { }
        }
    }
}

public class CoopUnSynchronizedThread
{
    public static void main(String[] args)
    {
        Buffer b = new Buffer(-1); // buffer 

        Thread t_1 = new Thread(new RunProducer(b), "PRODUCER"); // creo il PRODUCER 
        Thread t_2 = new Thread(new RunConsumer(b), "CONSUMER"); // creo il CONSUMER 

        // avvio i thread 
        t_1.start();
        t_2.start();
    }
}
