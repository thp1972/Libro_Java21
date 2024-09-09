package LibroJava.Capitolo10;

interface Interface_1
{
    default void foo() { System.out.println("Interface_1"); }
}

interface Interface_2
{ 
    default void foo() { System.out.println("Interface_2"); } 
} 

// le interfacce non sono correlate; necessario usare super
class Class_1 implements Interface_1, Interface_2 
{ 
    public void foo() { Interface_1.super.foo(); } 
} 

public class Snippet_10_19
{
    public static void main(String[] args)
    {
        new Class_1().foo(); // Interface_1
    }
}
