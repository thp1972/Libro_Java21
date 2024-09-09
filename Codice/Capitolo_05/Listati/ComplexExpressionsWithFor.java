package LibroJava.Capitolo5;

public class ComplexExpressionsWithFor
{
    public static void main(String[] args)
    {
        int var_1 = 3, var_2 = 2;

        System.out.println("a\tz");
        System.out.println("-\t-");
        for (int a = var_1 * 2 + var_2, z = 0; a >= 0; a--, z++)
            System.out.printf("%d\t%d%n", a, z);
    }
}
