package LibroJava.Capitolo16;

public class TextBlocksForSnippets
{
    public static void main(String[] args)
    {
        // LETTERALE STRINGA di tipo "tradizionale"
        // abbiamo usato esplicitamente le sequenze di escape \n e \t
        // per far sì che l'output sia effettuato con una determinata indentazione
        // abbiamo inoltre anche impiegato l’operatore + di concatenazione
        // di stringhe per formattare il codice su più righe
        // appare quindi evidente come il codice risulta poco leggibile
        String html = "<html>\n"
                      + "\t<body>\n"
                      + "\t\t<p>Hello, world</p>\n"
                      + "\t</body>\n"
                      + "</html>\n";

        // LETTERALE STRINGA di tipo "text block"
        // abbiamo formattato ed indentato lo snippet di codice HTML 
        // in modo "naturale" e senza l'ausilio di sequenze di escape o altro
        // il delimitatore di apertura """ può contenere, dopo di esso,
        // spazi, tabulazioni, ecc. ma non altri caratteri
        // il contenuto del blocco di testo ovvero la relativa sequenza
        // di caratteri può essere scritta solo dopo il terminatore di riga
        // posto dopo i caratteri """
        // in caso contrario, sarà generato il seguente errore:
        // error: illegal text block open delimiter sequence, missing line terminator
        String html_TB = """
                         <html>
                             <body>
                                 <p>Hello, world</p>
                             </body>
                         </html>
                         """;

        System.out.printf("%s%n%s", html, html_TB);
    }
}
