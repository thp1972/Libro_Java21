package LibroJava.Capitolo16;

public class TraditionalEscapeSequences
{
    public static void main(String[] args)
    {
        // questo blocco di testo formatta ed indenta uno snippet SQL
        // non usiamo \n come terminatore di riga: non è necessario!
        String sql = """
                     SELECT *
                     FROM Employee
                     WHERE age > 36;
                     """; // il delimitatore di chiusura è sulla propria linea
                          // questo implica che l'ultima sequenza di caratteri scritta
                          // contiene anche un terminatore di riga che è infatti
                          // elaborato nell'output della console

        System.out.printf("%s%n", sql);

        // questo blocco di testo formatta ed indenta uno snippet JSON
        // usiamo esplicitamente \n solo per dimostrare che, anche se non
        // necessario, un blocco di testo può comunque contenere le comuni
        // sequence di escape
        // chiaramente \n produrrà ulteriori new line oltre quelli
        // letteralmente già indicati
        String json = """
                      {\n
                          "player": "Pellegrino Principe",
                          "game": "Super Mario",
                          "producer": Nintendo\n
                      }"""; // il delimitatore di chiusura non è sulla propria linea
                            // nessun carattere di new line è quindi inserito

        System.out.printf("%s%n%n", json);

        // questo blocco di testo formatta ed indenta una frase qualsiasi...
        // usiamo la sequenza di escape \""" per far visualizzare letteralmente
        // i caratteri """ e non farli processare come il delimitatore di chiusura
        // del blocco di testo
        String sentence = """
                          Nel mezzo del cammin di nostra vita
                          mi ritrovai per una \"""selva oscura\"""
                          ché la diritta via era smarrita.
                          """;

        System.out.printf("%s", sentence);
    }
}
