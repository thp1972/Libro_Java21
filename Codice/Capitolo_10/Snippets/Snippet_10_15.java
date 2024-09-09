package LibroJava.Capitolo10;

interface Interface_1
{
    static void foo() { }
}
interface Interface_2 extends Interface_1 { }

class Class_1
{
    public static void foo() { }
}
class Class_2 extends Class_1 { }

public class Snippet_10_15
{
    public static void main(String[] args)
    {
        Interface_1.foo(); // OK

        // error: cannot find symbol Interface_2.foo();
        // symbol:   method foo()
        // location: interface Interface_2
        Interface_2.foo();

        Class_1.foo(); // OK 
        Class_2.foo(); // OK 
    }
}
