package LibroJava.Capitolo4;

public class Snippet_4_5
{
    public static void main(String[] args)
    {
        float a;
        int b = 120;

        // conversione implicita numerica:
        // il valore della variabile b di tipo int è convertito
        // in float e poi posto in a sempre di tipo float
        a = b; // 120.000000

        float a_2 = 11.3f;
        int b_2;
       
        // ERRORE - non è possibile fare alcuna conversione implicita
        // l'assegnamento fallisce!
        b_2 = a_2; // error: incompatible types: possible lossy 
                   // conversion from float to int
    }
}
