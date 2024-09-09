package LibroJava.Capitolo19;

class Door
{
    private Door other_door;
    private String door;

    public Door(String p) { door = p; }

    public synchronized void openDoor() // apre una porta 
    {
        try
        {
            Thread.sleep(1000);
            
            System.out.printf("%s ha aperto la %s%n", 
                              Thread.currentThread().getName(),
                              door);
            System.out.printf("%s sta tentando di aprire l'altra porta...%n",
                              Thread.currentThread().getName());
            
            other_door.openOtherDoor();
        }
        catch (InterruptedException ex) { }
    }

    public synchronized void openOtherDoor() // apre l'altra porta 
    {
        try
        {
            Thread.sleep(1000);
            
            System.out.printf("%s ha aperto l'altra porta...%n",
                               Thread.currentThread().getName());
        }
        catch (InterruptedException ex) { }
    }

    public void setOtherDoor(Door other_door)
    {
        this.other_door = other_door;
    }
}

public class Deadlock
{
    public static void main(String[] args)
    {
        Door door_1 = new Door("porta 1");
        Door door_2 = new Door("porta 2");

        door_1.setOtherDoor(door_2);
        door_2.setOtherDoor(door_1);

        // NOTA - è possibile usare una lambda expression
        // new Thread(() -> { door_1.openDoor(); }).start();
        // 
        // ma anche un riferimento a metodo
        // new Thread(door_1::openDoor).start();         
        new Thread(new Runnable() // creo il primo thread 
        {
            public void run() { door_1.openDoor(); }
        }).start();

        // NOTA - è possibile usare una lambda expression
        // new Thread(() -> { door_2.openDoor(); }).start();
        // 
        // ma anche un riferimento a metodo
        // new Thread(door_2::openDoor).start();          
        new Thread(new Runnable() // creo il secondo thread 
        {
            public void run() { door_2.openDoor(); }
        }).start();
    }
}
