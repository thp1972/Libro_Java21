package LibroJava.Capitolo15;

import java.util.regex.Pattern;

/**
 * Mostra come utilizzare il tag {@code @spec}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_22
{
    /**
     * Esempio di indirizzo valido: {@code 2001:0db8:85a3:0000:0000:8a2e:0370:7334}.
     */
    private static final Pattern IPV6_STD_PATTERN =
            Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /**
     * Verifica se la stringa fornita è un indirizzo IPv6 valido.
     *
     * <p><b>Attenzione:</b> non valida tutti i casi IPv6, ma solo quelli <i>STANDARD</i></p>
     *
     * @param address la stringa dell'indirizzo IPv6 da verificare
     * @return {@code true} se l'indirizzo è valido, {@code false} altrimenti
     * @spec https://datatracker.ietf.org/doc/html/rfc2373
     *       RFC 2373: IP Version 6 Addressing Architecture
     */
    public static boolean isValidIPv6Address(String address)
    {
        if (address == null) { return false; }
        return IPV6_STD_PATTERN.matcher(address).matches();
    }
}
