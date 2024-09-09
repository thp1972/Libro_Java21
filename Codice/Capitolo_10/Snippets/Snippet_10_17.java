package LibroJava.Capitolo10;

interface Interface_1
{
    default void foo() { System.out.println("Interface_1"); }
}

class Class_1 
{ 
    public void foo() { System.out.println("Class_1"); } 
} 

class Class_2 extends Class_1 implements Interface_1 {} 

public class Snippet_10_17
{
    public static void main(String[] args)
    {
        new Class_2().foo(); // Class_1
    }
}
