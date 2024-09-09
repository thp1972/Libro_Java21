package LibroJava.Capitolo7;

public class TimeClient_Revision2
{
    public static void main(String[] args)
    {
        // invocazione dei vari costruttori di Time_Revision2
        Time_Revision2 t1 = new Time_Revision2(4);
        Time_Revision2 t2 = new Time_Revision2(18, 30);
        Time_Revision2 t3 = new Time_Revision2(t2);

        System.out.printf("[t1 = %s, t2 = %s, t3 = %s]%n",
                          t1.getTime(),
                          t2.getTime(),
                          t3.getTime());
    }
}
