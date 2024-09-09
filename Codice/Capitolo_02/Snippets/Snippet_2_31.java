package LibroJava.Capitolo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Snippet_2_31
{
    public static void main(String[] args)
    {
        // OK - dichiarazione di variabile locale con un inizializzatore
        var a_number = 100; // a_number è di tipo int
        
        // OK - dichiarazione di variabile locale con un inizializzatore di array 
        // preceduto però dall'espressione di creazione new int[]
        var an_array = new int[] { 1, 2, 3 }; // an_array è di tipo int[]                
        
        // OK - dichiarazione di variabile locale con un inizializzatore
        var my_list = new ArrayList<String>(); // my_list è di tipo ArrayList<String>
        my_list.add("DATA1");
        my_list.add("DATA2");

        // OK - dichiarazione di variabile locale nell'ambito di un ciclo for
        for (var j = 10; j >= 0; j--) // j è di tipo int
            System.out.printf("%d ", j);

        System.out.printf("%n"); // 10 9 8 7 6 5 4 3 2 1 0 

        // OK - dichiarazione di variabile locale nell'ambito di un ciclo for "migliorato"
        for (var item : my_list) // item è di tipo String
            System.out.printf("%s ", item); // DATA1 DATA2 
        
        // OK - dichiarazione di variabile locale nell'ambito di 
        // un'istruzione try-with-resources
        try (var br = new BufferedReader(new FileReader("Numbers.txt")))
        {
            var a_line = br.readLine(); 
        }
        catch (IOException exc) {}
    }
}                                
                                                                                                                                                                