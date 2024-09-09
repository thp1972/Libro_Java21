package LibroJava.Capitolo2;

public class Snippet_2_16
{
    public static void main(String[] args)
    {
        int number = 100; // number è una variabile di tipo int (tipo primitivo)
        Integer int_obj = number; // int_obj è una variabile di tipo Integer (wrapper class)
                                  // avviene l'autoboxing di number

        // questa modifica non si ripercuoterà su int_obj
        number = 200;
        System.out.printf("%d%n", int_obj); // 100

        // questa modifica non si ripercuoterà su number
        int_obj = 400; // anche qui ci sarà l'autoboxing del letterale intero 400
        System.out.printf("%d%n", number); // 200
    }
}
