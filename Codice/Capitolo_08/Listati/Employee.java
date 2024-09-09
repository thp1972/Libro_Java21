package LibroJava.Capitolo8;

public abstract class Employee // classe astratta
{
    private String firstName;
    private String lastName;

    public Employee(String fn, String ln)
    {
        firstName = fn;
        lastName = ln;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public String toString()
    {
        return getFirstName() + " " + getLastName();
    }

    public abstract int earning(); // metodo astratto
}