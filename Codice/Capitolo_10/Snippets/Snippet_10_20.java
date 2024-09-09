package LibroJava.Capitolo10;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

// annotazione senza implementazione; dichiarazione usata solo
// per consentire il funzionamento del predicato cui function_2
// Java non supporta di default questo tipo di annotazione la quale
// è supportata, per esempio, nel Checker Framework
@interface NonNull {}

public class Snippet_10_20
{
    public static void main(String[] args)
    {        
        // OK - è possibile usare il qualificatore final ma solo sui tipi manifesti oppure se presente var
        // (int) -> void
        IntConsumer function_1 = (final int data) ->
        {
            int cons = data;
            cons *= 100;
        };

        // OK - è consentito usare un'annotazione ma solo sui tipi manifesti oppure se presente var
        //(String) -> boolean
        Predicate<String> function_2 = (@NonNull var name) -> name.length() != 0;
        
        // OK - è lecito usare un parametro di arietà variabile ma solo con un tipo manifesto
        // Integer[] -> void
        Consumer<Integer[]> function_3 = (Integer... data) ->
        {
            int sum = 0;
            for (int d : data)
                sum += d;
        };

        // OK - var usato per tutti i parametri formali
        // (String, String) -> String
        BiFunction<String, String, String> function_4 = (var data_1, var data_2) -> data_1.concat(data_2);
        
        // ERRORE - var usato congiuntamente al tipo manifesto String
        // (String, String) -> Integer
        BiFunction<String, String, Integer> function_5 = (var data_1, String data_2) -> data_1.indexOf(data_2);
        
        // ERRORE - non è possibile usare congiuntamente var e un tipo implicito
        // (Integer, Integer) -> void
        BiConsumer<Integer, Integer> function_6 = (var data_1, data_2) -> Math.pow(data_1, data_2);
        
        // ERRORE - non è possibile usare congiuntamente parametri con tipi manifesti con parametri 
        // con tipi impliciti
        // (String, String) -> boolean
        BiPredicate<String, String> function_7 = (String name, surname) -> name.equals(surname);        
        
        // OK - parentesi tonde omettibili; un solo parametro con tipo implicito 
        // (Integer) -> int
        ToIntFunction<Integer> function_8 = z -> z * 10;
        
        // OK - non ci sono parametri formali e dunque si possono usare le parentesi tonde vuote
        // (void) -> boolean
        BooleanSupplier function_9 = () -> true;
        
        // ERRORE - parentesi tonde non omettibili; più di un parametro 
        // (Integer, Integer) -> int
        ToIntBiFunction<Integer, Integer> function_10 = z, w -> z * w;

        // OK - più parametri indicati tra parentesi tonde 
        // (Integer, Integer) -> int
        ToIntBiFunction<Integer, Integer> function_11 = (x, y) -> x - y;        
        
        // ERRORE - non è possibile omettere le parentesi tonde se vi è un solo parametro 
        // con l'indicazione del tipo manifesto o var
        // (Integer) -> void
        Consumer<Integer> function_12 = Integer j -> System.out.println(j);

        // ERRORE - return può solo apparire come statement in un blocco di codice {} 
        // (Double) -> Double
        Function<Double, Double> function_13 = (Double d) -> return d - 10;
        
        // OK - return scritto nell'ambito di un blocco di codice 
        // (Double) -> double
        Function<Double, Double> function_14 = (Double v) ->
        {
            if (v > 10)
                return v - 10;
            else
                return v;
        };        

        // ERRORE - in un blocco è necessario scrivere return se la funzione lo richiede 
        // così come il punto e virgola 
        // (int) -> Integer
        IntFunction<Integer> function_15 = j -> { j * j * j };
    }
}
