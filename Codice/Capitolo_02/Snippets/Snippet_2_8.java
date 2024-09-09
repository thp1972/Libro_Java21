package LibroJava.Capitolo2;

public class Snippet_2_8
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 100;

        // le due istruzioni di output stampano i valori su un'unica linea, perché la prima
        // istruzione printf non va a capo
        System.out.printf("%d - %d - ", a, b); /* 10 - 100 - */

        int c = 1000;
        System.out.printf("%d%n", c); /* 1000 */
        // altre istruzioni
    }
}
