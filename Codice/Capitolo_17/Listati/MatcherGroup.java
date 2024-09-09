package LibroJava.Capitolo17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherGroup
{
    public static void main(String[] args)
    {
        String to_compare = "Pellegrino, Rino, Gennarino";
        String regex = "(?i)R(ino)";
        Matcher m = Pattern.compile(regex).matcher(to_compare);

        while (m.find()) // scorre tutte le occorrenze trovate 
        {
            System.out.println("CORRISPONDENZA TROVATA:");
            System.out.printf("Gruppo 0: %s alla posizione: %d%n", m.group(0),
                                                                   m.start(0));
            System.out.printf("Gruppo 1: %s alla posizione: %d%n", m.group(1),
                                                                   m.start(1));
            System.out.println("---------------------------------------------");
        }
    }
}
