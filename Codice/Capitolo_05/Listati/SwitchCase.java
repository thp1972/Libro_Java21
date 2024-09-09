package LibroJava.Capitolo5;

public class SwitchCase
{
    public static void main(String[] args)
    {
        int number = 4;

        switch (number) // valuto number
        {
            case 1: // vale 1?
                System.out.println("number = 1");
                break;
            case 2: // vale 2?
                System.out.println("number = 2");
                break;
            case 3: // vale 3?
                System.out.println("number = 3");
                break;
            case 4: // vale 4?
                System.out.println("number = 4");
                break;
            default: // nessuna corrispondenza?
                System.out.println("number = [no matching]\n");
        }

        System.out.println("... prossima istruzione successiva allo switch ...");
    }
}
