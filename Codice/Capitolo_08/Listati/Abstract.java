package LibroJava.Capitolo8;

public class Abstract
{
    private static void displayEarning(Employee e)
    {
        System.out.printf("%s%d%n", e, e.earning());
    }

    public static void main(String[] args)
    {
        Employee e;
        Engineer eng = new Engineer("Pellegrino", "Principe", 10, 1000);
        Technician tec = new Technician("Paolo", "Canali", 800, 3);
        Laborer lab = new Laborer("Aldo", "Falco", 2, 44);

        e = eng; // ora è un Engineer
        displayEarning(e);

        e = tec; // ora è un Technician
        displayEarning(e);

        e = lab; // ora è un Laborer
        displayEarning(e);
    }
}
