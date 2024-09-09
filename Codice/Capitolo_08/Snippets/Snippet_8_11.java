package LibroJava.Capitolo8;

class AClass { }

public class Snippet_8_11
{
    public static void main(String[] args)
    {
        // static scope per object
        // visibile fino alla chiusura del metodo main
        Object object = new AClass();

        // la pattern variable anInstance è soggetta ad un flow scoping ovvero
        // sarà visibile solo se il predicato object instanceof AClass sarà true
        // questo garantisce che anInstance è accessibile solo all'interno del
        // relativo blocco if ed ha anche un valore certo e significativo
        // in pratica una pattern variable è in scope solo se "definitely matched"
        // se invece anInstance fosse stata soggetta allo static scoping, proprio
        // delle altre tipologie di variabili locali, allora, per esempio,
        // sarebbe stata comunque utilizzabile nel relativo blocco if anche senza
        // un valido valore soprattutto se object instanceof AClass fosse stato false
        // questo utilizzo però avrebbe potuto generare dei gravi errori nel codice
        if (object instanceof AClass anInstance)
        {
            System.out.printf("Visibile: %s%n", anInstance);
            // Visibile: LibroJava.Capitolo8.AClass@1d81eb93
        }
        else // qua anInstance non è visibile
        {
            // errore di compilazione: Cannot resolve symbol 'anInstance'
            System.out.printf("NON visibile: %s%n", anInstance);
        }
    }
}
