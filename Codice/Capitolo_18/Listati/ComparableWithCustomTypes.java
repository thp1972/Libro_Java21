package LibroJava.Capitolo18;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> // una classe che modella un impiegato 
{
    private Integer _id;
    private GregorianCalendar _hiring_date;

    public Employee(int id, GregorianCalendar hiring_date)
    {
        _id = id;
        _hiring_date = hiring_date;
    }

    public int getId() { return _id; }

    public GregorianCalendar getHiringDate() { return _hiring_date; }

    // se gli impiegati sono stati assunti nella stessa data allora considera anche l'id 
    public int compareTo(Employee o)
    {
        int res = _hiring_date.compareTo(o._hiring_date);
        if (res == 0)
            res = _id.compareTo(o._id);
        return res;
    }

    public String toString()
    {
        return _id + " assunto in data " + 
               _hiring_date.get(Calendar.DAY_OF_MONTH) + "/" +
               _hiring_date.get(Calendar.MONTH) + "/" +
               _hiring_date.get(Calendar.YEAR);
    }
}

public class ComparableWithCustomTypes
{
    public static void main(String[] args)
    {
        Set<Employee> employees = new TreeSet<>(); // TreeSet di impiegati 

        employees.add(new Employee(4200, new GregorianCalendar(2005, 10, 1)));
        employees.add(new Employee(1250, new GregorianCalendar(2005, 10, 1)));
        employees.add(new Employee(3058, new GregorianCalendar(2005, 10, 1)));
        employees.add(new Employee(100,  new GregorianCalendar(2008,  5, 1)));
        employees.add(new Employee(3058, new GregorianCalendar(2001, 11, 1)));
        
        System.out.println(employees); 
    }
}
