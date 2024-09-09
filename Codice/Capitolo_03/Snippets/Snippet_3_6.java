package LibroJava.Capitolo3;

public class Snippet_3_6
{
    private class MyClass { };
    
    public static void main(String[] args)
    {
        boolean[] b = { false, false, true }; // array di booleani
        short[] s = new short[4]; // array di short
        byte[] by = { 1, 3, 4 }; // array di byte
        long[] l = new long[b.length]; // array di long
        float[] f = { 12.44f, 678.12f }; // array di float
        double[] d = { f[0], f[1], 12E4 }; // array di double
        String[] str = { "RED", new String( // array di stringhe
                                new char[] { 'G', 'R', 'E', 'E', 'N' }) }; 
        char[] ac = { 'h', 'e', 'l', 'l', 'o' }; // array di caratteri

        // in questo caso l'array obj può avere elementi di diverso tipo
        // perché il tipo Object è la classe base fondamentale da cui discendono
        // tutti gli altri tipi
        Object[] obj = new Object[] { false, 10 }; // array di oggetti di tipo Object

        MyClass[] mc = new MyClass[11]; // array di oggetti di tipo MyClass        
    }
}
