package LibroJava.Capitolo8;

public class Snippet_8_20
{
    public static void main(String[] args)
    {
        String name = "Pellegrino";
        Object o = name;

        // un'etichetta case senza espressioni condizionali (unguarded pattern)
        // domina sempre un'altra etichetta case con delle espressioni condi-zionali
        // (guarded pattern)
        // viene generato un errore di compilazione perché la seconda etichetta
        // case non potrà mai essere raggiunta
        switch (o)
        {
            // unguarded pattern case label
            case String s -> System.out.printf("Stringa: %s%n ",s);

            // guarded pattern case label
            // error: this case label is dominated by a preceding case label
            case String s when s.length() > 0 -> System.out.printf("Stringa: %s%n ",s);
            default -> {;}
        }

        // un'etichetta case con un pattern domina sempre un'etichetta case
        // con un valore costante
        // viene generato un errore di compilazione perché la seconda etichetta
        // case non potrà mai essere raggiunta
        Integer a_number = 100;
        switch (a_number)
        {
            case Integer n -> System.out.printf("Valore numerico: %d%n ", n);
            
            // error: this case label is dominated by a preceding case label
            case 100 -> System.out.printf("Valore numerico: 100%n");
        }
        
        // ATTENZIONE: non è consentito scrivere nello stesso blocco
        // switch un'etichetta case senza un'espressione condizionale  
        // e una label default
        // entrambe, così come sono scritte, rappresentano le così dette
        // match-all switch label, ossia etichette in grado di "intercettare"
        // tutti i valori possibili e incondizionatamente
        // quale etichetta deve scegliere il compilatore? si può risolvere tale ambiguità?
        // non essendoci una risposta certa ecco che viene generato un apposito errore
        Integer another_number = 300;
        switch (another_number)
        {
            case Integer n -> System.out.printf("Valore numerico: %d%n ", n);
            
            // switch has both an unconditional pattern and a default label
            default -> {;}
        }
    }
}
