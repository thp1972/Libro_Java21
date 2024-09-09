package LibroJava.Capitolo3;

public class Snippet_3_7
{ 
    public static void main(String[] args)
    {
        char[] c = "Stringa"; // error: incompatible types: 
                              // String cannot be converted to char[]
                              
        char[] f = { 'S', 't', 'r', 'i', 'n', 'g', 'a' }; // CORRETTO
        String s = "Stringa"; // CORRETTO      
    }
}
