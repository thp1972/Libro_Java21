package LibroJava.Capitolo4;

public class RelationalOperators
{
    public static void main(String[] args)
    {
        // matrice per la ricerca
        int[][] values = // 3x3
                {
                    {10, 20, 30},
                    {-22, -11, -18},
                    {105, 205, -963}
                };
        
        int[] filter_values = { 33, 13, 56 }; // valori da confrontare
        
        int how_many = 0; // tiene traccia delle occorrenze trovate
        
        // ciclo per la ricerca
        for (int k = 0; k < filter_values.length; k++)
        {
            for (int i = 0; i < values.length; i++)
            {
                for (int j = 0; j < values[i].length; j++)
                {
                    int value1 = values[i][j];
                    int value2 = filter_values[k];

                    System.out.printf("Il valore %4d è minore del valore %3d ?",
                                      value1, value2);

                    if (value1 < value2)
                    {
                        how_many++; // incrementiamo di 1 la variabile
                        System.out.println(" VERO");
                    }
                    else
                        System.out.println(" FALSO");
                }
            }
        }
        System.out.printf("Numero valori trovati: %d%n", how_many);
    }
}
