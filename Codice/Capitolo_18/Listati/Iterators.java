package LibroJava.Capitolo18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterators
{
    public static void main(String[] args)
    {
        String os[] =
        {
            "GNU/Linux", "Windows 7", "Solaris", "Amiga OS", "FreeBSD", "Mac OS X"
        };

        // Lista di sistemi operativi 
        LinkedList<String> al_operating_systems = new LinkedList<>(Arrays.asList(os));

        // oggetto ListIterator 
        ListIterator<String> it_os = al_operating_systems.listIterator();

        System.out.println("Sistemi operativi partendo dall'inizio della lista...");
        // parte dall'inizio 
        while (it_os.hasNext())
            System.out.printf("%s ", it_os.next());
        
        System.out.println("\nSistemi operativi partendo dalla fine della lista...");
        // parte dalla fine 
        while (it_os.hasPrevious())
            System.out.printf("%s ", it_os.previous());
   
        // modifica e aggiunta di elementi 
        System.out.println("\nSistemi operativi partendo dall'inizio della lista "+ 
                           "con modifiche...");
        
        while (it_os.hasNext())
        {
            String n_e = it_os.next();
            if (n_e.contains("Solaris"))
            {
                it_os.set(n_e + " OS 10");

                n_e = it_os.previous(); // ritorniamo indietro e poi avanti 
                                        // per far vedere la modifica! 
                n_e = it_os.next();
            }

            if (n_e.contains("FreeBSD"))
            {
                System.out.print(n_e + " "); // stampa FreeBSD 
                it_os.add("OpenBSD"); // aggiungo un elemento nuovo 

                n_e = it_os.previous(); // ritorniamo indietro e poi avanti 
                                        // per far vedere l'aggiunta! 
                n_e = it_os.next();
            }

            System.out.printf("%s ", n_e);
        }
        System.out.println();
    }
}
