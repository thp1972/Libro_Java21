package LibroJava.Capitolo2;

public class Snippet_2_25
{
    public static void main(String[] args)
    {
        byte b = 2;
        int i;
        short s = 111;

        // OK - valido, b e s sono stati convertiti implicitamente in int 
        // e possono essere assegnati a i che è di tipo int
        i = b * s;

        // ERRORE - non valido, poiché anche se b è di tipo byte e il valore è nel suo range,
        // gli operandi b e s sono stati convertiti implicitamente in int ...
        b = b + s; // error: incompatible types: possible lossy conversion from int to byte

        // ... quindi si deve prevedere una conversione esplicita tramite l'operatore di cast
        b = (byte) (b + s); // OK
    }
}
