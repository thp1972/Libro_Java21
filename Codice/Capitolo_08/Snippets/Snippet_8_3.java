package LibroJava.Capitolo8;

class A
{
    public void M() { System.out.println("A.M"); }
}

class B extends A
{
    // da ora in poi nessuna sottoclasse di B potrà sovrascrivere
    // ulteriormente M
    public final void M() { System.out.println("B.M"); }
}

final class C extends B // C non potrà subire derivazioni
{
    // ERRORE - non è possibile sovrascrivere M di B perché final
    // error: M() in C cannot override M() in B 
    // overridden method is final
    public void M() { System.out.println("C.M"); }
}

// ERRORE - D non può ereditare da C perché final
// error: cannot inherit from final C
class D extends C { }

public class Snippet_8_3
{
    public static void main(String[] args) { } 
}
