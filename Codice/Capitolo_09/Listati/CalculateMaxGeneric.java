package LibroJava.Capitolo9;

public class CalculateMaxGeneric
{
    // dopo la compilazione ogni riferimento alla variabile di tipo T sarà 
    // sostituito da Comparable perché tale è il tipo vincolato espresso
    // per esempio, T max = a diverrà Comparable max = a
    // nel caso non avessimo espresso alcun vincolo allora ogni riferimento
    // alla variabile di tipo T sarebbe stato sostituito, di default, da Object
    // per esempio, T max = a sarebbe diventato Object max = a
    public <T extends Comparable<T>> T maximum(T a, T b, T c)
    {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        
        return max;
    }
}
