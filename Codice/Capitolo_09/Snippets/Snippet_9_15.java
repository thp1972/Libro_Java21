package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.List;

public class Snippet_9_15
{
    public static void main(String[] args)
    {
        // non è possibile usare un tipo primitivo come argomento di tipo
        // error: unexpected type
        List<int> numbers = new ArrayList<>();
    }
}
