package LibroJava.Capitolo15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Mostra come utilizzare il tag {@code @see}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_16
{
    /**
     * {@return un {@code int} contenente la somma di due numeri}
     *
     * <p>Esempio di utilizzo (quando, {@code true}, scrive il risultato sul file
     * <i>Result.txt</i>)</p>
     * <pre>    {@code int sum = integerSum(10, 10, true);}</pre>
     *
     * @see <a href="https://docs.oracle.com/javase/tutorial/essential/io/fileio.html">NIO.2</a>
     */
    public int integerSum(int add1, int add2, boolean printTofile) throws IOException
    {
        int sum = add1 + add2;

        if (printTofile)
        {
            String sumToWrite = "La somma tra %d e %d è: %d".formatted(add1, add2, sum);
            Path path = Paths.get("Result.txt");
            Files.write(path, sumToWrite.getBytes());
        }

        return sum;
    }
}
