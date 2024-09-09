package LibroJava.Capitolo18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Snippet_18_3
{
    public static void main(String[] args)
    {
        List<String> stream = List.of
        (
            "BMW", "RENAULT", "FIAT", "MASERATI", "FIAT", "MASERATI", "TOYOTA"
        );

        Supplier<ArrayList<String>> supplier = () -> new ArrayList<>();
        BiConsumer<List<String>, String> accumulator = (a, b) -> a.add(b);

        ArrayList<String> result = supplier.get();
        for (String element : stream)
            accumulator.accept(result, element);
        System.out.println(result); // [BMW, RENAULT, FIAT, MASERATI, FIAT, MASERATI, TOYOTA]
    }
}
