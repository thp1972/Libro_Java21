package LibroJava.Capitolo5;

public class Snippet_5_6
{
    public static void main(String[] args)
    {
        int n = 50;
        test: // label
        {  // labeled statement
            int test = 10; // nessun conflitto con la label test
            if (test == 10)
            {
                System.out.println("10"); // 10
                break test; // salta verso test
            }
            // quest'istruzione non sarà mai eseguita
            for (n = test; n >= 0; n--)
                System.out.println(n);
        }
        // il break test farà poi eseguire quest'istruzione
        System.out.printf("n = %d%n", n); // n = 50

        test: // OK - nessun conflitto di nome con la precedente label test
        {
            int test = 11;
            if (test == 11)
                System.out.println("11"); // 11
        }

        test:
        {
            int test = 12;
            if (test == 12)
            {
                // ERRORE - la label test è già definita
                test: // error: label test already in use
                {
                    test++;
                    System.out.println("13"); // 13
                    break test;
                }
            }
        }
    }
}
