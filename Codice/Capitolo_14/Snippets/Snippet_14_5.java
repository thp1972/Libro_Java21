package LibroJava.Capitolo14;

@interface SubjectToChange {} // un tipo annotazione del tipo marker annotation type

public class Snippet_14_5
{ 
    // utilizzo di un'annotazione marcatore
    @SubjectToChange // OK - non ha elementi
    public static void processData()
    {
        throw new UnsupportedOperationException("Non ancora implementato!");
    }
    
    public static void main(String[] args)
    {
    }
}
