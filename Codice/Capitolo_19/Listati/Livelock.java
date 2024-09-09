package LibroJava.Capitolo19;

class Corridor
{
    private boolean free;

    public void enterIntoHall() // entrata nella hall 
    {
        System.out.printf("%s entra nella hall...%n",
                          Thread.currentThread().getName());
        
        try { Thread.sleep(2000);}
        catch (InterruptedException ex) { }

        checkCorridor(); // il corridoio è libero? 
    }

    public synchronized void checkCorridor()
    {
        System.out.printf("%s verifica se il corridoio è libero...%n",
                          Thread.currentThread().getName());
        
        try { wait(1000); }
        catch (InterruptedException ex) { }

        if (!free) // se il corridoio non è libero spostati 
        {
            System.out.printf("%s rileva che il corridoio non è libero...%n",
                               Thread.currentThread().getName());
            
            try { wait(1000); }
            catch (InterruptedException ex) { }

            moveToSide();
        }

        walkIntoCorridor(); // cammina nel corridoio solo se è libero!!! 
    }

    public synchronized void moveToSide() // movimento di lato 
    {
        System.out.printf("%s si muove di lato per renderlo disponibile...%n",
                          Thread.currentThread().getName());
        
        try { wait(1000); }
        catch (InterruptedException ex) { }
        
        returnToCorridor(); // verifica nuovamente se il corridoio è libero 
    }

    public synchronized void returnToCorridor()
    {
        System.out.printf("%s ritorna verso il corridoio...%n",
                          Thread.currentThread().getName());
        
        try { wait(1000); }
        catch (InterruptedException ex) { }

        checkCorridor();
    }

    public synchronized void walkIntoCorridor() // cammina nel corridoio 
    {
        System.out.printf
        ("%s rileva che il corridoio è libero e inizia a camminare nel corridoio...%n",
        Thread.currentThread().getName()); 
    } 
} 

public class Livelock
{
    public static void main(String[] args)
    {
        Corridor cor = new Corridor(); 

        // NOTA - è possibile usare una lambda expression
        // Thread one = new Thread(() -> { cor.enterIntoHall(); } , "Dario");
        //
        // ma anche un riferimento a metodo      
        // Thread one = new Thread(cor::enterIntoHall, "Dario");       
        Thread one = new Thread(new Runnable() // creo il primo thread 
        {
            public void run() { cor.enterIntoHall(); }
        }, "Dario");
        one.start();

        // NOTA - è possibile usare una lambda expression
        // Thread two = new Thread(() -> { cor.enterIntoHall(); }  "Francesco");
        //
        // ma anche un riferimento a metodo      
        // Thread two = new Thread(cor::enterIntoHall, "Francesco");   
        Thread two = new Thread(new Runnable() // creo il secondo thread 
        {
            public void run() { cor.enterIntoHall(); }
        }, "Francesco");
        two.start();
    }
}
