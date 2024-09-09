package LibroJava.Capitolo8;

class A
{
    public static void foo() { System.out.println("metodo di classe foo in A"); }
    public void bar() { System.out.println("metodo di istanza bar in A"); }
}

class B extends A
{
     // nasconde foo in A
    public static void foo() { System.out.println("metodo di classe foo in B"); }
    
     // sovrascrive bar in A
    public void bar() { System.out.println("metodo di istanza bar in B"); }
}

public class Snippet_8_4
{
    public static void main(String[] args)
    {
        // a compile time a è di tipo A
        // a runtime a è di tipo B        
        A a = new B();

        // qua agisce il polimorfismo perché bar è un metodo di istanza 
        a.bar(); // metodo di istanza bar in B

        // qua non agisce il polimorfismo perché foo è un metodo di classe
        // foo viene invocato su a che, a compile time, è di tipo A
        // N.B. per migliorare la leggibilità è meglio invocare foo come A.foo()
        a.foo(); // metodo di classe foo in A
    }
}
