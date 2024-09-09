package LibroJava.Capitolo6;

public class Snippet_6_8
{
    public static int sum(double a, double b)
    {
        double res = a + b;

        // ERRORE - non esiste alcuna conversione implicita double -> int
        // error: incompatible types: possible lossy conversion from double to int
        return res;
    }

    // non ha senso progettare un metodo che restituisce un double rispetto
    // a una sottrazione di int perché il valore non potrà mai avere una parte decimale
    // l'obiettivo, qui, è solo quello di mostrare la conversione implicita
    // di un int verso un double rispetto al tipo restituito
    public static double subtraction(int a, int b)
    {
        int res = a - b;

        // OK - conversione implicita int -> double
        return res;
    }

    public static void main(String[] args)
    {
        int res_1 = sum(11.33, 22.33);
        double res_2 = subtraction(100, 50); // 50.0
    }
}
