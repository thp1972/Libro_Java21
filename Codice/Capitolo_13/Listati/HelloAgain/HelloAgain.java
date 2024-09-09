package com.pellegrinoprincipe.helloagain;

import com.pellegrinoprincipe.greetings.Greetings;
import com.pellegrinoprincipe.persons.Persons;

public class HelloAgain
{
    public static void main(String[] args)
    {
        Greetings g = new Greetings();        
        
        // questo codice può accedere al tipo Persons perché il modulo
        // com.pellegrinoprincipe.greetings ha usato la direttiva 
        // requires transitive com.pellegrinoprincipe.persons;
        g.from(new Persons("Pellegrino", "Principe"), g.HELLO);
        System.out.println(g.getGreeting());
    }   
}
