package LibroJava.Capitolo6;

public class TwoDimArrayAsParameter
{
    public static int search(int[][] data)
    {
        int nr = 0;

        for (int r = 0; r < data.length; r++)
        {
            for (int c = 0; c < data[r].length; c++)
            {
                int val = data[r][c];
                if (val < 0)
                    nr++;
            }
        }
        return nr;
    }

    public static void main(String[] args)
    {
        // una matrice irregolare
        int[][] data =
        {
            { 1, 2, 3, 4, 5 },
            { -4, -6, 10, 2, 9 },
            { 100, -100, 33, 34, 24 }
        };

        // invocazione di search
        int res = search(data);

        System.out.printf("La matrice data contiene %d numeri negativi!%n", res);
    }
}
