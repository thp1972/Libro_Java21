package LibroJava.Capitolo15;

/**
 * Mostra come utilizzare il tag {@code {@systemProperty}}.
 *
 * @author Pellegrino Principe
 */
public class Snippet_15_24
{
    /**
     * Costruisce un percorso di file utilizzando il separatore di file di sistema.
     * <p>
     * Questo metodo utilizza la proprietà di sistema {@systemProperty file.separator}
     * per concatenare le parti del percorso del file</p>
     *
     * @param parts le varie parti del percorso del file
     * @return il percorso del file costruito
     */
    public static String buildFilePath(String... parts)
    {
        String separator = System.getProperty("file.separator");
        StringBuilder filePath = new StringBuilder();

        for (int i = 0; i < parts.length; i++)
        {
            filePath.append(parts[i]);
            if (i < parts.length - 1) { filePath.append(separator); }
        }

        return filePath.toString();
    }
}
