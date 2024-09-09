package LibroJava.Capitolo4;

class A { } // una classe...

public class Snippet_4_21
{
    public static void main(String[] args)
    {
        int a = 120, b = 111, c = 111, d = 112;
        boolean e = a < b != c > d; // false

        // dichiarazione di 4 tipi riferimento
        A obj_1 = new A(); // un oggetto di tipo A
        A obj_2 = new A(); // un oggetto di tipo A
        A obj_3 = obj_2;   // un oggetto di tipo A
        A obj_4 = null;    // un oggetto di tipo A

        boolean cmp_1 = obj_1 != obj_2; // true
        boolean cmp_2 = obj_2 != obj_3; // false
        boolean cmp_3 = obj_4 != null;  // false
    }
}
