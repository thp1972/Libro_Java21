package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code @throws}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_25
{
    /**
     * Questo metodo ritorna la divisione tra 2 numeri.
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int q = integerDiv(10, 2);}</pre>
     *
     * @throws ArithmeticException se divisore è uguale a ZERO
     */
    public int integerDiv(int dividend, int divisor)
    {
        if (divisor == 0) throw new ArithmeticException("Il divisore non può essere ZERO!");

        return dividend / divisor;
    }
}
