package com.pellegrinoprincipe.persons;

public class Persons
{
    private String first_name;
    private String last_name;

    public Persons(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getFirstName() { return first_name; }
    public String getLastName() { return last_name;  }

    public String toString()
    {
        return String.format("%s %s", first_name, last_name);
    }       
}
