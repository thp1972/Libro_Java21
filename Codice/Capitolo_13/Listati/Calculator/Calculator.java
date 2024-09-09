package calculator;

import mathlibrary.MathL;

public class Calculator
{
    public static void main(String[] args)
    {
        MathL ml = new MathL();        
        
        System.out.printf("La somma tra 10 e 100 è: %d%n", ml.add(10, 100));
        
        for(int divisor : new int[]{ 1, 2, 0 })
        {
             System.out.printf("La divisione tra 10 e %d è: %d%n", 
                               divisor, ml.div(10, divisor));
        }
    }
}