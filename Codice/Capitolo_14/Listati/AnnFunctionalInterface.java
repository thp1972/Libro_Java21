package LibroJava.Capitolo14;

@FunctionalInterface
interface Executable // un'interfaccia funzionale
{
    public void execute();
}

@FunctionalInterface
interface Printable // ERRORE - non è un'interfaccia funzionale
                    // error: Unexpected @FunctionalInterface annotation @FunctionalInterface
                    // Printable is not a functional interface  multiple non-overriding
                    // abstract methods found in interface Printable
{
    public void print();
    public boolean isPrinting();
}

public class AnnFunctionalInterface
{    
    public static void executor(Executable ex) { ex.execute(); }
    
    public static void main(String[] args) 
    {
        executor(() -> System.out.println("... esecuzione ..."));   
    }
}
