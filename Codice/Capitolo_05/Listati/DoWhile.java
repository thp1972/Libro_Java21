package LibroJava.Capitolo5;

public class DoWhile
{
    public static void main(String[] args)
    {
        int a = 8;

        System.out.print("a = [ ");

        do // parentesi non necessarie... scritte solo per maggiore chiarezza
        {
            System.out.printf("%d ", a--);
        }
        while (a >= 0); // finché a >= 0 esegue il ciclo

        System.out.println("]");
    }
}
