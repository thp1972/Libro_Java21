package LibroJava.Capitolo4;

public class Snippet_4_13
{
    public static void main(String[] args)
    {
        int a = -55;
        int b = -a; // 55

        // +100 usabile senza problemi
        int k = 100;
        int j = +100 - -k; // 200
    }
}
