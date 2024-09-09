package LibroJava.Capitolo4;

public class Snippet_4_28
{
    public static void main(String[] args)
    {
        // 0001 1110
        byte number_1 = 30;

        // 0001 0100
        byte number_2 = 20;

        // 0001 1110
        byte result = (byte) (number_1 ^ number_2); // 10

        // 0001 1110 ---> 30
        // 0001 0100 ---> 20
        // ---------      ^
        // 0000 1010 ---> 10                               
    }
}
