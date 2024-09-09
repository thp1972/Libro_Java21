package LibroJava.Capitolo10;

import java.util.function.Function;

public class Snippet_10_21
{
    public static void main(String[] args)
    {
        // lambda equivalente: (String s) -> s.toLowerCase()
        // (String) -> String
        Function<String, String> f_tol = String::toLowerCase;
        f_tol.apply("PELLEGRINO"); // pellegrino
    }
}
