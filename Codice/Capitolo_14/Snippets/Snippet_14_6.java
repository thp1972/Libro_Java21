package LibroJava.Capitolo14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@interface Developer // un tipo annotazione del tipo single-element annotation type
{
    String value();
} 

@interface Readonly { } // un tipo annotazione del tipo marker annotation type

// specifichiamo l'applicabilità dell'annotazione
// TYPE_USE identifica qualsiasi contesto di tipo
@Target(ElementType.TYPE_USE)
@interface CheckSecurity { } // un tipo annotazione del tipo marker annotation type

// alcuni esempi di utilizzo di annotazioni in contesti di dichiarazione
@Developer("Max")
class A_Class
{
    @Readonly
    private static final int a_field = 100;
    
    @Developer("John")
    public void foo() { }    
}

public class Snippet_14_6
{ 
    public static void main(String[] args)
    {
        // un esempio di utilizzo di un'annotazione in un contesto di tipo
        A_Class a_class = new @CheckSecurity A_Class();
    }
}
