package LibroJava.Capitolo7;

public class TimeClient_Revision6
{
    public static void main(String[] args)
    {
        Time_Revision6 t = new Time_Revision6();

        // imposta singolarmente ora, minuti e secondi
        t.setHours(8);
        t.setMinutes(30);
        t.setSeconds(5);

        // ottengo l'ora impostata che sarà formattata come: 08:30:05
        System.out.println(t);
    }
}
