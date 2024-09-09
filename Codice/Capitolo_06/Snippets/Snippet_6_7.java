package LibroJava.Capitolo6;

public class Snippet_6_7
{
    public static int sum(int x, int y, int z) { return x + y + z; }

    public static void main(String[] args)
    {
        int a = 10;

        // alla valutazione del primo argomento a varrà 10, dunque x in sum varrà 10
        // alla valutazione del secondo argomento a varrà 0, dunque y in sum varrà 0
        // alla valutazione del terzo argomento a varrà 0, dunque z in sum varrà 0
        // la valutazione degli argomenti sarà stata effettuata da sinistra a destra
        int res = sum(a, a -= 10, a); // 10

        int b = 100;
        try
        {
            // in questo caso la valutazione del secondo argomento produrrà un'eccezione
            // di tipo ArithmeticException e dunque la valutazione del terzo argomento
            // non sarà mai effettuata
            // b, infatti varrà ancora 50 come da valutazione del primo argomento
            res = sum(b = 50, b / 0, b = 40);
        }
        catch (ArithmeticException ae)
        {
            System.out.printf("%s - %d%n", ae, b); // java.lang.ArithmeticException: / by zero - 50
        }
    }
}
