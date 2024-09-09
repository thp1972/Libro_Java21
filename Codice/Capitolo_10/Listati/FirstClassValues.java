package LibroJava.Capitolo10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FirstClassValues
{
    private static Function<Integer, Integer> mult(int value)
    {
        // qui value è catturata... si forma una closure 
        return n -> value * n; // ritorna una funzione 
    }

    public static void main(String[] args)
    {
        // assegnamento di una funzione a una variabile 
        Function<Integer, Integer> add = x -> x + 1;

        // applicazione della funzione 
        int result = add.apply(10);
        System.out.println(result);

        // una lista di parole... 
        List<String> words = new ArrayList<>(Arrays.asList("Rosso", "Giallo", "Verde",
                                                           "Blu"));

        // scorriamo gli elementi della lista dove al metodo forEach passiamo 
        // come argomento una funzione 
        System.out.print("[ ");
        words.forEach(w -> { System.out.printf("%s ", w); });
        System.out.println("]");
        
        // ritorno di una funzione dall'invocazione di mult 
        Function<Integer, Integer> mul10 = mult(10);
        result = mul10.apply(100);
        System.out.println(result);
    }
}
