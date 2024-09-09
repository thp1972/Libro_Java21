package LibroJava.Capitolo3;

public class Snippet_3_15
{
    public static void main(String[] args)
    {
        int[][][] a = new int[][][] // I forma
        { // array irregolare a tre dimensioni
            new int[][] // I tabella
            {
                new int[] { 1, 4, 6 }, // tre colonne I riga
                new int[] { 1, 3 },    // due colonne II riga
                new int[] { 3 }        // una colonna III riga
            },
            new int[][] // II tabella
            {
                new int[] { 7, 4, 5 }, // tre colonne I riga
                new int[] { 9, 7 },    // due colonne II riga
                new int[] { 3 }        // una colonna III riga
            }
        };
        
        int[][][] b = // II forma
        { // array irregolare a tre dimensioni
            { // I tabella
                { 1, 4, 6 }, // tre colonne I riga
                { 1, 3 },    // due colonne II riga
                { 3 }        // una colonna III riga
            },
            { // II tabella
                { 7, 4, 5 }, // tre colonne I riga
                { 9, 7 },    // due colonne II riga
                { 3 }        // una colonna III riga
            }
        };
        
        int[][][] c = new int[][][] // mix tra la I e la II forma
        { // array irregolare a tre dimensioni
            new int[][] // I tabella
            {
                { 1, 4, 6 },        // tre colonne I riga
                new int[] { 1, 3 }, // due colonne II riga
                { 3 }               // una colonna III riga
            },
            { // II tabella
                { 7, 4, 5 },    // tre colonne I riga
                { 9, 7 },       // due colonne II riga
                new int[] { 3 } // una colonna III riga
            }
        };
    }
}
