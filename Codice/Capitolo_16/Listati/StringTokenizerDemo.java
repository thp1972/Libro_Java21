package LibroJava.Capitolo16;

import java.util.StringTokenizer;

public class StringTokenizerDemo
{
    public static void main(String[] args)
    {
        // token separati dai delimitatori di default 
        StringTokenizer st1 = new StringTokenizer("Sono una stringa");

        // token separati da delimitatori custom 
        StringTokenizer st2 = new StringTokenizer("Altro##che##stringa", "##");

        while (st1.hasMoreTokens()) // scorriamo i token 
        {
            String token = st1.nextToken();
            System.out.printf("%s ", token);
        }
        System.out.println();

        while (st2.hasMoreTokens())
        {
            String token = st2.nextToken();
            System.out.printf("%s ", token);
        }
        System.out.println();
    }
}
