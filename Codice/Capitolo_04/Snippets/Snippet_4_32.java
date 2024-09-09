package LibroJava.Capitolo4;

public class Snippet_4_32
{
    public static void main(String[] args)
    {
        // valore decimale: 100
        // valore binario: 0000 0000 0110 0100
        // valore esadecimale: 64
        short value = 0x0064;
        // valore decimale: 3840
        // valore binario: 0000 1111 0000 0000
        // valore esadecimale: F00
        final short MASK = 0x0F00;

        // valore decimale: 3940
        // valore binario: 0000 1111 0110 0100
        // valore esadecimale: F64
        value = (short) (value | MASK); // imposto i bit 8, 9, 10 e 11 a 1
    }
}
