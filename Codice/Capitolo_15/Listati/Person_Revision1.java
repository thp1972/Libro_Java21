package LibroJava.Capitolo15;

/**
 * <p>
 * <b>Classe</b> per la gestione di una generica <i>persona</i>
 * </p>
 *
 * @author Pellegrino ~thp~ Principe
 * @see LibroJava.Capitolo15.Time_Revision7
 * @version 1.0
 */
public class Person_Revision1
{
    /**
     * Indica il nome di una persona
     */
    private String first_name;

    /**
     * Indica il cognome di una persona
     */
    private String last_name;

    /**
     * Indica un oggetto <code>Time_Revision7</code>
     */
    private Time_Revision7 working_time; // oggetto di tipo Time_Revision7

    /**
     * Crea un oggetto di tipo Person_Revision1
     *
     * @param first_name indica il nome
     * @param last_name indica il cognome
     * @param time indica quando inizia il lavoro
     * @throws IllegalArgumentException se inizia il lavoro dopo le 9
     */
    public Person_Revision1(String first_name, String last_name, Time_Revision7 time)
    {
        this.first_name = first_name;
        this.last_name = last_name;

        if (time.getHours() > 9)
            throw new IllegalArgumentException("Attenzione il lavoro inizia prima delle 9...");

        working_time = time;
    }

    /**
     * Ritorna una rappresentazione leggibile di un oggetto Person_Revision1
     *
     * @return una <code>String</code> che rappresenta un Person_Revision1
     */
    public String toString()
    {
        return last_name + " " + first_name + " inizia il lavoro alle: "
               + working_time.getTime();
    }
}
