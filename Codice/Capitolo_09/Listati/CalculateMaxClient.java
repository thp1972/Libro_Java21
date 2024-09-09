package LibroJava.Capitolo9;

public class CalculateMaxClient
{
    public static void main(String[] args)
    {
        CalculateMax cm = new CalculateMax();

        double[] d = { 11.1, 11.2, 9.6 };
        int[] i =    { 12, 13, 3 };
        char[] c =   { 'n', 'b', 'z' };

        System.out.printf("Max (double): %.1f", cm.maximum(d[0], d[1], d[2]));
        System.out.printf(" | Max (int): %d", cm.maximum(i[0], i[1], i[2]));
        System.out.printf(" | Max (char): %c%n", cm.maximum(c[0], c[1], c[2]));
    }
}
