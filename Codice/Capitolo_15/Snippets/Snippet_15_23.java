package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code {@summary}}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_23
{
    /**
     * {@summary Somma di 2 numeri}.
     *
     * <p>Questo metodo, dati due addendi passati come argomenti, li
     *    valuta e ne ritorna la loro somma</p>
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code int sum = integerSum(10, 10);}</pre>
     */
    public int integerSum(int add1, int add2) { return add1 + add2; }
}
