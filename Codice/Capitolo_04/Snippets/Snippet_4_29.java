package LibroJava.Capitolo4;

public class Snippet_4_29
{
    public static void main(String[] args)
    {
        // 0010 0000
        byte number = 32;

        // 0000 0001
        byte positions = 1;

        // 0100 0000
        byte result = (byte) (number << positions); // 64 o 32 * 2^1

        // 0010 0000 ---> 32   
        // 0000 0001 --->  1
        // ---------      <<
        // 0100 0000 ---> 64                       
    }
}
