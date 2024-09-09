package LibroJava.Capitolo3;

public class Snippet_3_11
{
    public static void main(String[] args)
    {
        // una matrice irregolare
        int[][] a = new int[][]
        {
            new int[] { 1, 4, 6 },
            new int[] { 1, 3, 5 }
        };

        // leggo il valore della seconda colonna della prima riga
        // oppure, detto in altro modo, il valore alla riga 0 colonna 1
        int nr = a[0][1]; // 4

        // scrivo un valore nella terza colonna della seconda riga
        // oppure, detto in altro modo, il valore alla riga 1 colonna 2
        a[1][2] = 100;
    }
}
