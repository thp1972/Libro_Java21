package LibroJava.Capitolo19;

class MakeOperations
{
    private int data; // dato condiviso 

    public synchronized void doOp(int v)
    {
        System.out.printf("Il valore del dato dal thread %s è di ",
                          Thread.currentThread().getName());
        
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000); // un po' di attesa... 
                data += v;
                System.out.print(i != 4 ? getRes() + " " : getRes() + "\n");
            }
            catch (InterruptedException ex) { }
        }
    }
    
    public synchronized int getRes() { return data; }
}

class RunThread1 implements Runnable // Runnable per il thread 1 
{
    private MakeOperations mop;

    public RunThread1(MakeOperations mop) { this.mop = mop; }

    public void run() { mop.doOp(10); } // somma 
}

class RunThread2 implements Runnable // Runnable per il thread 2 
{
    private MakeOperations mop;

    public RunThread2(MakeOperations mop) { this.mop = mop; }

    public void run() { mop.doOp(-10); } // sottrazione 
}

public class SynchronizedThread
{
    public static void main(String[] args)
    {
        MakeOperations mop = new MakeOperations(); // oggetto per eseguire 
                                                   // delle operazioni 

        Thread t_1 = new Thread(new RunThread1(mop), "T_SOMMA");
        Thread t_2 = new Thread(new RunThread2(mop), "T_SOTTRAZIONE");

        // avvio i thread 
        t_1.start();
        t_2.start();
    }
}
