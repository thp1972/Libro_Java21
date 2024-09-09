package LibroJava.Capitolo9;

public class CalculateMax
{
    public int maximum(int a, int b, int c) // massimo tra valori interi
    {
        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public double maximum(double a, double b, double c) // massimo tra valori double
    {
        double max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }

    public char maximum(char a, char b, char c) // massimo tra valori carattere
    {
        char max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }
}
