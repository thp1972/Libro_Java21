package LibroJava.Capitolo7;

public class ObjectsAndArray
{
    public static void main(String[] args)
    {
        // array di tipo Time_Revision7
        Time_Revision7[] times =
        {
            new Time_Revision7(10, 00, 00),
            new Time_Revision7(11, 00, 00),
            new Time_Revision7(12, 00, 00)
        };

        for (int i = 0; i < times.length; i++)
        {
            System.out.printf("times[%d] - %s%n", i, times[i]);
        }
    }
}
