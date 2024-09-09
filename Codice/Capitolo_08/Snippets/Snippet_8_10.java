package LibroJava.Capitolo8;

public class Snippet_8_10
{
    public static void main(String[] args)
    {
        int num1 = 100;
        float num2 = 111.22f;
        double num3 = 23.333;

        // a runtime a_number è di tipo Integer
        Number a_number = num1;

        // codice inutile e ridondante
        // abbiamo dovuto scrivere per ben 3 volte Integer
        // soprattutto nel blocco dell'if il compilatore già sapeva che la
        // conversione non avrebbe generato alcun errore ma nonostante questo
        // abbiamo comunque dovuto fare un cast esplicito
        if (a_number instanceof Integer) // type comparison operator
        {
            Integer i_number = (Integer) a_number;
            System.out.println(i_number.intValue()); // 100
        }

        // ora il codice è più leggibile e non ha più alcuna ridondanza
        // il pattern espresso è composto da:
        // un match predicate, a_number è un'istanza di tipo Integer?
        // una dichiarazione di una variabile di tipo Integer i_number
        // se il predicato è true allora i_number conterrà lo stesso riferimento
        // di tipo Integer di a_number
        if (a_number instanceof Integer i_number) // pattern match operator
        {
            // utilizziamo senza problemi i_number: nessun cast esplicito necessario
            // i_number è in scope all'interno del blocco if
            System.out.println(i_number.intValue()); // 100
        }
    }
}
