package LibroJava.Capitolo7;

class Person
{
    private String first_name;
    private String last_name;
    private Time_Revision7 working_time; // oggetto di tipo Time_Revision7

    public Person(String first_name, String last_name, Time_Revision7 time)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        working_time = time;
    }

    public String toString()
    {
        return last_name + " " + first_name + " inizia il lavoro alle: "
               + working_time.getTime();
    }
}

