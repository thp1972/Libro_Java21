package LibroJava.Capitolo4;

public class Snippet_4_31
{
    public static void main(String[] args)
    {
        // 11111111 11111111 11111111 11100000
        int number = -32;

        // 0000 0001
        byte positions = 1;

        // 01111111 11111111 11111111 11110000
        int result = number >>> positions;

        // 11111111 11111111 11111111 11100000 ---> -32
        //                            00000001 --->   1
        // -----------------------------------      >>>
        // 01111111 11111111 11111111 11110000 ---> 2147483632
    }
}
