package LibroJava.Capitolo7;

public class ObjectComposition
{
    public static void main(String[] args)
    {
        Time_Revision7 time = new Time_Revision7(8, 0, 0);
        Person a_person = new Person("Principe", "Pellegrino", time);
        
        System.out.println(a_person);
    }
}
