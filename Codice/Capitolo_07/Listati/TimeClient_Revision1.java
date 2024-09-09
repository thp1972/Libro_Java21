package LibroJava.Capitolo7;

public class TimeClient_Revision1
{
    public static void main(String[] args)
    {
        // ERRORE - nella classe Time_Revision1 esiste solo un costruttore e
        // questi non accetta argomenti
        // error: constructor Time_Revision1 in class Time_Revision1 cannot be applied to given types;
        // Time_Revision1 t = new Time_Revision1(5);
        // required: no arguments
        // found: int
        // reason: actual and formal argument lists differ in length
        Time_Revision1 t = new Time_Revision1(5);
    }
}
