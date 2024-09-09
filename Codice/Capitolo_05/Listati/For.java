package LibroJava.Capitolo5;

public class For
{
    public static void main(String[] args)
    {
        System.out.print("a = [ ");

        for (int a = 8; a >= 0; a--) // finché a >= 0 esegue il ciclo
            System.out.printf("%d ", a);    

        System.out.println("]");
    }
}
