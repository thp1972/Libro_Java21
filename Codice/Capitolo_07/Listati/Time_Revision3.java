package LibroJava.Capitolo7;

public class Time_Revision3
{
    // variabili di istanza private
    private int hours;
    private int minutes;
    private int seconds;

    public Time_Revision3() // costruttore senza parametri
    {
        setTime(0, 0, 0);
    }

    public Time_Revision3(int h) // costruttore che inizializza solo l'ora
    {
        setTime(h, 0, 0);
    }

    public Time_Revision3(int h, int m) // costruttore che inizializza ora e minuti
    {
        setTime(h, m, 0);
    }

    public Time_Revision3(int h, int m, int s) // costruttore che inizializza ora,
    // minuti e secondi
    {
        setTime(h, m, s);
    }

    // costruttore che inizializza un oggetto Time_Revision3
    // attraverso un altro oggetto Time_Revision3
    public Time_Revision3(Time_Revision3 t)
    {
        setTime(t.hours, t.minutes, t.seconds);
    }

    public Time_Revision3 setHours(int h) // imposto l'ora e ritorno il riferimento this 
    {
        hours = (h < 24 && h >= 0) ? h : 0;
        return this;
    }

    public Time_Revision3 setMinutes(int m) // imposto i minuti e ritorno il riferimento this 
    {
        minutes = (m < 60 && m >= 0) ? m : 0;
        return this;
    }

    public Time_Revision3 setSeconds(int s) // imposto i secondi e ritorno il riferimento this 
    {
        seconds = (s < 60 && s >= 0) ? s : 0;
        return this;
    }

    public void setTime(int h, int m, int s) // metodo per impostare un tempo
    {
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }

    public String getTime() // metodo per ottenere un tempo
    {
        return hours + ":" + minutes + ":" + seconds;
    }

    public String toString() // stampa una rappresentazione leggibile di un oggetto Time_Revision3
    {
        return "Orario corrente: " + getTime();
    }
}