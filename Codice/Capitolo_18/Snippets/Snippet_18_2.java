package LibroJava.Capitolo18;

import java.util.List;
import java.util.function.BinaryOperator;

public class Snippet_18_2
{
    public static void main(String[] args)
    {
        List<Integer> stream = List.of
        (
            123, 205, 10, 99, 10, 99, 89
        );

        BinaryOperator<Integer> accumulator = (a, b) -> a + b;
        int identity = 0;
        int result = identity;
        for (int element : stream)
            result = accumulator.apply(result, element);
        System.out.println(result); // 635
    }
}
