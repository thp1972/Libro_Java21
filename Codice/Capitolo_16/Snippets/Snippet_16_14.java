package LibroJava.Capitolo16;

public class Snippet_16_14
{
    public static void main(String[] args)
    {
        String string_s = "ciao";

        // il metodo isEmpty ritorna true solo se la lunghezza della stringa è 0
        System.out.println(string_s == null || string_s.isEmpty()); // false

        // empty_s è inizializzata con il valore "" (zero-length string)
        String empty_s = "";

        // il metodo length ritorna quanti caratteri ha una stringa
        System.out.println(empty_s.length()); // 0

        // null_s è inizializzata con il valore null
        String null_s = null;

        // Exception in thread "main" java.lang.NullPointerException
        System.out.println(null_s.length());
    }
}
