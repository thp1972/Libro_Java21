package LibroJava.Capitolo9;

public class PrintArray
{
    public void printArray(int[] el) // stampa un array di interi
    {
        for (int e : el)
            System.out.printf("%d ", e);
    }

    public void printArray(double[] el) // stampa un array di double
    {
        for (double e : el)
            System.out.printf("%.1f ", e);
    }

    public void printArray(char[] el) // stampa un array di caratteri
    {
        for (char e : el)
            System.out.printf("%c ", e);
    }
}
