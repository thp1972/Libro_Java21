package LibroJava.Capitolo4;

public class Snippet_4_8
{
    public static void main(String[] args)
    {
        // sottrazione tra due char: consentita perché i char sono classificati
        // nell'ambito dei tipi interi (hanno la stessa rappresentazione del tipo short senza segno)
        // ATTENZIONE: C e K prima della sottrazione sono convertiti in int e
        // poi il valore della sottrazione è assegnato al tipo int char_diff
        char C = 'A'; // ASCII code 65
        char K = 'z'; // ASCII code 122
        int char_diff = C - K; // -57

        // sottrazione tra un rvalue e un lvalue
        int j = 100;
        int b_diff = 25 - j; // -75
    }
}
