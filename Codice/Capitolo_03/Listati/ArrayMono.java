package LibroJava.Capitolo3;

public class ArrayMono
{
    public static void main(String[] args)
    {
        // array di interi di 10 numeri
        int[] numbers = { 122, 4, 66, 7, 33, 1, 2, 30, 45, 10 };

        for (int ix = 0; ix < numbers.length; ix++)
        {
            if (numbers[ix] % 2 != 0)
                System.out.printf("Il numero %2d è dispari%n", numbers[ix]);
        }
    }
}
