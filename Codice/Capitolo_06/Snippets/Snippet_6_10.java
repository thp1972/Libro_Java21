package LibroJava.Capitolo6;

public class Snippet_6_10
{
    public static int case_1()
    {
        // ERRORE - non si sta restituendo alcun valore
        // error: missing return statement
        int v = 100;
    }

    public static int case_2()
    {
        int v = 100;

        // ERRORE - return senza un appropriato valore restituito
        // error: incompatible types: missing return value
        return;
    }

    public static void case_3()
    {
        int v = 100;

        // ERRORE - return restituisce un valore ma il metodo restituisce void
        // error: incompatible types: unexpected return value
        return v;
    }

    public static void main(String[] args)
    {
    }
}
