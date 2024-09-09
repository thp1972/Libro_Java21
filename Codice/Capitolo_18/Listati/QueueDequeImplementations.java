package LibroJava.Capitolo18;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDequeImplementations
{
    public static void main(String[] args)
    {
        int numbers_to_put[] = { 12, 44, 10, 0, -1, 4, 33, -10, -9, 100 };

        Queue<Integer> numbers = new PriorityQueue<>(); // PriorityQueue 
        for (int i = 0; i < numbers_to_put.length; i++) // aggiungo dei numeri alla coda 
            numbers.offer(numbers_to_put[i]);
  
        Integer elem = numbers.poll();

        while (elem != null)
        {
            System.out.print(elem + " "); // mostro i numeri della coda 
            // secondo la loro priorità 
            elem = numbers.poll();
        }
        System.out.println();
    }
}
