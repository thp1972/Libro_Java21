package LibroJava.Capitolo2;

public class TraditionalSwitch
{
    public static void main(String[] args)
    {
        int month = 1;
        int seasonCharsLength; // per un possibile utilizzo...

        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.printf("Siamo in inverno...%n");
                String seasonName = "inverno"; // lo scope è tutto il blocco switch
                seasonCharsLength = seasonName.length();
                break;
            case 3:
            case 4:
            case 5:
                System.out.printf("Siamo in primavera...%n");
                String seasonName_2 = "primavera"; // non possiamo riutilizzare 
                                                   // seasonName
                seasonCharsLength = seasonName_2.length();
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("Siamo in estate...%n");
                String seasonName_3 = "estate"; // non possiamo riutilizzare 
                                                // seasonName
                seasonCharsLength = seasonName_3.length();
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("Siamo in autunno...%n");
                String seasonName_4 = "autunno"; // non possiamo riutilizzare 
                                                 // seasonName
                seasonCharsLength = seasonName_4.length();
                break;
            default:
                throw new IllegalArgumentException(
                        month + " non è un mese valido per nessuna stagione!");
        }
    }
}
