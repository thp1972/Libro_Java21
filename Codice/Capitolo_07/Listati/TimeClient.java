package LibroJava.Capitolo7;

public class TimeClient
{
    public static void main(String[] args)
    {
        Time t = new Time(); // istanza di Time
        System.out.printf("Time con i valori di default: %s%n", t.getTime());

        t.setTime(14, 30, 56); // imposto nuovi valori per un tempo
        System.out.printf("Time con i valori impostati: %s%n", t);
    }
}
