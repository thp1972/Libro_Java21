package LibroJava.Capitolo2;

public class GroupingOfCaseLabelsWithArrowNotation
{    
    public static void main(String[] args)
    {
        char letter = 'e';

        switch (letter)
        {
            // lettere a, b, c?
            // non è più necessario usare break: il fall through labels 
            // non è più un comportamento di default
            // usiamo una expression statement
            case 'a', 'b', 'c' -> System.out.println("Tra le lettere a, b, c");

            // lettere d, e, f?
            case 'd', 'e', 'f' -> System.out.println("Tra le lettere d, e, f");

            // nessuna corrispondenza
            // in questo caso default poteva essere omesso perché l'esaustività 
            // non è un requisito obbligatorio in caso di utilizzo dello switch 
            // come statement
            // in ogni caso è sempre consigliabile utilizzarlo in modo che lo 
            // switch elabori anche i casi non previsti
            // il codice sarà più robusto e meno soggetto a eventuali bug semantici
            default -> System.out.println("Nessuna corrispondenza di lettera");
        }
    }
}
