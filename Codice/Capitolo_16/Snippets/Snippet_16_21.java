package LibroJava.Capitolo16;

public class Snippet_16_21
{
    public static void main(String[] args)
    {
        String s1 = new String("Sono una stringa!");
        String s2 = new String("Sono una stringa!");
        
        String s3 = "ABC";
        String s4 = "ABC";
        
        // eguaglianza sui caratteri contenuti in s1 e s2 
        // value equality 
        boolean b1 = s1.equals(s2); // true
        
        // eguaglianza sui riferimenti contenuti in s1 e s2
        // reference equality 
        boolean b2 = s1 == s2; // false        
        
        // ATTENZIONE - in questo caso anche b4 conterrà il valore true
        // a causa del già citato string interning
        boolean b3 = s3.equals(s4); // true
        boolean b4 = s3 == s4; // true        
    }
}
