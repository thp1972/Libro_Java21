package LibroJava.Capitolo10;

import java.util.HashSet;
import java.util.Set;

public class Snippet_10_22
{
    public static void main(String[] args)
    {
        // qui new HashSet<String>() è un'espressione standalone 
        // anche in isolamento, ovvero senza l'assegnamento al riferimento 
        // s il compilatore può inferire che il tipo è HashSet<String> 
        Set<String> s = new HashSet<String>();
        
        // qui "Pellegrino" è un'espressione standalone 
        // il compilatore valutando il valore costante può senza dubbio dire che è di tipo String 
        String name = "Pellegrino";
    }
}
