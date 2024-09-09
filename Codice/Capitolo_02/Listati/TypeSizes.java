package LibroJava.Capitolo2;

public class TypeSizes
{
    public static void main(String[] args)
    {
      System.out.printf
        (
            """
            ************************************
            * TYPE SIZES DEI TIPI FONDAMENTALI *
            ************************************
             byte           %d byte
             short          %d byte
             int            %d byte
             long           %d byte
             char           %d byte
             float          %d byte
             double         %d byte
             boolean        %c byte
            ************************************
            """,
            Byte.BYTES, Short.BYTES, Integer.BYTES, Long.BYTES,
            Character.BYTES, Float.BYTES, Double.BYTES,
            '-' // il tipo Boolean non ha il campo BYTES
        );
    }
}