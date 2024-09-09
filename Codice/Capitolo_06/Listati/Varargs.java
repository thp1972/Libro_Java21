package LibroJava.Capitolo6;

public class Varargs
{
    public static void calculateSum(int... c)
    {
        int sum = 0;
        for (int i : c)
            sum += i;

        System.out.printf("La somma è: %d%n", sum);
    }

    public static void main(String[] args)
    {
        int[] one = { 22, 33, 55 };
        int two = 111, three = 444;
        
        calculateSum(one); // fornisco come argomento un array dello stesso tipo
        calculateSum(); // non fornisco argomenti
        calculateSum(two); // fornisco un solo argomento
        calculateSum(two, three); // fornisco due argomenti
    }
}
