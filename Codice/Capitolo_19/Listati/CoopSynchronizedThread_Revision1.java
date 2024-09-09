package LibroJava.Capitolo19;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Buffer
{
    private int data[]; // dato condiviso 
    private int nr_elem = 10; // max elem. di default 
    private boolean empty = true; // stato buffer all'inizio 
    private Lock object_lock; // lock
    private Condition write_condition; // condizioni per il lock
    private Condition read_condition;

    public Buffer(int elem) // inizializzo il buffer 
    {
        if (elem != -1)
        {
            data = new int[elem];
            nr_elem = elem;
        }
        else
            data = new int[nr_elem];
        
        object_lock = new ReentrantLock(); // creo un oggetto per il lock
 
        // creo gli oggetti condizione
        write_condition = object_lock.newCondition();
        read_condition = object_lock.newCondition();
    }

    public void write(int ix) throws InterruptedException // scrivo nel buffer 
    {
        object_lock.lock(); // acquisisco il lock sull'oggetto
        try
        {
            while (!empty) // finché il consumer non ha letto il dato, aspetto 
            {
                System.out.printf("%s attende che CONSUMER legga il dato...%n",
                                  Thread.currentThread().getName());
                write_condition.await();// aspetto
            }

            data[ix] = ix; // scrivo il dato 

            empty = false; // aggiorno lo stato 

            System.out.printf("%s ha scritto all'indice %d il valore: %d%n",
                              Thread.currentThread().getName(),
                              ix,
                              data[ix]);
            read_condition.signal(); // notifico il reader che può leggere
        }
        finally  { object_lock.unlock(); /* rilascia il lock */ }
    }

    public int read(int ix) throws InterruptedException // leggo dal buffer
    {
        object_lock.lock(); // acquisisco il lock sull'oggetto
        try
        {
            while (empty) // finché il producer non ha scritto il dato aspetto 
            {
                System.out.printf("%s attende che PRODUCER scriva il dato...%n",
                                  Thread.currentThread().getName());
                read_condition.await(); // aspetto
            }

            empty = true; // aggiorno lo stato 

            System.out.printf("%s ha letto all'indice %d il valore: %d%n",
                              Thread.currentThread().getName(),
                              ix,
                              data[ix]);
                     
            write_condition.signal(); // notifico il writer che può scrivere
        }
        finally { object_lock.unlock(); /* rilascia il lock */ }      
        
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
            int ms = r.nextInt(5000);
            try
            {
                Thread.sleep(ms); // un po' di attesa... 
                b.read(i);
            }
            catch (InterruptedException ex) { }
        }
    }
}

public class CoopSynchronizedThread_Revision1
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