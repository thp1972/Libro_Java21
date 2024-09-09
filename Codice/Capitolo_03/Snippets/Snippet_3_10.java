package LibroJava.Capitolo3;

public class Snippet_3_10
{
    public static void main(String[] args)
    {
        int[][] a = new int[][] // I forma
        { // array irregolare a due dimensioni
            new int[] { 1, 4, 6 }, // tre colonne I riga
            new int[] { 1, 3 },    // due colonne II riga
            new int[] { 3 }        // una colonna III riga
        };

        int[][] b = // II forma
        { // array irregolare a due dimensioni
            { 1, 4, 6 }, // tre colonne I riga            
            { 1, 3 },    // due colonne II riga            
            { 3 }        // una colonna III riga
        };
        
        // mix tra la I e la II forma
        int[][] c = new int[][]
        { // array irregolare a due dimensioni
            new int[] { 1, 4, 6 }, // tre colonne I riga    
            { 1, 3 },              // due colonne II riga   
            { 1 }                  // una colonna III riga
        };
    }
}
