package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code @deprecated}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_3
{
    /**
     * Questo metodo ritorna la somma di 2 numeri.
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int sum = IntegerSum(10, 10);}</pre>
     * @deprecated Usa {@link #integerSum(int...)} invece
     */
    public int integerSum(int add1, int add2) { return add1 + add2; }

    /**
     * Questo metodo ritorna la somma di n numeri.
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int sum = integerSum(10, 10, 25, 434);}</pre>
     */
    public int integerSum(int... numbers)
    {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
}
