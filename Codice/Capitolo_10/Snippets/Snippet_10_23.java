package LibroJava.Capitolo10;

import java.util.HashSet;
import java.util.Set;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class Snippet_10_23
{
    public static void main(String[] args)
    {
        // creazione di istanze con il diamond operator: poly expression 
        // new HashSet<>() appare in due contesti differenti e il tipo dedotto 
        // a parità di espressione è differente 
        Set<String> s_s = new HashSet<>();
        Set<Double> s_d = new HashSet<>();

        // operatore ternario: poly expression 
        // with_capacity ? new HashSet<>(capacity) : new HashSet<>() 
        // appare in due contesti differenti e il tipo dedotto 
        // a parità di espressione è differente 
        boolean with_capacity = true;
        final int capacity = 10;
        Set<String> s_s2 = with_capacity ? new HashSet<>(capacity) : new HashSet<>();
        Set<Double> s_d2 = with_capacity ? new HashSet<>(capacity) : new HashSet<>();

        // lambda expression: poly expression 
        // () -> 10 appare in due contesti differenti e il tipo dedotto 
        // a parità di espressione è differente 
        IntSupplier is = () -> 10;
        DoubleSupplier ds = () -> 10;
        
        // riferimenti a metodi: poly expression 
        // String::valueOf appare in due contesti differenti e il tipo dedotto 
        // a parità di espressione è differente 
        IntFunction ti = String::valueOf;
        Function<Integer, String> func = String::valueOf;
    }
}
