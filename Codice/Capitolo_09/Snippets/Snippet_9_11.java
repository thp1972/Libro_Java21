package LibroJava.Capitolo9;

import java.util.ArrayList;

class Numbers<T> { } // una classe generica

public class Snippet_9_11
{
    public static void main(String[] args)
    {
        // non è possibile creare int_number come tipo Numbers<Integer>[]
        // error: cannot create array with '<>'
        Numbers<Integer>[] int_number = new Numbers<>[4];

        // è comunque possibile usare la seguente soluzione che prevede
        // l'utilizzo del tipo ArrayList<E> 
        // in pratica numbers sarà una collezione ordinata di elementi di
        // tipo Numbers<Integer> 
        ArrayList<Numbers<Integer>> numbers = new ArrayList<>();
        
        // in immissione
        numbers.add(new Numbers<>()); // 1 elemento
        numbers.add(new Numbers<>()); // 2 elemento
        
        // in ottenimento
        Numbers<Integer> number_1 = numbers.get(0); // 1 elemento
        Numbers<Integer> number_2 = numbers.get(0); // 2 elemento
    }
}
