package LibroJava.Capitolo16;

public class Snippet_16_36
{
    public static void main(String[] args)
    {
        // questo letterale stringa contiene delle sequenze di escape che sono scritte
        // in modo da mostrarle in output "letteralmente"
        String someText = "<HTML>\\n\\t<BODY>\\n\\t</BODY>\\n</HTML>";

        System.out.println(someText); // <HTML>\n\t<BODY>\n\t</BODY>\n</HTML>

        // usiamo quindi il metodo translateEscapes che le traduce negli equivalenti
        // Unicode escape: avremo che \n sarà trasformata in una new line e \t sarà
        // trasformata in un horizontal tab
        System.out.println(someText.translateEscapes());// <HTML>
                                                        //     <BODY>
                                                        //     </BODY>
                                                        // </HTML>
    }
}
