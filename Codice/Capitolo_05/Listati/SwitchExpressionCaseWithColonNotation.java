package LibroJava.Capitolo2;

public class SwitchExpressionCaseWithColonNotation
{
    public static void main(String[] args)
    {
        char letter = 'e';
        String message = "";

        // in questo caso anche se lo switch è di tipo expression la colon 
        // notation "riattiva" il fall through labels: lo yield è necessario 
        // oltre che per elaborare il valore dell'espressione switch anche 
        // per terminarla
        // nessun break o return sono consentiti come terminatori dei casi
        message = switch (letter)
        {
            // lettere a, b, c?
            case 'a', 'b', 'c':
                // notiamo come lo yield non necessita di essere incluso in un 
                // blocco switch
                // questo grazie alla colon notation che consente di
                // scrivere gruppi di statement
                yield "Tra le lettere a, b, c";
            // lettere d, e, f?
            case 'd', 'e', 'f':
                yield "Tra le lettere d, e, f";
            // nessuna corrispondenza
            default: // necessario perché è comunque una switch expression e
                     // deve essere sempre esaustiva
                yield "Nessuna corrispondenza di lettera";
        };
        System.out.println(message);
    }
}
