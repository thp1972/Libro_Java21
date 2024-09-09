package LibroJava.Capitolo2;

public class ImprovedSwitch
{
    public static void main(String[] args)
    {
        int month = 1;
        int seasonCharsLength; // per un possibile utilizzo...

        seasonCharsLength = switch (month)
        {
            case 12, 1, 2 ->
            { // block of statements, il valore è ritornato mediante yield
                System.out.printf("Siamo in inverno...%n");
                String seasonName = "inverno"; // lo scope è il corrente blocco switch
                yield seasonName.length();
            }
            case 3, 4, 5 ->
            {
                System.out.printf("Siamo in primavera...%n");
                String seasonName = "primavera"; // lo scope è il corrente blocco switch
                                                 // riutilizziamo seasonName
                yield seasonName.length();
            }
            case 6, 7, 8 ->
            {
                System.out.printf("Siamo in estate...%n");
                String seasonName = "estate"; // lo scope è il corrente blocco switch
                                              // riutilizziamo seasonName
                yield seasonName.length();
            }
            case 9, 10, 11 ->
            {
                System.out.printf("Siamo in autunno...%n");
                String seasonName = "autunno"; // lo scope è il corrente blocco switch
                                               // riutilizziamo seasonName
                yield seasonName.length();
            }
            default ->
                // nessun valore è ritornato ma viene generata un'eccezione; usiamo throw
                throw new IllegalArgumentException(
                        month + " non è un mese valido per nessuna stagione!");
        }; // una switch expression, in questo contesto di assegnamento,
           // è un expression statement e necessita quindi del ; di terminazione
    }
}
