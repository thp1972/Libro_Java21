package LibroJava.Capitolo17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snippet_17_7
{
    public static void main(String[] args)
    {
        String str = "Java è eccellente!";
        String str_2 = "È eccellente Java";
        String regex = "Java";
        Matcher m = Pattern.compile(regex).matcher(str);
        boolean b = m.lookingAt(); // true 
        m.reset(str_2);
        b = m.lookingAt(); // false
    }
}
