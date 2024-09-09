package LibroJava.Capitolo9;

public class PrintArrayClient
{
    public static void main(String[] args)
    {
        PrintArray pa = new PrintArray();

        double[] d = { 11.1, 11.2 };
        int[] i =    { 12, 13 };
        char[] c =   { 'a', 'b' };

        System.out.print("[ ");
        pa.printArray(d);
        pa.printArray(i);
        pa.printArray(c);
        System.out.println("] ");
    }
}
