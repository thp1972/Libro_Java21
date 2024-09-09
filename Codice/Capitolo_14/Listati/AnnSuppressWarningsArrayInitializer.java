package LibroJava.Capitolo14;

public class AnnSuppressWarningsArrayInitializer
{
    @SuppressWarnings({ "fallthrough", "divzero" })
    public static void manyWarnings()
    {
        int num = 0;
        switch (num)
        {
            case 3:
                System.out.println("3");
            case 5:
                System.out.println("5");
            case 0:
                System.out.println(5 / 0); // divisione per 0
        }
    }

    public static void main(String[] args)
    {
         manyWarnings(); 
    }
}
