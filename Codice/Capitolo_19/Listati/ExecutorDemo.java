package LibroJava.Capitolo19;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// call tramite una classe che implementa l'interfaccia Callable<V>
class Calculator implements Callable<Integer>
{
    private final String MSG = " sta eseguendo la computazione...";
    private int ris;

    public Integer call() // metodo che ritorna il risultato della computazione 
    {
        try
        {
            int ms = 5000 + new Random().nextInt(2000);
            System.out.printf("%s e terminerà tra %d millisecondi%n",
                               Thread.currentThread().getName() + MSG,
                               ms);
            
            Thread.sleep(ms); // metti in timed waiting il thread per n millisecondi 
        }
        catch (InterruptedException ex) { ris = -1; }
        finally // ritorna il risultato della computazione 
        {
            Random rnd = new Random();
            ris = rnd.nextInt(5686) + rnd.nextInt(1000);
            return ris;
        }
    }
}

public class ExecutorDemo
{
    public static void main(String[] args) throws InterruptedException 
    {
        // creo un esecutore con un pool di tipo cached 
        ExecutorService exec = Executors.newCachedThreadPool();
        
        // creo un esecutore che eseguirà i task dopo un certo periodo di tempo... 
        ScheduledExecutorService exec_sched = Executors.newScheduledThreadPool(2);
        
        // creo dei task 
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calc4 = new Calculator();
        
        // eseguirò i task di calc1 e calc2 
        Future<Integer> ris1 = exec.submit(calc1);
        Future<Integer> ris2 = exec.submit(calc2);
        
        // tra 2 minuti esegui i task di calc3 e calc4 
        ScheduledFuture<Integer> ris3 = exec_sched.schedule(calc3, 120, TimeUnit.SECONDS);
        ScheduledFuture<Integer> ris4 = exec_sched.schedule(calc4, 120, TimeUnit.SECONDS);
        
        // non accettare più alcun task 
        exec.shutdown();
        exec_sched.shutdown();
        
        try // risultato della computazione 
        {
            System.out.printf("calc1 ha come risultato della computazione il valore: %d%n",
                              ris1.get());
            System.out.printf("calc2 ha come risultato della computazione il valore: %d%n",
                              ris2.get());
            System.out.printf("calc3 ha come risultato della computazione il valore: %d%n",
                              ris3.get());
            System.out.printf("calc4 ha come risultato della computazione il valore: %d%n",
                              ris4.get());
        }
        catch (ExecutionException ex) { }
    }
}
