package LibroJava.Capitolo11;

// è una buona abitudine denominare le proprie eccezioni con il suffisso Exception
class MyArithmeticException extends ArithmeticException // classe eccezione
{
    private static String msg = "[ Eccezione: divisione per 0 ]";
    public MyArithmeticException() { super(msg); }
    public MyArithmeticException(String msg)  { super(msg); }
}

public class ASimpleException
{
    public static void makeDiv(int num, int divisor) // metodo per fare la divisione
    {
        if (divisor == 0)
            throw new MyArithmeticException(); // genera l'eccezione...
        else
            System.out.printf("Divisione di %d per %d = %d%n",
                              num, divisor, (num / divisor));
    }

    public static void main(String[] args)
    {
        int num = 22;
        int[] divisors = { 11, 0, 2, 4 }; // divisori

        for (int n = 0; n < divisors.length; n++) // fai la divisione...
        {
            try // prova il seguente blocco di codice
            {
                makeDiv(num, divisors[n]);
            }
            catch (MyArithmeticException e) // cattura l'eccezione specificata
            {
                System.out.println(e.getMessage());
            }
        }        
    }
}
