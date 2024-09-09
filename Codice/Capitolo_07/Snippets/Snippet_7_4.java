package LibroJava.Capitolo7;

class MultiBuffer
{
    byte a;
    int b = 1000; // inizializzatore di variabile di istanza
    float c;

    { // inizializzatore di istanze
        c = 10.22f;
    }

    public MultiBuffer(String s)
    {
        this();
        System.out.println(s);
    }

    public MultiBuffer()
    {
        System.out.printf("%d, %d, %.2f%n", a, b, c);
    }
}

public class Snippet_7_4
{
    public static void main(String[] args)
    {
        // manderà in output: 0, 1000, 10,22        
        new MultiBuffer();
        
        // manderà in output, nell'ordine: 0, 1000, 10, 22 e poi test
        // questo perché prima terminerà l'invocazione del costruttore
        // MultiBuffer() poi quella del costruttore MultiBuffer(String s)        
        new MultiBuffer("test");
    }
}
