package LibroJava.Capitolo7;

public class Time_Revision2 extends Object
{
    // variabili di istanza private
    private int hours;
    private int minutes;
    private int seconds;

    public Time_Revision2() // costruttore senza parametri
    {
        setTime(0, 0, 0);
    }

    public Time_Revision2(int h) // costruttore che inizializza solo l'ora
    {
        setTime(h, 0, 0);
    }

    public Time_Revision2(int h, int m) // costruttore che inizializza ora e minuti
    {
        setTime(h, m, 0);
    }

    public Time_Revision2(int h, int m, int s) // costruttore che inizializza ora,
                                               // minuti e secondi
    {
        setTime(h, m, s);
    }
    
    // costruttore che inizializza un oggetto Time_Revision2
    // attraverso un altro oggetto Time_Revision2
    public Time_Revision2(Time_Revision2 t)
    {
        setTime(t.hours, t.minutes, t.seconds);
    }

    public void setTime(int h, int m, int s) // metodo per impostare un tempo
    {
        hours = (h < 24 && h >= 0) ? h : 0;
        minutes = (m < 60 && m >= 0) ? m : 0;
        seconds = (s < 60 && s >= 0) ? s : 0;
    }

    public String getTime() // metodo per ottenere un tempo
    {
        return hours + ":" + minutes + ":" + seconds;
    }

    public String toString() // stampa una rappresentazione leggibile di un oggetto Time_Revision2
    {
        return "Orario corrente: " + getTime();
    }
}
