package LibroJava.Capitolo4;

public class Snippet_4_36
{
    public static void main(String[] args)
    {
        // valore decimale: 11393254
        // valore binario: 0000 0000 1010 1101 1101 1000 1110 0110
        // valore esadecimale: ADD8E6
        int color = 0xADD8E6; // Light blue RGB

        // valore decimale: 255
        // valore binario: 0000 0000 1111 1111
        // valore esadecimale: FF
        final short MASK = 0x00FF;

        // valore decimale: 230
        // valore binario: 0000 0000 1110 0110
        // valore esadecimale: E6
        short BLUE = (short) (color & MASK); // E6

        // valore decimale: 216
        // valore binario: 0000 0000 1101 1000
        // valore esadecimale: D8
        short GREEN = (short) (color >> 8 & MASK); // D8

        // valore decimale: 173
        // valore binario: 0000 0000 1010 1101
        // valore esadecimale: AD
        short RED = (short) (color >> 16 & MASK); // AD
    }
}
