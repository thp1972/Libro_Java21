package LibroJava.Capitolo2;

public class Snippet_5_2
{
    public static void main(String[] args)
    {
        char letter = 'e';

        switch (letter)
        {
            // lettere a, b, c?
            case 'a', 'b', 'c': // lista di costanti per l'etichetta case
                System.out.println("Tra le lettere a, b, c");
                break;
            // lettere d, e, f?
            case 'd', 'e', 'f':
                System.out.println("Tra le lettere d, e, f");
                break;
            // nessuna corrispondenza
            default:
                System.out.println("Nessuna corrispondenza di lettera");
        }
    }    
}
