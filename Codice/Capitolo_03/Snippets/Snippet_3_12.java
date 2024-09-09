package LibroJava.Capitolo3;

public class Snippet_3_12
{
    public static void main(String[] args)
    {      
        // una matrice irregolare; di tipo double[][]
        double[][] other_data =
        {
            new double[] { 890.00, 899.00, 1000.11, 998.55 }, // 4 col.
            new double[] { 789.59, 800.00, 1234.99 },         // 3 col.
            new double[] { 1490.00, 497.33 },                 // 2 col.
            new double[] { 678.00 }                           // 1 col.
        };
        
        int rows = other_data.length; // 4
        for (int i = 0; i < rows; i++)
        {
            // ricordiamo che un array  irregolare bidimensionale è di fatto un array di array
            // quindi ogni elemento di ogni riga è in realtà un array di un
            // certo tipo; nel nostro caso un array di double
            double[] current_row = other_data[i]; // corrente array di double; double[]
            System.out.printf("%d%n", current_row.length); // stampa in successione 4 3 2 1
        }
    }
}
