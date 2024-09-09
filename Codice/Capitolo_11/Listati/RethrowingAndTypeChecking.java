package LibroJava.Capitolo11;

class ExceptionA extends Exception {} 
class ExceptionB extends Exception {} 

public class RethrowingAndTypeChecking
{  
    public static void runException(String what) throws ExceptionA, ExceptionB
    {
        try
        {
            if (what.equals("A"))
                throw new ExceptionA();
            else if (what.equals("B"))
                throw new ExceptionB();
        }
        catch (Exception e)
        {
            // rilancia e può essere di tipo ExceptionA o di tipo ExceptionB 
            // così come indicato nella clausola throws 
            throw e;
        }
    }   

    public static void main(String[] args)
    {
        // esegue il metodo runException che potrà lanciare un'eccezione di tipo 
        // ExceptionA oppure di tipo ExceptionB 
        try
        {
            runException("A");
        }
        catch (ExceptionA | ExceptionB e)
        {
            System.out.println(e.getClass());
        }
    }
}
