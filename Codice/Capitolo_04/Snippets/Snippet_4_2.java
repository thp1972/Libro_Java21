package LibroJava.Capitolo4;

public class Snippet_4_2
{
    public static void main(String[] args)
    {
        int a = 10;
        int b;

        int res = (b = a - 5) + (a = 11); // 16
    }
}
