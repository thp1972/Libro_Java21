package LibroJava.Capitolo7;

class FileManager
{
    public FileManager() // costruttore di default esplicito
    {
        // operazioni di inizializzazione dei campi...
        System.out.println("Invocato il costruttore di FileManager...");
    }

    // finalizzatore: notare l'assenza di un tipo restituito e di una 
    // lista di parametri formali
    protected void finalize()
    {
        // operazioni di cleanup delle risorse; tipo un file
        System.out.println("Invocato il finalizzatore di FileManager...");
    }
}

public class Finalizer
{
    public static void main(String[] args)
    {
        // alloca in memoria un oggetto di tipo FileManager
        FileManager fm = new FileManager();

        // l'oggetto di tipo FileManager riferito da fm è ora senza
        // alcun'altra variabile che vi faccia riferimento
        // in questo modo facciamo sì che esso diventi eleggibile pe la finalizzazione
        fm = null;

        // totalMemory è un metodo della classe java.lang.Runtime che ritorna, in byte,
        // la quantità di memoria allocata per gli oggetti correnti più quella 
        // disponibile per gli oggetti futuri
        // freeMemory è un metodo della classe java.lang.Runtime che ritorna, in byte,
        // la quantità di memoria a disposizione per gli oggetti futuri
        // totalMemory() - freeMemory() ritorna, in byte, la quantità di memoria usata
        System.out.printf("Memoria occupata nello heap in byte: %d%n",
                          Runtime.getRuntime().totalMemory() - 
                          Runtime.getRuntime().freeMemory());

        // chiediamo (suggeriamo) alla JVM di fare tutto il possibile per avviare le
        // operazioni proprie del garbage collector
        Runtime.getRuntime().gc(); // run del GC

        // chiediamo (suggeriamo) alla JVM di fare tutto il possibile per invocare
        // i metodi finalize degli oggetti in attesa di finalizzazione
        Runtime.getRuntime().runFinalization(); // run finalize 

        System.out.printf("Memoria occupata nello heap in byte: %d%n",
                          Runtime.getRuntime().totalMemory() -
                          Runtime.getRuntime().freeMemory());
    }
}
