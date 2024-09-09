package LibroJava.Capitolo2;

public class Snippet_2_33
{
    public static void main(String[] args)
    {
        // d non è un nome significativo: cosà conterrà?
        var d = getDataFromCalc();

        // calculated_data è un possibile nome significativo che rende subito evidente
        // al lettore del codice che il metodo ritornerà dei dati di tipo numerico
        // risultato di una qualche forma di calcolo...
        var calculated_data = getDataFromCalc();

        // il costruttore della classe StringBuilder ha un nome significativo e dunque
        // il lettore può comprendere agevolmente che string_builder conterrà un oggetto
        // di tipo StringBuilder
        // in questo caso è ridondante e pedante scrivere:
        // StringBuilder string_builder = new StringBuilder("Java 21");
        // ossia ripetere nella parte a sinistra (LHS, left hand size) dell'operatore = 
        // il nome del tipo che nella  parte a destra (RHS, right hand size) del 
        // predetto operatore è già presente
        var string_builder = new StringBuilder("Java 21");

        // in questo caso si potrebbe volere che:
        // byte_mask fosse di tipo byte
        // huge_buffer fosse di tipo long
        // ma con var il compilatore deduce che i letterali interi passati
        // come valori alle variabili siano di tipo int e dunque sia
        // byte_mask che huge_buffer saranno di tipo int  
        var byte_mask = 0x22; // ATTENZIONE - il tipo sarà int
        var huge_buffer = 10; // ATTENZIONE - il tipo sarà int

        // con gli altri letterali invece il valore dedotto sarà sempre del tipo corretto
        var exit = true; // OK - il tipo sarà boolean
        var letter = 'A'; // OK - il tipo sarà char
        var start_address = 0L; // OK - il tipo sarà long
        var name = "Pilgrim"; // OK - il tipo sarà String
        var pi = 3.14F; // OK - il tipo sarà float
        var laplace_lim = 0.6627434193; // OK - il tipo sarà double
    }

    public static int getDataFromCalc() { return 10000; }
}
