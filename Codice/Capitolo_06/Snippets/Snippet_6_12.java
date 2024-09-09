package LibroJava.Capitolo6;

import java.io.IOException;

public class Snippet_6_12
{
     // DICHIARAZIONE                                 SEGNATURA
     // ---------------------------------------------------------------------------
     public void foo() { }                            // foo()
     public void foo(byte b) { }                      // foo(byte)
     public void foo(int b) { }                       // foo(int)
     public void foo(byte b, int c) { }               // foo(byte, int)
     public void foo(int c, byte b) { }               // foo(int, byte)
     public void foo(String[] array) { }              // foo(String[])
     
     // ERRORE
     // error: cannot declare both foo(String...) and foo(String[])in Snippet_6_12
     // String... è equivalente a String[]
     public void foo(String... array) { }            // foo(string[])     
     public void foo(double d) { }                   // foo(double)
     
     // ERRORE
     // error: method foo(double) is already defined in class Snippet_6_12
     // foo non può differire dagli altri metodi solo per il tipo restituito
     public int foo(double d) { return 0; }          // foo(double)
     
     // ERRORE
     // error: method foo(double) is already defined in class Snippet_6_12
     // foo non può differire dagli altri metodi solo per un modificatore di accesso
     // (ma anche solo per gli altri modificatori di metodo)
     private void foo(double d) { }                   // foo(double)
     
     // ERRORE
     // error: method foo(double) is already defined in class Snippet_6_12
     // foo non può differire dagli altri metodi solo perché un suo parametro
     // ha un nome differente
     public void foo(double d_name) { }               // foo(double)
     
     // ERRORE
     // error: method foo(double) is already defined in class Snippet_6_12
     // foo non può differire dagli altri metodi solo per la clausola throws
     public void foo(double d) throws IOException { } // foo(double)
    
    public static void main(String[] args)
    {       

    }
}
