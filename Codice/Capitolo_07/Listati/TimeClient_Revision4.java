package LibroJava.Capitolo7;

public class TimeClient_Revision4
{
    public static void main(String[] args)
    {
        // è lo stesso di Time_Revision4(0, 0, 0);
        Time_Revision4 t1 = new Time_Revision4();
        System.out.printf("t1 - %s%n", t1);

        // è lo stesso di Time_Revision4(15, 0, 0);
        Time_Revision4 t2 = new Time_Revision4(15);
        System.out.printf("t2 - %s%n", t2);

        // è lo stesso di Time_Revision4(15, 30, 0);
        Time_Revision4 t3 = new Time_Revision4(15, 30);
        System.out.printf("t3 - %s%n", t3);

        Time_Revision4 t4 = new Time_Revision4(15, 30, 25);
        System.out.printf("t4 - %s%n", t4);
    }
}
