package LibroJava.Capitolo4;

public class Snippet_4_3
{
    public static void main(String[] args)
    {
        int a = 10;
        int b;

        // ordine di valutazione esplicita delle espressioni che useranno la variabile a
        b = a - 5; // prima quest'espressione...
        a = 11; // poi quest'espressione...

        int res = b + a; // 16
    }
}
