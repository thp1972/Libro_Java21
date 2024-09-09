package LibroJava.Capitolo6;

public class Snippet_6_6
{
    public static int sum(int x, int y) { return x + y; }

    public static void main(String[] args)
    {
        // ERRORE - meno argomenti di quelli attesi
        // error: method sum in class Snippet_6_6 cannot be applied to given types;
        // int res_1 = sum(6);
        // required: int,int
        // found: int
        // reason: actual and formal argument lists differ in length
        int res_1 = sum(6);
        System.out.printf("Somma tra 6 e ? = %d%n", res_1);

        // ERRORE - conversione implicita non attuabile
        // error: method sum in class Snippet_6_6 cannot be applied to given types;
        // int res_2 = sum(6.7f, 7.8f);
        // required: int,int
        // found: float,float
        // reason: argument mismatch; possible lossy conversion from float to int
        int res_2 = sum(6.7f, 7.8f);
        System.out.printf("Somma tra 6.7 e 7.8 = %d%n", res_2);

        byte a = 1, b = 2;
        // OK - conversione implicita attuabile
        int res_3 = sum(a, b);
        System.out.printf("Somma tra %d e %d = %d%n", a, b, res_3);
    }
}
