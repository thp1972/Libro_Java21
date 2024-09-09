package LibroJava.Capitolo18;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapImplementations
{
    private enum ProgrammingLanguages { JAVA, CPP, JAVASCRIPT, CSHARP }

    public static void main(String[] args)
    {
        Map<String, String> m_city_regions = new HashMap<>(); // HashMap 

        // aggiungo le città 
        m_city_regions.put(new String("Napoli"), "Campania");
        m_city_regions.put(new String("Salerno"), "Campania");
        m_city_regions.put(new String("Caserta"), "Campania");
        m_city_regions.put(new String("Avellino"), "Campania");
        m_city_regions.put(new String("Benevento"), "Lombardia"); // ATTENZIONE - errore 
                                                                  // regione... 
        m_city_regions.put(new String("Benevento"), "Campania"); // ... la sostituisco 
                                                                 // con questa... 
                           
        System.out.printf("Città della Campania contenute in un HashMap:%n%s%n",
                          m_city_regions);                               

        Map<String, String> im_city_regions = new IdentityHashMap<>(); // IdentityHashMap 

        // aggiungo le città 
        im_city_regions.put(new String("Napoli"), "Campania");
        im_city_regions.put(new String("Salerno"), "Campania");
        im_city_regions.put(new String("Caserta"), "Campania");
        im_city_regions.put(new String("Avellino"), "Campania");
        im_city_regions.put(new String("Benevento"), "Lombardia"); // ATTENZIONE - errore 
                                                                   // regione... 
                                                                   
        // ... la sostituisco con questa... ma non funziona e l'entry è duplicata!!! 
        im_city_regions.put(new String("Benevento"), "Campania");
 
        System.out.printf("Città della Campania contenute in un IdentityHashMap:%n%s%n", 
                          im_city_regions);
        
        // creo un tipo EnumMap con le key corrispondenti alle costanti di enumerazione 
        // dell'enumerazione ProgrammingLanguages 
        Map<ProgrammingLanguages, String> emap = new EnumMap<>(ProgrammingLanguages.class);
        emap.put(ProgrammingLanguages.JAVASCRIPT, "Brendan Eich");
        emap.put(ProgrammingLanguages.JAVA, "James Gosling");
        emap.put(ProgrammingLanguages.CSHARP, "Anders Hejlsberg");
        emap.put(ProgrammingLanguages.CPP, "Bjarne Stroustrup");

        // mostro tutte le entry 
        System.out.printf("Entry di emap:%n%s%n", emap);        
    }
}
