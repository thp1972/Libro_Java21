package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.List;

public class Snippet_9_3
{
    private static void printListElements(List<Integer> list)
    {
        list.add(10);
        list.add(1000);
        list.add(10000);
        
        for (int elem : list)
            System.out.println(elem);
    }

    private static <T> List<T> factorList(int capacity)
    {
        List<T> list = new ArrayList<>(capacity);
        return list;
    }

    public static void main(String[] args)
    {
        // inference in method context con Java 8
        // OK - nessun errore di compilazione 
        // con Java 7 avremo, però, il seguente errore di compilazione: 
        // incompatible types: List<Object> cannot be converted to List<Integer> 
        printListElements(factorList(10)); // stampa in successione 10 1000 10000
    }
}
