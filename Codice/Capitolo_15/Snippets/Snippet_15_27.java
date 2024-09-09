package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code {@value}}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_27
{
    /**
     * {@summary REGEX per un indirizzo IPv6}.
     * <p>
     * Esempio di indirizzo valido: {@code 2001:0db8:85a3:0000:0000:8a2e:0370:7334}
     * <p>
     * L'espressione regolare ha il seguente valore: {@value}
     */
    private static final String IPV6_STD_PATTERN = "^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

    /**
     * Versione corrente dell'applicazione:
     * {@value %.3f}.
     */
    public static final float APP_VERSION = 1.456f;
}
