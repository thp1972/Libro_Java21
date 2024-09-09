package LibroJava.Capitolo3;

public class Snippet_3_14
{
    public static void main(String[] args)
    {
        int[][][] a; // un array irregolare a tre dimensioni

        // inizializza un array irregolare 3D con tre tabelle di 2x3 elementi
        a = new int[3][][]; // a è un array di tipo int[][][]

        // prima tabella 2x3
        a[0] = new int[2][];  // a[0] è un array di tipo int[][]
        a[0][0] = new int[3]; // a[0][0] è un array di tipo int[]
        a[0][1] = new int[3]; // a[0][1] è un array di tipo int[]

        // seconda tabella 2x3
        a[1] = new int[2][];  // a[1] è un array di tipo int[][]
        a[1][0] = new int[3]; // a[1][0] è un array di tipo int[]
        a[1][1] = new int[3]; // a[1][1] è un array di tipo int[]

        // terza tabella 2x3
        a[2] = new int[2][];  // a[2] è un array di tipo int[][]
        a[2][0] = new int[3]; // a[2][0] è un array di tipo int[]
        a[2][1] = new int[3]; // a[2][1] è un array di tipo int[]
    }
}
