package LibroJava.Capitolo4;

public class Snippet_4_33
{
    public static void main(String[] args)
    {
        // valore decimale: 100
        // valore binario: 0000 0000 0110 0100
        // valore esadecimale: 64
        short value = 0x0064;

        // valore decimale: 96
        // valore binario: 0000 0000 0110 0000
        // valore esadecimale: 60
        final short MASK = 0x0060;

        // valore decimale: 4
        // valore binario: 0000 0000 0000 0100
        // valore esadecimale: 4
        value = (short) (value & ~MASK); // cancello i bit 5 e 6
    }
}
