package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.List;

public class Snippet_9_14
{
    public static void listProcessor(Object list)
    {
        // cast attuabile ma attenzione:
        // il cast è in realtà tra Object verso List e non verso List<String>
        // questo è pericoloso perché il cast è attuabile sempre anche se, come nel nostro caso,
        // list riferisce una List<Integer>
        // warning: [unchecked] unchecked cast
        // required: List<String> found: Object
        List<String> the_list = (List<String>)list;
        
        // qua, infatti, sarà generata un'eccezione di ClassCastException 
        // java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
        String data = the_list.get(0);        
    }
    
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        
        // non è possibile usare instanceof con un tipo parametrizzato
        // error: illegal generic type for instanceof
        if(numbers instanceof List<String>)
            System.out.println("ERRORE: numbers deve essere List<Integer>");
       
        // passiamo numbers che a runtime sarà il tipo raw List
        listProcessor(numbers);        
    }
}
