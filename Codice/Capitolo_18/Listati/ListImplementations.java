package LibroJava.Capitolo18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListImplementations
{
    public static void main(String[] args)
    {
        List<Integer> al_numbers = new ArrayList<>(10); // ArrayList 
        List<Integer> ll_numbers = new LinkedList<>(); // LinkedList 

        for (int i = 0; i < 10; i++) // aggiungo 10 numeri casuali all'ArrayList 
            al_numbers.add(i, new Random().nextInt(20)); 
        System.out.println("Numeri presenti nella lista ArrayList " + al_numbers);

        for (int i = 0; i < 10; i++) // aggiungo 10 numeri casuali alla LinkedList 
            ll_numbers.add(new Random().nextInt(20));    
        System.out.println("Numeri presenti nella lista LinkedList " + ll_numbers);

        // rimuovo dalla lista al_numbers i numeri eventualmente presenti 
        // nella lista ll_numbers 
        al_numbers.removeAll(ll_numbers);

        System.out.println("Dopo la rimozione numeri presenti nella lista ArrayList "
                           + al_numbers);
    }
}
