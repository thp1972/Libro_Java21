package LibroJava.Capitolo16;

public class Snippet_16_29
{
    public static void main(String[] args)
    {
        String x = "Giga";
        String y = "bit";
        String z = x.concat(y); // Gigabit 

        // possiamo notare come in Java è possibile concatenare delle stringhe utilizzando
        // l’operatore + che in questo contesto è detto "String Concatenation Operator"
        // in effetti il compilatore sostituirà l’espressione x + y con
        // un'espressione del tipo new StringBuilder().append(x).append(y).toString(),
        // con cui creerà un oggetto di tipo StringBuilder a cui aggiungerà il valore della stringa x
        // e della stringa y prima di riconvertirlo in un oggetto di tipo String
        String w = x + y; // Gigabit
    }
}
