package LibroJava.Capitolo3;

public class ThreeDimensionalSpace
{
    public static void main(String[] args)
    {
        final int X = 100;
        final int Y = 100;
        final int Z = 20;

        // uno spazio tridimensionale: coordinate x, y e z
        boolean[][][] space = new boolean[X][Y][Z];

        // mettiamo qualche punto nello spazio: true significa che il punto
        // è presente in quella coordinata; false significa assenza del punto
        space[0][0][0] = true;
        space[0][0][2] = true;
        space[0][1][0] = true;
        space[0][1][1] = true;
        space[0][1][2] = true;
        space[0][2][1] = true;

        for (int x = 0; x < X; x++)
        {
            for (int y = 0; y < Y; y++)
            {
                for (int z = 0; z < Z; z++)
                {
                    // comunica le coordinate spaziali; solo se è presente un punto
                    if (space[x][y][z])
                    {
                        System.out.printf("[X = %d, Y = %d, Z = %d]%n", x, y, z);
                    }
                }
            }
        }
    }
}
