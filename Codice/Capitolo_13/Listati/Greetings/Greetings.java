package com.pellegrinoprincipe.greetings;

import com.pellegrinoprincipe.persons.Persons;

public class Greetings
{
    private Persons person;
    private String greeting;
    
    public final String HI = "Hi";
    public final String HELLO = "Hello";
    public final String HOWSIT_GOING = "How's it going?";
    public final String GOOD_MORNING = "Good morning";
    public final String GOOD_AFTERNOON = "Good afternoon";
    public final String GOOD_EVENING = "Good evening";
    
    public void from(Persons person, String greeting)
    {
        this.person = person;
        this.greeting =  greeting;
    }

    public String getGreeting()
    {
        return String.format("%s da %s", greeting, person);
    }
}
