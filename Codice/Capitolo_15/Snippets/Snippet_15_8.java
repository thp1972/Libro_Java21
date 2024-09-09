package LibroJava.Capitolo15;

/**
 * A non generic Calculator service.
 */
interface Calculator
{
    /**
     * Questo metodo ritorna la somma di 2 numeri.
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int res = sum(10, 10);}</pre>
     */
    int sum(int add1, int add2);
}

/**
 * Mostra come utilizzare il tag {@code {@inheritDoc}}
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_8 implements Calculator
{
    /**
     * {@inheritDoc}
     */
    public int sum(int add1, int add2) { return add1 + add2; }
}

