package LibroJava.Capitolo4;

public class ConditionalOperator
{
    public static void main(String[] args)
    {
        final int SIZE = 9;
        
        // matrice per la ricerca
        int[][] values = // 3x3
                {
                    {10, 100, 30},
                    {-22, -11, 66},
                    {105, 204, 333}
                };
        
        int filter_value = 34; // valore da confrontare
        int[] found_values = new int[SIZE]; // valori trovati

        // ciclo per la ricerca
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < values[0].length; j++)
            {
                int value = values[i][j];
                
                // posiziono il valore trovato nell'array spostandomi
                // alla corretta posizione
                if (value % 2 == 0)
                    found_values[i * values[j].length + j] =
                    value > filter_value ? value : 0; // espressione condizionale
            }
        }

        // valori trovati
        for (int i = 0; i < SIZE; i++)
            System.out.printf("Indice %d ---> [ %3d ]%n", i, found_values[i]);
    }
}
