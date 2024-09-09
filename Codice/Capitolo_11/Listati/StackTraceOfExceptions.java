package LibroJava.Capitolo11;

public class StackTraceOfExceptions
{
    public static void exc() // metodo che lancia un'eccezione 
    {
        throw new RuntimeException("Un'eccezione di runtime...");
    }

    public static void main(String[] args)
    {
        try { exc(); }
        catch (RuntimeException e)
        {
            System.out.printf("Messaggio dell'eccezione: %s%n", e.getMessage());

            // stampa lo stack trace attraverso l'utilizzo di oggetti 
            // di tipo StackTraceElement 
            System.out.println("*** Stack trace dell'eccezione ***");
            StackTraceElement st[] = e.getStackTrace();
            for (StackTraceElement el : st)
            {
                System.out.printf
                ("CLASSE: %s%nMETODO: %s%nFILE: %s%nNUMERO DI LINEA: %d%n",
                el.getClassName(), el.getMethodName(),
                el.getFileName(), el.getLineNumber());
            }
        }
    }
}