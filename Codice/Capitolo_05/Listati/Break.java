package LibroJava.Capitolo5;

public class Break
{
    public static void main(String[] args)
    {
        System.out.print("a = ");
        for (int a = 1; a <= 10; a++) // finché a <= 10
        {
            if (a == 5)
                break;
            System.out.printf("%d ", a);
        }
        System.out.println();

        int b = 1;

        System.out.print("b = ");
        while (b <= 10) // finché a <= 10
        {
            if (b == 5)
                break;
            System.out.printf("%d ", b++);
        }
        System.out.println();        
    }
}
