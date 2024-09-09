package LibroJava.Capitolo4;

public class Snippet_4_37
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 11;
        int c = 20;

        // qui equivalente con a = (int)((a) * (b + c))
        a *= b + c; // 310

        a = 10;
        // qui si vede, nel risultato, la non equivalenza con a = a * b + c
        a = a * b + c; // 130
    }
}
