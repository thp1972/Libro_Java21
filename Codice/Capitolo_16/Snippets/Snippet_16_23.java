package LibroJava.Capitolo16;

public class Snippet_16_23
{
    public static void main(String[] args)
    {
        String s1 = "Pallone";
        String s2 = "Pollore";
        boolean b = s1.regionMatches(true, 2, s2, 2, 3); // true perché llo uguali
    }
}
