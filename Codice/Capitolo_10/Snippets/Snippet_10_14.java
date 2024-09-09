package LibroJava.Capitolo10;

interface MyInterface
{
    static void foo() { }
}

class MyClass implements MyInterface
{
    public static void foo() { }
}

public class Snippet_10_14
{
    public static void main(String[] args)
    {
        MyInterface my_int = new MyClass();
        MyClass my_class = new MyClass();
        
        // error: illegal static interface method call my_int.foo();
        // the receiver expression should be replaced with the type qualifier 'MyInterface'
        my_int.foo();
        MyInterface.foo(); // OK
 
        my_class.foo(); // OK
        MyClass.foo(); // OK
    }
}
