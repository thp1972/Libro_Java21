package LibroJava.Capitolo16;

public class Snippet_16_3
{
    public static void main(String[] args)
    {
        Character c = 'A';
        Character d = '4';
        int n1 = Character.digit(c, 16); // 10, A convertibile perché in esadecimale 
                                         // equivale a 10 
        int n2 = Character.digit(c, 10); // –1, A non è convertibile
                                         // valori permessi da 0 a 9 (base 10) 
        int n3 = Character.digit(d, 2); // –1, 4 non è convertibile
                                        // valori permessi 0 e 1 (base 2)
    }
}
