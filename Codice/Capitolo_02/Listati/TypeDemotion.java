package LibroJava.Capitolo2;

public class TypeDemotion
{
    public static void main(String[] args)
    {
        int a = 260;
        double d = 323.123;
        byte b;

        // il risultato sarà 4 per effetto del troncamento dei bit più
        // significativi del tipo int proprio di a
        // int a  --> 00000000 00000000 00000001 00000100 (valore 260) 
        // byte b -->                            00000100 (valore 4)
        b = (byte) a;
        System.out.printf("b = (byte) a ---> %2d%n", b);

        // il risultato sarà 67, infatti prima 323.123 sarà troncato in 323
        // e poi vi sarà il troncamento dei suoi bit più significativi
        // 00000000 00000000 00000001 01000011 (valore 323)
        //                            01000011 (valore 67)
        b = (byte) d;
        System.out.printf("b = (byte) d ---> %2d%n", b);
    }
}
