package LibroJava.Capitolo16;

public class Snippet_16_12
{
    public static void main(String[] args)
    {
        // quest'istruzione è come se fosse equivalente alla seguente:
        // char data[] = {'R', 'O', 'S', 'S,', 'O'};
        // String s1 = new String(data);
        String s1 = "ROSSO";

        // questa stringa contiene dei singoli caratteri e alcune sequenze di
        // escape; per queste ultime l'uso è uguale a quello visto per i
        // letterali carattere
        String s2 = "Pa\tppa\u0067on\u0065";
        System.out.println(s2); // Pa	ppagone
		
        // un blocco di testo è un letterale ovvero un'espressione costante che a
        // runtime è valutata come istanza di tipo String
        // dunque legittimamente assegnabile alla variabile s3 di tipo String
        String s3 = """
					SELECT ID, FULL_NAME, CITY
					FROM
					EMPLOYEE
					""";

        // è creata una sola istanza di tipo String che conterrà
        // i caratteri "Ciao"
        // "string interning"
        String text_1 = "Ciao";
        String text_2 = "Ciao";
    }
}
