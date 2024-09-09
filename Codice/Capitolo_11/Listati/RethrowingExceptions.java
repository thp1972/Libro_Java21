package LibroJava.Capitolo11;

// è una buona abitudine denominare le proprie eccezioni con il suffisso Exception
class MyArithmeticException extends ArithmeticException // classe eccezione
{
    private static String msg = "[ Eccezione: divisione per 0 ]";
    private int ix;    
    
    public MyArithmeticException() { super(msg); }
    public MyArithmeticException(String msg)  { super(msg); }
    
    // costruttore che registra anche la posizione dell'elemento causa dell'eccezione
    public MyArithmeticException(int n)
    {
        super(msg);
        ix = n;
    }
    
    public String getMessage() // messaggio dell'eccezione
    {
        return super.getMessage() + " alla posizione dell'array " + ix;
    }
    
    // posizione dell'elemento dell'array che ha generato l'eccezione
    public int getPos() { return ix; }
}

public class RethrowingExceptions
{
    private static final int num = 22; // numero da dividere
    
    public static void makeDiv(int num, int divisor, int ix) // metodo per fare la divisione
    {
        if (divisor == 0)
            throw new MyArithmeticException(ix); // genera l'eccezione...
        else
            System.out.printf("Divisione di %d per %d = %d%n",
                              num, divisor, (num / divisor));
    }
    
    // ciclo nell'array di divisori
    public static void loopIn(int start, int num, int[] divisors)
    {
        for (int n = start; n < divisors.length; n++)
        {
            try
            {
                makeDiv(num, divisors[n], n);
            }
            catch (MyArithmeticException e)
            {
                System.out.println(e.getMessage());
                throw e; // rilanciamo l'eccezione
            }
        }
    }    
    
    // provo comunque a gestire l'eccezione senza interrompere il programma
    public static void tryToResolve(int[] divisors, int pos)
    {
        divisors[pos] = 1;

        try
        {
            loopIn(pos, num, divisors);
        }
        catch (MyArithmeticException e)
        {
            System.out.println(" risolvo forzando il denominatore a 1...");
            tryToResolve(divisors, e.getPos());
        }
    }

    public static void main(String[] args)
    {
        int[] divisors = { 11, 0, 2, 0 }; // divisori

        try // prova il seguente blocco di codice
        {
            loopIn(0, num, divisors);
        }
        catch (MyArithmeticException e) // cattura l'eccezione specificata
        {
            System.out.println(" risolvo forzando il denominatore a 1...");
            tryToResolve(divisors, e.getPos());
        }          
    }
}
