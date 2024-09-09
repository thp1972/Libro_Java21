package LibroJava.Capitolo9;

public class CalculateMaxGenericClient
{
    public static void main(String[] args)
    {
        CalculateMaxGeneric cmg = new CalculateMaxGeneric();

        Double d[] =    { 11.1, 11.2, 9.6 };
        Integer i[] =   { 12, 13, 3};
        Character c[] = { 'n', 'b', 'z' };
        String s[] =    { "sono", "una", "stringa" };

        double d_max = cmg.maximum(d[0], d[1], d[2]);
        int i_max = cmg.maximum(i[0], i[1], i[2]);
        char c_max = cmg.maximum(c[0], c[1], c[2]);
        String s_max = cmg.maximum(s[0], s[1], s[2]);

        // stampa del valore massimo trovato 
        System.out.printf("Max (double): %.1f", d_max);
        System.out.printf(" | Max (int): %d", i_max);
        System.out.printf(" | Max (char): %c", c_max);
        System.out.printf(" | Max (String): %s%n", s_max);
    }
}
