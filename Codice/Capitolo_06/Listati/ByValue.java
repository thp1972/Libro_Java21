package LibroJava.Capitolo6;

public class ByValue
{
    private static void swap(int w, int z) // ATTENZIONE - gli argomenti non sono modificati!!!
    {
        int tmp = w;
        w = z;
        z = tmp;
    }

    public static void main(String[] args)
    {
        int a = 10, b = 20;
        System.out.printf("a e b prima dello swap: a=%d - b=%d%n", a, b);

        swap(a, b); // swap di a e b

        System.out.printf("a e b dopo lo swap:\ta=%d - b=%d%n", a, b);
    }
}
