package LibroJava.Capitolo5;

public class Snippet_5_7
{
    public static void main(String[] args)
    {
        // ATTENZIONE - quest'istruzione etichettata non contiene un eventuale
        // break; la sua esecuzione avverrà comunque normalmente...
        label_a:
        {
            System.out.println("Sono nella label_a"); // Sono nella label_a
        }

        // ERRORE - quest'istruzione etichettata contiene un'istruzione break che
        // però riferisce un'etichetta in un blocco che non contiene il break stesso
        label_b:
        {
            System.out.println("Sono nella label_b ");
            break label_a; // error: undefined label: label_a
        }
    }
}
