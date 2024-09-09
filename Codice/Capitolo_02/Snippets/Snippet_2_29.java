package LibroJava.Capitolo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.ToIntFunction;

public class Snippet_2_29
{
    public static int number_1; // number_1 -> class variable
    private int number_2; // number_2 -> instance variable 

    // costruttore
    public Snippet_2_29(int data) {} // data -> constructor parameter   

    public static void main(String[] args) // args -> method parameter
    {
        int number_3 = 1000; // number_3 -> local variable 

        int[] an_array = new int[5]; // an_array -> local variable
        int data = an_array[1]; // an_array[1] -> array component

        ToIntFunction<Integer> func_1 = z -> z * 10; // z -> lambda parameter

        try
        {
            int n = Integer.parseInt("45%"); // n -> local variable 
        }
        catch (NumberFormatException exc) {} // exc -> exception parameter 

        for (int i = 0; i < 10; i++); // i -> local variable 

        // try-with-resources
        try (BufferedReader br = // br -> local variable
             new BufferedReader(
             new FileReader("Numbers.txt")))
        {
            String a_line =  br.readLine(); // a_line -> local variable
        }
        catch (IOException exc) {} // exc -> exception parameter 
    }
}
