package client;

import java.util.Iterator;
import java.util.ServiceLoader;
import operations.spi.Operations;

public class Client
{
    public static void main(String[] args)
    {
        // crea un nuovo servizio di loader per Operations
        ServiceLoader<Operations> loader = ServiceLoader.load(Operations.class);

        // carica e istanzia i service provider trovati dal servizio di loader
        // per la service interface Operations
        Iterator<Operations> iterator = loader.iterator();
        while (iterator.hasNext())
        {
            // a runtime op conterrà il corrente service provider trovato...
            Operations op = iterator.next();
            System.out.printf("%s = %d%n", op.getName(), op.getResult(10, 19));
        }
    }
}
