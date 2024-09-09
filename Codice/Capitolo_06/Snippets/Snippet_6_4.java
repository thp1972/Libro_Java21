package LibroJava.Capitolo6;

public class Snippet_6_4
{
    // ERRORE - i parametri opzionali non sono una feature presente
    // nel linguaggio Java
    public void foo(int a = 10) // error: ',', ')', or '[' expected
    { 
        int b = a + 4; 
    }

    public int bar(int j)
    {
        // ERRORE - non è possibile definire un metodo all'interno di un altro metodo
        int foobar(int k) { return j * k; } // error: ';' expected        
        return foobar(100);
    }
    
    public static void main(String[] args)
    {
    }
}
