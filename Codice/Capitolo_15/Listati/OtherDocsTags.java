package LibroJava.Capitolo15;

import java.io.IOException;

/**
 * <p>
 * <b>Classe</b> OtherDocumentation
 * </p>
 *
 * @author Pellegrino ~thp~ Principe
 * @version 1.0
 */
class OtherDocumentation
{
    /**
     * un metodo qualsiasi...
     */
    public void bar() { }
}

/**
 * <p>
 * <b>Classe</b> OtherTags
 * </p>
 *
 * @author Pellegrino ~thp~ Principe
 * @version 1.1
 */
public class OtherDocsTags extends OtherDocumentation
{
    /**
     * __DO Valore costante: {@value}
     */
    private static final int __DO = 10;

    /**
     * <a href="{@docRoot}/img/copyright.png"> [Copyright] </a>
     */
    private String trash_image = "trash.png";

    /**
     * @deprecated
     * @param g indica un intero...
     */
    public void foo(int g) { }

    /**
     * {@code <doStuff>}
     *
     * <p>Nuova versione {@link #doStuff(int a)}</p>
     * 
     * @since 1.0 
     */
    public void doStuff() { }

    /**
     * {@code <doStuff>}
     *
     * @param a indica un intero...
     * @since 1.1
     */
    public void doStuff(int a) { }

    /**
     * metodo per la creazione di un file
     *
     * @throws IOException se il file non è stato creato correttamente
     */
    public void fileCreation() throws IOException { }

    /**
     * {@inheritDoc}
     */
    public void bar() { }
}
