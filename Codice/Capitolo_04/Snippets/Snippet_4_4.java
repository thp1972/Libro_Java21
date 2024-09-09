package LibroJava.Capitolo4;

public class Snippet_4_4
{
    public static void main(String[] args)
    {
        int a;
        final int b = 100;

        a = 100; // OK - lvalue

        b = 1111; // error: cannot assign a value to final variable b

        245 = a; // error: unexpected type ... required: variable found: value

        a + b = 22; // error: unexpected type ... required: variable found: value
    }
}
