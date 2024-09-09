package LibroJava.Capitolo15;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 * <b>Classe</b> per la gestione di un <i>time</i>
 * </p>
 *
 * @author Pellegrino ~thp~ Principe
 * @version 1.0
 */
public class Time_Revision7
{
    /**
     * Indica un messaggio generico
     */
    private static final String MSG = "Orario corrente: ";

    /**
     * Indica l'ora
     */
    private int hours;

    /**
     * Indica i minuti
     */
    private int minutes;

    /**
     * Indica i secondi
     */
    private int seconds;

    /**
     * Crea un oggetto di tipo Time_Revision7 con valori di default
     */
    public Time_Revision7() // costruttore senza parametri
    {
        this(0, 0, 0);
    }

    /**
     * Crea un oggetto di tipo Time_Revision7 con la possibilità di passare
     * l'ora
     *
     * @param h indica l'ora
     */
    public Time_Revision7(int h) // costruttore che inizializza solo l'ora
    {
        this(h, 0, 0);
    }

    /**
     * Crea un oggetto di tipo Time_Revision7 con la possibilità di passare
     * l'ora e i minuti
     *
     * @param h indica l'ora
     * @param m indica i minuti
     */
    public Time_Revision7(int h, int m) // costruttore che inizializza ora e minuti
    {
        this(h, m, 0);
    }

    /**
     * Crea un oggetto di tipo Time_Revision7 con la possibilità di passare
     * l'ora, i minuti e i secondi
     *
     * @param h indica l'ora
     * @param m indica i minuti
     * @param s indica i secondi
     */
    public Time_Revision7(int h, int m, int s) // costruttore che inizializza ora, minuti e secondi
    {
        // centralizziamo tutta la logica di inizializzazione qui!
        setTime(h, m, s);
    }

    /**
     * Crea un oggetto di tipo Time_Revision7 con la possibilità di passare un
     * oggetto del suo stesso tipo
     *
     * @param t indica un oggetto di tipo Time_Revision7
     */
    public Time_Revision7(Time_Revision7 t)
    {
        setTime(t.hours, t.minutes, t.seconds);
    }

    /**
     * Ritorna l'ora
     *
     * @return un <code>int</code> con l'ora
     */
    public int getHours() // ottengo l'ora
    {
        return hours;
    }

    /**
     * Ritorna i minuti
     *
     * @return un <code>int</code> con i minuti
     */
    public int getMinutes() // ottengo i minuti 
    {
        return minutes;
    }

    /**
     * Ritorna i secondi
     *
     * @return un <code>int</code> con i secondi
     */
    public int getSeconds() // ottengo i secondi 
    {
        return seconds;
    }

    /**
     * Ritorna un orario formattato come hh:mm:ss
     *
     * @return un oggetto <code>String</code> con l'orario
     */
    public String getTime() // metodo per ottenere un tempo
    {
        return LocalTime.of(hours, minutes, seconds).
                format(DateTimeFormatter.ISO_TIME);
    }

    /**
     * Imposta l'ora
     *
     * @param h indica l'ora
     * @return l'oggetto <code>Time_Revision7</code> corrente
     */
    public Time_Revision7 setHours(int h) // imposto l'ora e ritorno il riferimento this 
    {
        hours = (h < 24 && h >= 0) ? h : 0;
        return this;
    }

    /**
     * Imposta i minuti
     *
     * @param m indica i minuti
     * @return l'oggetto <code>Time_Revision7</code> corrente
     */
    public Time_Revision7 setMinutes(int m) // imposto i minuti e ritorno il riferimento this 
    {
        minutes = (m < 60 && m >= 0) ? m : 0;
        return this;
    }

    /**
     * Imposta i secondi
     *
     * @param s indica i secondi
     * @return l'oggetto <code>Time_Revision7</code> corrente
     */
    public Time_Revision7 setSeconds(int s) // imposto i secondi e ritorno il riferimento this 
    {
        seconds = (s < 60 && s >= 0) ? s : 0;
        return this;
    }

    /**
     * Imposta un orario
     *
     * @param h indica l'ora
     * @param m indica i minuti
     * @param s indica i secondi
     *
     * @see LibroJava.Capitolo15.Time_Revision7#setHours
     * @see Time_Revision7#setMinutes
     * @see #setSeconds
     */
    public void setTime(int h, int m, int s) // metodo per impostare un tempo
    {
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }

    /**
     * Ritorna una rappresentazione leggibile di un oggetto Time_Revision7
     *
     * @return una <code>String</code> che rappresenta un Time_Revision7
     *
     */
    public String toString() // stampa una rappresentazione leggibile di un oggetto Time_Revision7
    {
        return MSG + getTime();
    }
}
