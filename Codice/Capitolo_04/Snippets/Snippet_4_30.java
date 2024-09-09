package LibroJava.Capitolo4;

public class Snippet_4_30
{
    public static void main(String[] args)
    {
        // 0011 0111
        byte number = 55;

        // 0000 0011
        byte positions = 3;

        // 0000 0110
        byte result = // 6 uguale all'applicazione di una funzione FLOOR(55 / 2^3)
        (byte) (number >> positions);

        // 0011 0111 ---> 55
        // 0000 0011 --->  3
        // ---------      >>
        // 0000 0110 --->  6
        
        // 1100 1001
        byte other_number = -55;
        
        // 0000 0011
        byte other_positions_2 = 3;
        
        // 1111 1001
        byte other_result =  // -7 uguale all'applicazione di una funzione FLOOR(-55 / 2^3)
        (byte) (other_number >> other_positions_2);
        
        // 1100 1001 ---> -55
        // 0000 0011 --->   3
        // ---------       >>
        // 1111 1001 --->  -7        
    }
}
