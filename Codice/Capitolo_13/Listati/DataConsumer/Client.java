package client;

import exportsprovider.ExportsProvider;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Client extends ExportsProvider
{
    public int exportsSum()
    {
        int sum = 0;

        // OK - accesso consentito ai campi data_1 e data_2 perché sono
        // public e protected
        // non è dunque possibile accedere ai campi data_3 e data_4 neppure se
        // usiamo la API della reflection; per esempio il seguente codice:
        // ExportsProvider.class.getDeclaredField("data_4").setAccessible(true);
        // genererà l'eccezione java.lang.reflect.InaccessibleObjectException      
        // Unable to make field int exportsprovider.ExportsProvider.data_4 accessible:
        // module dataprovider does not "opens exportsprovider" to module dataconsumer
        sum = data_1 + data_2;
        return sum;
    }

    public int opensSum()
    {
        int sum = 0;
        try
        {
            // crea un'istanza di tipo opensprovider.OpensProvider per poi utilizzarla
            // con la reflection
            Class<?> cls = Class.forName("opensprovider.OpensProvider");
            Object _obj = cls.getConstructors()[0].newInstance();

            // ritorna un array dei campi dichiarati in opensprovider.OpensProvider
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields)
            {
                // OK - nessun'eccezione; il package opensprovider è stato aperto e dunque la 
                // reflection è possibile su tutti i suoi tipi e membri dei tipi
                field.setAccessible(true);
                sum += field.getInt(_obj);
            }            
        } 
        catch (ClassNotFoundException | IllegalAccessException | 
               InstantiationException | InvocationTargetException exc) 
        { System.out.println(exc); }
        return sum;
    }

    public static void main(String[] args)
    {
        Client client = new Client();

        System.out.printf("Somma di data... in ExportsProvider: %d%n",
                          client.exportsSum());

        System.out.printf("Somma di data... in OpensProvider: %d%n",
                          client.opensSum());
    }
}
