package LibroJava.Capitolo4;

public class Snippet_4_38
{
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3 };
        int ix = 0;

        // ix, nell'ambito dell'accesso all'elemento dell'array,
        // è valutato solo una volta poi, però, al termine dell'istruzione varrà 1
        a[ix++] *= 10 + 20; // 30

        ix = 0;

        // ix, nell'ambito dell'accesso all'elemento dell'array,
        // è valutato due volte poi, però, al termine dell'istruzione varrà 2
        a[ix++] = (int)((a[ix++]) * (10 + 20)); // 60
    }
}
