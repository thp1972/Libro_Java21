package LibroJava11.Capitolo8;

class A
{
    public void M() { System.out.println("A.M"); }
    public void A_method() { System.out.println("A method!"); }
}

class B extends A
{
    public void M() { System.out.println("B.M"); }
    public void B_method() { System.out.println("B method!"); }
}

public class Snippet_8_2
{
    public static void main(String[] args)
    {
        A a = new B(); // OK upcast sempre possibile
        
        if (a instanceof B) // a, a runtime, è di tipo B
        {
            // in questo punto nessuna eccezione di cast invalido potrà essere generata
            // perché siamo sicuri che a conteneva un oggetto di tipo B
            B b = (B) a; // il downcast richiede sempre una conversione esplicita

            // possiamo accedere senza problemi al metodo B_method perché a
            // conteneva un oggetto di tipo B...
            b.B_method(); // B method!
        }
    }
}
