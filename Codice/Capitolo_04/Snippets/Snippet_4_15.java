package LibroJava.Capitolo4;

public class Snippet_4_15
{
    public static void main(String[] args)
    {
        int res, a = 10, b = 9;

        // a e b sono, rispettivamente, incrementati e decrementati 
        // prima che i loro valori vengano computati
        res = ++a - --b; // 3

        // qui a vale 11 e b vale 8
        int after = a + b; // 19
    }
}
