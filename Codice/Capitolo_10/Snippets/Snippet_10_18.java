package LibroJava.Capitolo10;

interface Interface_1
{
    default void foo() { System.out.println("Interface_1"); }
}

interface Interface_2 extends Interface_1 
{ 
    default void foo() { System.out.println("Interface_2"); } 
} 

interface Interface_3 extends Interface_2 
{ 
    default void foo() { System.out.println("Interface_3"); } 
}

// qui avremmo potuto scrivere semplicemente ...implements Interface_3 ma abbiamo 
// implementato tutte e tre le interfacce in modo non "ordinato" per evidenziare 
// che il metodo ereditato non è quello della "prima" interfaccia implementata 
class Class_1 implements Interface_2, Interface_3, Interface_1 {} 

public class Snippet_10_18
{
    public static void main(String[] args)
    {
        new Class_1().foo(); // Interface_3
    }
}
