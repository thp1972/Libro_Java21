package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code @hidden}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_6
{
    /**
     * Questo metodo ritorna la divisione tra 2 numeri.
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int q = integerDiv(10, 2);}</pre>
     *
     * @exception ArithmeticException se divisore è uguale a ZERO
     */
    public int integerDiv(int dividend, int divisor)
    {
        return _EXEC_DIV(dividend, divisor);
    }

    /**
     * @hidden
     */
    private int _EXEC_DIV(int a, int b)
    {
        if (b == 0) throw new ArithmeticException("Il divisore non può essere ZERO!");
        return a / b;
    }
}
