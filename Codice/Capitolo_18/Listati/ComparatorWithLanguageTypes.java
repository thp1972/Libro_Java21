package LibroJava.Capitolo18;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorWithLanguageTypes
{
    public static void main(String[] args)
    {
        // TreeSet di numeri con un comparatore custom 
        // NOTA - era anche possibile usare una lambda expression
        // ... new TreeSet<>((Integer o1, Integer o2) -> o2.compareTo(o1))
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>()
        {
            public int compare(Integer o1, Integer o2) { return o2.compareTo(o1); }
        });

        numbers.add(44);
        numbers.add(-11);
        numbers.add(2);

        System.out.printf("Interi ordinati in ordine inverso: %s%n", numbers);
    }
}
