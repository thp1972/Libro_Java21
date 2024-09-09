package LibroJava.Capitolo5;

public class While
{
    public static void main(String[] args)
    {
        int a = 8;

        System.out.print("a = [ ");

        while (a >= 0) // finché a >= 0 esegue il ciclo
            System.out.printf("%d ", a--);
        
        System.out.println("]");
    }
}
