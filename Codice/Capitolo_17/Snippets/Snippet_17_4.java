package LibroJava.Capitolo17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snippet_17_4
{
    public static void main(String[] args)
    {
        String str = "Il mio nome e' Pellegrino e non Rino";
        String regex = "(?i)rino"; // trova rino case-insensitive 
        Matcher m = Pattern.compile(regex).matcher(str);
        m.find();
        int s = m.start(); // 21
    }
}
