package LibroJava.Capitolo7;

public class TimeClient_Revision5
{
    public static void main(String[] args)
    {
        Time_Revision5 t = new Time_Revision5();

        t.setTime(14, 30, 56);

        // ottengo singolarmente le ore, i minuti e i secondi
        System.out.printf("Ora: %d - Minuti: %d - Secondi: %d%n",
                          t.getHours(), t.getMinutes(), t.getSeconds());
    }
}
