package LibroJava.Capitolo4;

public class Snippet_4_25
{
    public static void main(String[] args)
    {
        // 0000 1010
        byte number = 10;

        // 1111 0101
        byte result = (byte) ~number; // -11
        
        // 0000 1010 --->  10
        // ---------       ~
        // 1111 0101 ---> -11                                           
    }
}
