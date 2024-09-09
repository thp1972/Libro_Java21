package LibroJava.Capitolo8;

class A
{
    protected int x = 10;
    protected void foo() { System.out.println("foo in A"); }
}

class B extends A
{
    // questa dichiarazione nasconde il campo x ereditato da A
    private int x = 11;

    // questa dichiarazione sovrascrive la dichiarazione di foo in A
    protected void foo() { System.out.println("foo in B"); }

    public B()
    {
        // super.x permette di accedere al campo x in A nascosto dal campo x in B
        // è altresì possibile accedere in modo più prolisso al campo nascosto
        // con la seguente forma ((A)this).x ossia effettuando una conversione
        // esplicita del riferimento this nel tipo A
        System.out.printf("x in B = %d; x in A = %d%n", x, super.x);

        // super.foo() permette di accedere al metodo foo in A sovrascritto dal metodo foo in B
        // in questo caso non è possibile accedere al metodo foo in A con ((A)this).foo()
        // questo perché la JVM avrebbe, sì, convertito la corrente istanza di tipo B 
        // nel tipo A, ma poi, dato che foo è un metodo sovrascritto, avrebbe sul tipo A 
        // trovato il suo effettivo tipo a runtime che è sempre B e dunque avrebbe invocato 
        // foo su B
        // in pratica i campi con lo stesso nome, tra una classe base e una classe derivata,
        // sono sempre nascosti ma i metodi col la stessa segnatura, tra una classe base e una
        // classe derivata, sono sempre sovrascritti e il loro accesso avviene sempre in modo
        // polimorfo a runtime sull'effettivo tipo riferito
        super.foo();
    }
}

public class Snippet_8_1
{
    public static void main(String[] args)
    {
        B b = new B(); // x in B = 11; x in A = 10
                       // foo in A
    }
}
