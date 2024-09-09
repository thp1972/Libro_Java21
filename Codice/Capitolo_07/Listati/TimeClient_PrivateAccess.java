package LibroJava.Capitolo7;

public class TimeClient_PrivateAccess
{
    public static void main(String[] args)
    {
        Time_Revision4 t = new Time_Revision4();
        t.setTime(14, 30, 56);

        // ERRORE - il membro hours ha lo specificatore private
        // error: hours has private access in Time_Revision4
        t.hours = 15;
    }
}
