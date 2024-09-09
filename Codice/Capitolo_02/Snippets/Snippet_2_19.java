package LibroJava.Capitolo2;

class T {} // definizione di una classe; T è un tipo riferimento

public class Snippet_2_19
{
    public static void main(String[] args)
    {
        int x[] = new int[2]; // creazione di un array; int[] è un tipo riferimento
        System.out.printf("Valore riferimento dell'array x: %s%n", 
                          x); // ... [I@ff5b51f
        
        T t = new T(); // creazione di un oggetto di tipo T; T è un tipo riferimento
        System.out.printf("Valore riferimento dell'oggetto t: %s%n", 
                          t); // ... LibroJava.Capitolo2.T@5702b3b1
    }
}
