package LibroJava.Capitolo7;

public class Time_Revision1 extends Object
{
    // variabili di istanza private
    private int hours;
    private int minutes;
    private int seconds;

    public Time_Revision1() // costruttore di istanza
    {
        hours = minutes = seconds = 0;
    }

    // metodo non costruttore che ritorna semplicemente il valore passato al parametro 
    public int Time_Revision1(int a)
    {
        return a;
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

    public String toString() // stampa una rappresentazione leggibile di un oggetto Time_Revision1
    {
        return "Orario corrente: " + getTime();
    }
}