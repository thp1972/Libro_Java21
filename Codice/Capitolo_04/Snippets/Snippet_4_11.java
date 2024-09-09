package LibroJava.Capitolo4;

public class Snippet_4_11
{
    public static void main(String[] args)
    {
        // -7 / -5 dà 1 perché gli operandi sono di segno uguale
        //  7 / -5 dà -1 perché gli operandi sono di segno opposto
        int a = -7, b = 5; // operandi di segno opposto

        // il risultato sarebbe -1.4 ma lo stesso è stato arrotondato
        // verso lo 0 ed è dunque -1
        int res = a / b;
    }
}