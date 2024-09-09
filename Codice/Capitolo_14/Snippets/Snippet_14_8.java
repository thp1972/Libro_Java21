package LibroJava.Capitolo14;

import java.util.ArrayList;
import java.util.List;

public class Snippet_14_8
{
    public static void main(String[] args)
    {
        List raw_list = new ArrayList<Double>();

        // in questo caso non è possibile verificare, sia a compile time sia a runtime, se la 
        // variabile raw_list contiene effettivamente una lista di tipo List<String> 
        // c'è uno heap pollution perché la variabile string_list riferisce un 
        // oggetto che, di fatto, è di tipo ArrayList<Double> e non di tipo List<String> 
        List<String> string_list = raw_list; // unchecked warning
    }
}
