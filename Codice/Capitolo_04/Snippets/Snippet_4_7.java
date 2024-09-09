package LibroJava.Capitolo4;

public class Snippet_4_7
{
    public static void main(String[] args)
    {
        // addizione tra interi
        int a = 10, b = 12, c = 14;
        int sum = a + b + c; // 36

        // addizione tra un float e in int: il risultato è float
        // j, che è di tipo int, prima dell'addizione è convertito in float
        float f = 33.44f;
        int j = 100;
        float other_sum = f + j; // 133.44
    }
}
