package LibroJava.Capitolo17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snippet_17_6
{
    public static void main(String[] args)
    {
        String str = "Il mio nome e' Pellegrino e non Rino";
        String regex = "(?i)rino";
        Matcher m = Pattern.compile(regex).matcher(str);
        boolean b = m.find(30); // true
    }
}
