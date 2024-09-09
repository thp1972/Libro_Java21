package LibroJava.Capitolo5;

public class GroupingOfCaseLabels
{
    public static void main(String[] args)
    {
        char letter = 'e';

        switch (letter)
        {
            // lettere a, b, c?
            case 'a':
            case 'b':
            case 'c':
                System.out.println("Tra le lettere a, b, c");
                break;
            // lettere d, e, f?
            case 'd':
            case 'e':
            case 'f':
                System.out.println("Tra le lettere d, e, f");
                break;
            // nessuna corrispondenza
            default:
                System.out.println("Nessuna corrispondenza di lettera");
        }
    }
}
