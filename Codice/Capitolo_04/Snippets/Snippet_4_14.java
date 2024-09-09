package LibroJava.Capitolo4;

public class Snippet_4_14
{
    public static void main(String[] args)
    {
        int res, a = 10, b = 9;

        // a e b sono, rispettivamente, incrementati e decrementati, 
        // dopo che i loro valori sono stati computati
        res = a++ - b--; // 1

        // qui a vale 11 e b vale 8
        int after = a + b; // 19
    }
}
