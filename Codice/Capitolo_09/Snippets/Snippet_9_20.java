package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.List;

public class Snippet_9_20
{
    public static void main(String[] args)
    {
        // ----------------------------------------------------------------------------------------------
        // I CASO - var sostituito da un upper bound
        List<String> list_of_string = new ArrayList<>();
        list_of_string.add("Java 11");

        // il wildcard ? è catturato e sostituito con una fresh type variable, per esempio CAP#1
        // ricordiamo che <?> è uno shortcut di <? extends Object> laddove Object ne è l'upper bound
        List<?> list_of_unknown_type = list_of_string;

        // il var di data non viene sostituito da, per esempio CAP#1, ma dal supertipo Object
        // che è l'upper bound proprio di <?> come meglio evidenziato da <? extends Object>
        var data = list_of_unknown_type.get(0);

        // ERRORE - non è possibile aggiungere un elemento di tipo Object, come è data,
        // nella lista list_of_unknown_type che accetta oggetti di tipo CAP#1
        list_of_unknown_type.add(data); // error: no suitable method found for add(Object)
                                        // method List.add(CAP#1) is not applicable
                                        // (argument mismatch; Object cannot be converted to CAP#1)
                                        // where CAP#1 is a fresh type-variable:
                                        // CAP#1 extends Object from capture of ?

        // ----------------------------------------------------------------------------------------------
        // II CASO - var sostituito da un altro bounded wildcard
        List<Integer> list_of_integer = new ArrayList<>();
        list_of_integer.add(1000);

        // il wildcard ? è catturato e sostituito con una fresh type variable, per esempio CAP#1
        // ricordiamo che <?> è uno shortcut di <? extends Object> laddove Object ne è l'upper bound
        List<?> other_list_of_unknown_type = list_of_integer;

        // il var di other_data non viene sostituito da, per esempio CAP#1, ma da List<?> 
        // ossia da un tipo con lo stesso wildcard e lo stesso limite (bounded wildcard) 
        // del tipo wildcard posto nell'espressione
        // successivamente però, dato che List<?> contiene ancora un wildcard, ? è catturato e
        // sostituito con un'altra fresh type variable, per esempio CAP#2
        var other_data = other_list_of_unknown_type;

        // ERRORE - non è possibile aggiungere un elemento di tipo CAP#1, come è quello ritornato
        // dalla valutazione di other_list_of_unknown_type.get(0), nella lista other_data che accetta
        // elementi di tipo CAP#2
        other_data.add(other_list_of_unknown_type.get(0)); // error: no suitable method found for add(CAP#1)
                                                           // method List.add(CAP#2) is not applicable
                                                           // (argument mismatch; Object cannot be converted to CAP#2)
                                                           // where CAP#1,CAP#2 are fresh type-variables:
                                                           // CAP#1 extends Object from capture of ?
                                                           // CAP#2 extends Object from capture of ?
    }
}
