package LibroJava.Capitolo8;

public class Snippet_8_22
{
    public static void main(String[] args)
    {
        Object o = "Pelle#grino";

        // I regola:
        // cs visibile nella condizione when e nella statement printf
        switch (o) // Attenzione trovato carattere #!
        {
            case String cs when cs.indexOf("#") != 0 -> 
            System.out.printf("Attenzione trovato carattere # in %s%n", cs);
            default -> { ; }
        }

        o = "stefano";
        // II regola:
        // s visibile in un blocco di codice ed i visibile nella statement throw
        switch (o) // stefano deve iniziare con una lettera maiuscola
        {
            case String s ->
            {
                if (Character.isLowerCase(s.charAt(0)))
                    System.out.printf("%s deve iniziare con una lettera maiu-scola%n", s);
                else System.out.printf("%s%n", s);
            }
            case Integer i ->
                    throw new IllegalStateException("Tipo non consentito " + i);
            default -> { ; }
        }

        // III regola:
        // nessun conflitto di nome di s tra le due etichette case
        switch (o) // stefano
        {
            case String s -> System.out.printf("%s%n", s);
            case Character s -> System.out.printf("%s%n", s);
            default -> { ; }
        }

        // IV regola:
        // la pattern variable s non è visibile nell'etichetta case Character c
        switch (o)
        {
            case String s -> System.out.printf("%s%n", s);

            // errore: Cannot resolve symbol 's'
            case Character c -> System.out.printf("%s%n", s);
            default -> { ; }
        }
    }
}
