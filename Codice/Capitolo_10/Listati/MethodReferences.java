package LibroJava.Capitolo10;

import java.util.function.IntBinaryOperator;

class MyInteger
{
    public int sum(int left, int right) { return left + right; }
}

@FunctionalInterface
interface MyIntBinaryOperator
{
    int applyAsInt(MyInteger m, int a, int b);
}

public class MethodReferences
{
    public static void main(String[] args)
    {
        // I modalità: old-style prima di Java 8 
        IntBinaryOperator bo_1 = new IntBinaryOperator()
        {
            public int applyAsInt(int left, int right)
            {
                return left + right;
            }
        };
        System.out.printf("Risultato bo_1: %d%n", bo_1.applyAsInt(10, 10)); 
        
        // II modalità: da Java 8 - lambda expression 
        // (int, int) -> int
        IntBinaryOperator bo_2 = (left, right) -> left + right;
        System.out.printf("Risultato bo_2: %d%n", bo_2.applyAsInt(10, 10));
        
        // III modalità: da Java 8 - Riferimento a un metodo statico 
        // (int, int) -> int
        IntBinaryOperator bo_3 = Integer::sum;
        System.out.printf("Risultato bo_3: %d%n", bo_3.applyAsInt(10, 10));
        
        // IV modalità: da Java 8 - Riferimento a un metodo d'istanza
        // di un oggetto specifico 
        // (int, int) -> int
        MyInteger mi = new MyInteger(); 
        IntBinaryOperator bo_4 = mi::sum; 
        System.out.printf("Risultato bo_4: %d%n", bo_4.applyAsInt(10, 10)); 
        
        // V modalità: da Java 8 - Riferimento a un metodo d'istanza 
        // di un oggetto arbitrario di un tipo specifico 
        // (MyInteger, int, int) -> int
        MyIntBinaryOperator bo_5 = MyInteger::sum; 
        System.out.printf("Risultato bo_5: %d%n ", bo_5.applyAsInt(new MyInteger(), 10, 10)); 
    }
}
