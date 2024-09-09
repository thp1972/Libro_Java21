package LibroJava.Capitolo17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo
{
    // validiamo la stringa con la regex 
    public static String[] validate(String to_compare[], String regex)
    {
        String found[] = new String[to_compare.length]; // array di stringhe convalidate 
        Pattern regex_pattern = Pattern.compile(regex); // creo un oggetto Pattern 
        for (int i = 0; i < to_compare.length; i++)
        {
            String comp = to_compare[i];
            Matcher matcher = regex_pattern.matcher(comp); // creo un oggetto Matcher 

            if (matcher.find()) // trova la successiva occorrenza 
                found[i] = matcher.group(); // ritorna la sequenza trovata 
            else
                found[i] = null;
        }
        return found;
    }

    public static void main(String[] args)
    {
        String tel_number[] = { "06/442255", "fdr3344\n", "081-556677", "085/6677889900" };
        String names[] = { "maurizio", "Pellegrino", "Paolo Pietro", "Mass6imo" };

        // espressioni regolari 
        String regex_for_tel = "0\\d/\\d{6}";
        String regex_for_names = "[A-Z][a-z]+(\\s[A-Z][a-z]+)?";

        String tel_val[] = validate(tel_number, regex_for_tel); // valida i telefoni 
        System.out.print("TELEFONI VALIDI:[ ");
        for (String tel : tel_val)
        {
            System.out.printf("%s ", tel);
        }

        System.out.print("]\nNOMI VALIDI:[ ");
        for (int i = 0; i < names.length; i++)
        {
            String name = names[i];

            boolean succ = Pattern.matches(regex_for_names, name); // corrisponde? 
            if (succ)
                System.out.print(name);
            else
                System.out.print("null");

            System.out.print(" ");
        }
        System.out.println("]");
    }
}
