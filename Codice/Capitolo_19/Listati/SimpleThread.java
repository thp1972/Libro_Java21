package LibroJava.Capitolo19;

import java.util.Random;

class DoJobRun implements Runnable // run tramite l'interfaccia Runnable 
{
    private final String MSG = "sarà occupato per i prossimi";

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                int ms = 6000; // 6 secondi 
                System.out.printf("%s %s %d millisecondi%n",
                                  Thread.currentThread().getName(),
                                  MSG, ms);
                Thread.sleep(ms); // metti in timed waiting il thread 
                                  // per n millisecondi 
            }
            catch (InterruptedException ex) { }
        }
    }
}

class DoJobTh extends Thread // run tramite la classe Thread 
{
    private final String MSG = "sarà occupato per i prossimi";

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Random r = new Random();
                int ms = r.nextInt(3000); // random tra 0 e 3 secondi 
                System.out.printf("%s %s %d millisecondi%n", getName(), MSG, ms);
                Thread.sleep(ms); // metti in timed waiting il thread 
                                  // per n millisecondi 
            }
            catch (InterruptedException ex) { }
        }
    }
}

public class SimpleThread
{
    public static void main(String[] args)
    {
        DoJobRun job = new DoJobRun(); // creo il primo thread 
        Thread thread_1 = new Thread(job, "***THREAD 1***");
        thread_1.start();

        DoJobTh thread_2 = new DoJobTh(); // creo il secondo thread 
        thread_2.setName("***THREAD 2***");
        thread_2.start();

        System.out.printf("Thread principale (%s) finito%n",
                          Thread.currentThread().getName());
    }
}
