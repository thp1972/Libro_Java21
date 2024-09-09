package LibroJava.Capitolo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// non è necessario usare gli specificatori public ma per maggiore
// chiarezza del codice li impieghiamo comunque
interface Debuggable
{
    // implicitamente public e static
    public enum Destination { File, Console };

    // implicitamente public
    public default void debugOnFile(String file, String message)
    {
        debug(Destination.File, file, message);
    }

    // implicitamente public
    public default void debugOnConsole(String message)
    {
        debug(Destination.Console, null, message);
    }

    // metodo private ad uso esclusivo dei metodi dell'interfaccia
    private void debug(Destination dest, String file, String message)
    {
        switch(dest)
        {
            case File:
                try
                {
                    Files.write(Paths.get("./" + file), message.getBytes());
                }
                catch(IOException exc){ System.out.println(exc); }
                break;
            case Console:
                System.out.println(message);
                break;
        }
    }
}

class Numbers implements Debuggable
{
    private int number_1;
    private int number_2;

    public Numbers(int number_1, int number_2)
    {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }
    
    public void makeSum()
    {
        int res = number_1 + number_2;
        debugOnFile("debug.txt", "number_1 + number_2 = " + res);
    }
}

public class Snippet_10_16
{
    public static void main(String[] args)
    {
        // nel file debug.txt saranno scritti i caratteri: number_1 + number_2 = 200
        new Numbers(100, 100).makeSum();
    }
}
