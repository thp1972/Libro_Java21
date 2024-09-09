package LibroJava.Capitolo2;

public class Snippet_2_26
{
    public static void main(String[] args)
    {
        byte b = 111;
        char c = 'd'; // 100 come valore numerico in base 10
        short s = 444;
        int i = 2131;
        long l = 2112;
        float f = 5.6f;
        double d = 3322.11;
        double ris = (c * i) + (f * b) - (d / s) / l;

        // di default, un valore in virgola mobile, viene stampato con al massimo
        // 6 cifre di precisione; noi ne indichiamo 10
        System.out.printf("%.10f%n", ris); // 213721,5902072776
    }
}
