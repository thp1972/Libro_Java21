package LibroJava.Capitolo4;

public class Snippet_4_34
{
    public static void main(String[] args)
    {
        // valore decimale: 100
        // valore binario: 0000 0000 0110 0100
        // valore esadecimale: 64
        short value = 0x0064;

        // valore decimale: 4
        // valore binario: 0000 0000 0000 0100
        // valore esadecimale: 4
        final short MASK = 0x0004;

        boolean is_bit_2_setted = (value & MASK) == MASK; // true
        boolean is_bit_3_setted = (value & MASK << 1) == MASK << 1; // false
    }
}
