package LibroJava.Capitolo2;

public class Snippet_2_24
{
    public static void main(String[] args)
    {
        // OK - conversione implicita da byte a int
        byte sb = 100;
        int i = sb;

        // OK - conversione implicita da int a long
        int i_2 = 33444;
        long l = i_2;

        // OK - conversione implicita da long a float
        // ATTENZIONE - si ha una perdita di precisione ma non di ordine di grandezza
        // Long.MAX_VALUE = 9223372036854775807
        // fl             = 9223372000000000000
        float fl = Long.MAX_VALUE;

        // ERRORE - conversione implicita non attuabile
        char ch = sb; // error: incompatible types: possible lossy conversion from byte to char

        // ERRORE - conversione implicita non attuabile
        double db = 123.445;
        float fl_2 = db; // error: incompatible types: possible lossy conversion from double to float
    }
}
