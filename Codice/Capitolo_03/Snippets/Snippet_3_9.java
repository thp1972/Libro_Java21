package LibroJava.Capitolo3;

public class Snippet_3_9
{
    public static void main(String[] args)
    {
        // inizializza formalmente un array "rettangolare" 2x3
        // ma in memoria sarà comunque rappresentato come un array di array
        // a è un array di tipo int[][]
        int[][] a = new int[2][3]; // righe e colonne indicate

        // inizializza sostanzialmente un array irregolare 2x3 dove ogni
        // elemento "riga" è un array degli elementi "colonna"
        // b è un array di tipo int[][]
        int[][] b = new int[2][]; // righe indicate ma colonne non indicate
        b[0] = new int[3]; // b[0] è un array di tipo int[]
        b[1] = new int[3]; // b[1] è un array di tipo int[]
    }
}
