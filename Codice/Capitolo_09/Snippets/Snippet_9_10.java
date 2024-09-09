package LibroJava.Capitolo9;

public class Snippet_9_10
{
    public static <T> T[] dataFactory(int size)
    {        
        T[] data = (T[]) new Object[size];
        return data;
    }
    
    public static void main(String[] args)
    {
        Object[] data = dataFactory(3);
        
        // inserissco elementi di diverso tipo e ciò è possibile perché gli
        // elementi di data sono di tipo Object
        data[0] = 3;
        data[1] = "city";
        
        // viene generata l'eccezione java.lang.ClassCastException: 
        // java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
        String location = (String)data[0];
    }
}
