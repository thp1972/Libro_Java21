package LibroJava.Capitolo3;

public class Snippet_3_16
{
    public static void main(String[] args)
    {
         // un array irregolare 3D
        int[][][] a = 
        { 
            {
                { 1, 4, 6 },
                { 1, 3, 5 }
            },
            {
                { 6, 7, 6 },
                { 0, 9, 0 }
            }
        };
        
        // leggo il valore della terza colonna della prima riga della prima tabella
        // oppure, detto in altro modo, il valore della tabella 0, riga 0 colonna 2
        int nr = a[0][0][2]; // 6
        
        // scrivo un valore nella terza colonna della seconda riga della seconda tabella
        // oppure, detto in altro modo, il valore alla tabella 1, riga 1, colonna 2
        a[1][1][2] = 100;
    }
}
