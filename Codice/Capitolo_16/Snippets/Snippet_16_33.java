package LibroJava.Capitolo16;

public class Snippet_16_33
{
    public static void main(String[] args)
    {
        Object o = new java.util.Date();
        int i = 10;
        long l = 10l;
        float f = 10.4f;
        double d = 11.22;
        char c = 'X';
        boolean b = true;
        char a_c[] = { 'a', 'b', 'c', 'd', 'e' };

        String s_1 = String.valueOf(o); // la data odierna... Fri Apr 06 19:05:09 CET 2024 
        String s_2 = String.valueOf(i); // 10 
        String s_3 = String.valueOf(l); // 10 
        String s_4 = String.valueOf(f); // 10.4 
        String s_5 = String.valueOf(d); // 11.22 
        String s_6 = String.valueOf(c); // X 
        String s_7 = String.valueOf(b); // true 
        String s_8 = String.valueOf(a_c); // abcde 
        String s_9 = String.valueOf(a_c, 1, 3); // bcd
    }
}
