package LibroJava.Capitolo9;

import java.util.List;

// non è possibile ereditare da classi eccezione
// error: a generic class may not extend java.lang.Throwable
class Numbers<T> extends Throwable {}

public class Snippet_9_16
{
    // è comunque possibile usare T con la clausola throws
    public static <T extends Exception> void listProcessor(List<?> list) throws T
    {
        try
        {
            for (Object elem : list) 
                System.out.printf("%s ", elem);            
        }
        // non è possibile usare T come tipo dell'eccezione da intercettare
        // error: unexpected type
        catch (T e) 
        {
            // non è possibile usare T come tipo dell'eccezione da lanciare
            // error: unexpected type
            throw new T();
        }
    }
    
    public static void main(String[] args) { }
}
