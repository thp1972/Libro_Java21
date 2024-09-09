package LibroJava.Capitolo9;

class C<T> // una classe generica
{
    // metodo statico non generico
    public static void foo(int t)
    {
        System.out.println("foo non generico in C<T>");
    }

    // metodo statico generico 
    public static <S> void bar(S s)
    {
        System.out.println("bar generico in C<T>");
    }
}

class M // una classe non generica
{
    // metodo statico generico 
    public static <S> void baz(S s)
    {
        System.out.println("baz generico in M");
    }
}

public class Snippet_9_4
{
    public static void main(String[] args)
    {
        C.foo(30); // foo non generico in C<T>

        // type inference
        C.bar("HELLO"); // bar generico in C<T>

        // non usiamo la type inference: esplicitiamo l’argomento di tipo
        M.<Double>baz(44.5); // baz generico in M
    }
}
