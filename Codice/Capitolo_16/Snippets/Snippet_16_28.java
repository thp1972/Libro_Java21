package LibroJava.Capitolo16;

public class Snippet_16_28
{
    public static void main(String[] args)
    {
        String s1 = "sono una stringa!";
        String sub = s1.substring(s1.indexOf("stringa"), s1.lastIndexOf("!") + 1); // stringa!
    }
}
