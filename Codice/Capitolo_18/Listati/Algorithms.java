package LibroJava.Capitolo18;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Algorithms
{
    public static void main(String[] args)
    {
        String os[] =
        {
            "GNU/Linux", "Windows 7", "Solaris", "Amiga OS", "FreeBSD",
            "Mac OS X"
        };

        // Lista di sistemi operativi 
        LinkedList<String> al_operating_systems = new LinkedList<>(Arrays.asList(os));
        Collections.sort(al_operating_systems); // ordina la collezione 
        System.out.printf("Collezione ordinata: %s%n", al_operating_systems);

        // ricerca l'elemento Be OS 
        int ix = Collections.binarySearch(al_operating_systems, "Be OS", null);
        if (ix < 0)// se non è presente aggiungilo 
            al_operating_systems.add(-(ix + 1), "Be OS");
        System.out.printf("Collezione con elemento Be OS aggiunto: %s%n", al_operating_systems);

        // ruota gli elementi di 3 posizioni 
        Collections.rotate(al_operating_systems, 3);
        System.out.printf("Collezione con elementi ruotati: %s%n", al_operating_systems);

        System.out.printf("Elemento della collezione minore: [%s]%n",
                          Collections.min(al_operating_systems)); // elemento più piccolo

        System.out.printf("Elemento della collezione maggiore: [%s]%n",
                          Collections.max(al_operating_systems)); // elemento più grande
    }
}
