package LibroJava.Capitolo9;

class BiNumbers<T, U> 
{ 
    private T first_number;
    private U second_number;
   
    public BiNumbers ()
    {
        // non è possibile creare istanze di una variabile di tipo
        // error: unexpected type
        first_number = new T();
        // error: unexpected type
        second_number = new U();
    }
}

public class Snippet_9_13
{
    public static void main(String[] args) { }
}
