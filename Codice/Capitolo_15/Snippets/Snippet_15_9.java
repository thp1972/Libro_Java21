package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code {@link}}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_9
{
    /**
     * Questo metodo ritorna la divisione tra 2 numeri.
     *
     * <p>ATTENZIONE alla generazione di un'apposita eccezione se si passa come valore 0</p>
     *
     * <p>{@link java.lang.Exception ECCEZIONI SOFTWARE CON JAVA}</p>
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int q = integerDiv(10, 2);}</pre>
     *
     * @exception ArithmeticException se divisore è uguale a ZERO
     */
    public int integerDiv(int dividend, int divisor)
    {
        if (divisor == 0) throw new ArithmeticException("l divisore non può essere ZERO!");

        return dividend / divisor;
    }
}
