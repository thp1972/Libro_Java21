package LibroJava.Capitolo2;

public class Snippet_2_23
{
    public static void main(String[] args)
    {
        // il letterale null viene valutato come tipo null e produce un 
        // riferimento null che può essere assegnato, in modo compatibile,
        // a qualsiasi tipo riferimento ma mai a un tipo primitivo
        String name = null; // name non punta ad alcun oggetto di tipo String
        int an_array[] = null; // an_array non punta ad alcun oggetto di tipo int[]
        byte a_byte = null; // error: incompatible types: <null> cannot be converted to byte
    }
}
