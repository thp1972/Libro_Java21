package LibroJava.Capitolo5;

public class EnhancedFor
{
    public static void main(String[] args)
    {
        int[] a = { 1, 200, 400, 500 };
        int sum = 0;

        // la variabile elem non potrà modificare il corrente elemento
        // dell'array in fase di processing
        // conterrà, in successione, i valori 1, 200, 400 e 500
        // al termine dell'elaborazione del for "migliorato" non sarà visibile
        // all'interno del metodo main
        // questo for può essere letto così:
        // "per ogni elemento dell'array a ricavane il valore e assegnalo alla
        // variabile sum..." 
        for(int elem : a) // for "migliorato"
            sum += elem;

        System.out.printf("La somma è: %d%n", sum);
    }
}
