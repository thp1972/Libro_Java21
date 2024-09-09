package LibroJava.Capitolo16;

public class StringBuilderDemo
{
    public static String getStringInfo(StringBuilder str)
    {
        return """
               Attualmente la stringa "%s" ha:
                   capacità %d e lunghezza %d""".
               formatted(str, str.capacity(), str.length());
    }

    public static void main(String[] args)
    {
        StringBuilder mod_string = new StringBuilder(); // vuota...
        System.out.println(getStringInfo(mod_string));

        mod_string.append("Sed ut perspiciatis"); // aggiungiamo una sequenza
        // di caratteri con append
        System.out.println(getStringInfo(mod_string));

        // aggiungiamo un'altra sequenza di caratteri con insert
        mod_string.insert(7, "accusamus et iusto odio dignissimos ducimus");
        System.out.println(getStringInfo(mod_string));

        mod_string.delete(0, 4); // togliamo dei caratteri
        System.out.println(getStringInfo(mod_string));
    }
}
