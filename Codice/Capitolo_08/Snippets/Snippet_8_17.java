package LibroJava.Capitolo8;

public class Snippet_8_17
{
    public static void main(String[] args)
    {
        Object o = null;

        // la valutazione di o sarà null
        // si troverà un'etichetta case null e sarà eseguito il codice lì contenuto
        // non verrà generata un'eccezione NullPointerException
        switch (o) // ATTENZIONE valore nullo!
        {
            case null -> System.out.printf("ATTENZIONE valore nullo!%n");
            case String s -> System.out.printf("String: %s%n", s);
            default -> System.out.printf("ATTENZIONE valore non contemplato%n");
        }

        o = 14;
        // la valutazione di o sarà il valore intero 14
        // NON si troverà un'etichetta case tipo Integer i
        // NON verrà generata un'eccezione NullPointerException
        // si troverà un'etichetta default e sarà eseguito il codice lì contenuto
        // è comunque possibile dichiarare un'etichetta case null con anche quella default
        // ATTENZIONE: non è possibile dichiarare un'etichetta  case null, default ed anche
        // un'etichetta default
        // è possibile però dichiararli separatamente ovvero come
        // case null -> ... e poi default -> ...
        switch (o) // valore NON nullo
        {
            case String s -> System.out.printf("String: %s%n", s);

            // questo costrutto consente di gestire contemporaneamente
            // casi di null con un caso di default
            case null, default -> System.out.printf("ATTENZIONE valore nullo oppure non contemplato%n");
        }

        o = null;
        // la valutazione di o sarà null
        // NON si troverà un'etichetta case null
        // verrà generata un'eccezione NullPointerException
        // è come se il compilatore avesse messo in automatico un'istruzione come la seguente:
        // case null -> throw new NullPointerException();
        switch (o) // ATTENZIONE valore nullo!
        {
            case String s -> System.out.printf("String: %s%n", s);
            default -> System.out.printf("ATTENZIONE valore non contemplato%n");
        }
    }
}
