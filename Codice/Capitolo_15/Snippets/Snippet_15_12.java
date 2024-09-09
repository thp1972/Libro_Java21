package LibroJava.Capitolo15;

import java.util.List;

/**
 * Mostra come utilizzare il tag {@code @param}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_12
{
    /**
     * Questo metodo ritorna la somma di <i>n</i> numeri.
     *
     * <p>Esempio di utilizzo:</p>
     * <pre>    {@code double res = sum(List.of(10,10);}</pre>
     *
     * @param numbers una lista di numeri da sommare
     * @param <T> il tipo dei numeri da sommare. Deve estendere il tipo {@link Number}
     */
    public <T extends Number> double sum(List<T> numbers)
    {
        double sum = 0.0;
        for (T number : numbers) { sum += number.doubleValue(); }
        return sum;
    }
}
