package LibroJava.Capitolo8;

public class Snippet_8_19
{
    public static void main(String[] args)
    {
        String name = "Pellegrino";
        Object o = name;

        // o è di tipo String che però è anche di tipo CharSequence
        // dunque entrambe le etichette case possono soddisfare il pattern matching
        // ma la prima è sempre quella scelta per il matching
        // ok nessun errore: la prima etichetta case ha un tipo String
        switch (o) // Stringa: Pellegrino
        {
            case String s -> System.out.printf("Stringa: %s%n ",s);
            case CharSequence cs -> System.out.printf("Sequenza di caratteri: %s%n ", cs);
            default -> {;}
        }

        // o è di tipo String che però è anche di tipo CharSequence
        // entrambe le etichette case possono soddisfare il pattern matching
        // ma la prima è sempre quella scelta per il matching
        // errore: la prima etichetta ha un tipo CharSequence che "domina" la successiva
        // etichetta case che è di tipo String e che non potrà mai essere raggiunta
        // per una sua corretta valutazione
        switch (o)
        {
            case CharSequence cs -> System.out.printf("Sequenza di caratteri: %s%n ", cs);
            
            // error: this case label is dominated by a preceding case label
            case String s -> System.out.printf("Stringa: %s%n ",s);
            default -> {;}
        }
    }
}