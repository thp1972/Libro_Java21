package LibroJava.Capitolo9;

class Numbers<T>
{
    private T _value;
    
    // non è possibile usare T con dei campi statici
    // error: non-static type variable T cannot be referenced from a static context
    private static final T MIN = -9223372036854775808L;
    
    // error: non-static type variable T cannot be referenced from a static context
    private static final T MAX = 9223372036854775807L;
    
    // non è possibile usare T con dei metodi statici    
    // error: non-static type variable T cannot be referenced from a static context
    public static T Abs() { throw new UnsupportedOperationException(); }
}

public class Snippet_9_12
{
    public static void main(String[] args) { }
}
