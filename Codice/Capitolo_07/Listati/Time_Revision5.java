package LibroJava.Capitolo7;

public class Time_Revision5
{
    // variabili di istanza private
    private int hours;
    private int minutes;
    private int seconds;

    public Time_Revision5() // costruttore senza parametri
    {
        this(0, 0, 0);
    }

    public Time_Revision5(int h) // costruttore che inizializza solo l'ora
    {
        this(h, 0, 0);
    }

    public Time_Revision5(int h, int m) // costruttore che inizializza ora e minuti
    {
        this(h, m, 0);
    }

    public Time_Revision5(int h, int m, int s) // costruttore che inizializza ora, minuti e secondi
    {
        // centralizziamo tutta la logica di inizializzazione qui!
        setTime(h, m, s);
    }

    // costruttore che inizializza un oggetto Time_Revision5
    // attraverso un altro oggetto Time_Revision5
    public Time_Revision5(Time_Revision5 t)
    {
        setTime(t.hours, t.minutes, t.seconds);
    }

    public int getHours() // ottengo l'ora
    {
        return hours;
    }

    public int getMinutes() // ottengo i minuti 
    {
        return minutes;
    }

    public int getSeconds() // ottengo i secondi 
    {
        return seconds;
    }

    public String getTime() // metodo per ottenere un tempo
    {
        return hours + ":" + minutes + ":" + seconds;
    }

    public Time_Revision5 setHours(int h) // imposto l'ora e ritorno il riferimento this 
    {
        hours = (h < 24 && h >= 0) ? h : 0;
        return this;
    }

    public Time_Revision5 setMinutes(int m) // imposto i minuti e ritorno il riferimento this 
    {
        minutes = (m < 60 && m >= 0) ? m : 0;
        return this;
    }

    public Time_Revision5 setSeconds(int s) // imposto i secondi e ritorno il riferimento this 
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

    public String toString() // stampa una rappresentazione leggibile di un oggetto Time_Revision5
    {
        return "Orario corrente: " + getTime();
    }
}
