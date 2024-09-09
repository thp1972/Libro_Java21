package LibroJava.Capitolo14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnSafeVarargs
{
    // in questo metodo non c'è alcun problema di utilizzo improprio di T... array 
    // possiamo marcare il metodo come "sicuro" e non far generare warning 
    @SafeVarargs
    public static <T> void showParamInfo(T... array)
    {
        for (T element : array)
        {
            System.out.printf("%s: %s%n", element.getClass().getName(), element);
        }
    }

    // in questo metodo si compiono operazioni con List<String>... lists improprie 
    // e quindi non bisogna marcarlo come "sicuro" 
    public static void listManipulation(List<String>... lists)
    {
        // assegnamento perfettamente lecito, ma attenzione: questa istruzione 
        // può ingenerare poi uno heap pollution! 
        Object[] an_array = lists;

        // creiamo due liste, una per contenere Double e l'altra per contenere Long 
        List<Double> l_D = Arrays.asList(12.33, 44.66, 55.66);
        List<Long> l_L = Arrays.asList(100L, 1000L, 10000L);

        an_array[0] = l_D;
        an_array[1] = l_L;

        // facciamo delle manipolazioni con lists... ma otteniamo, invece, 
        // una ClassCastException! 
        String f_0_element = lists[0].get(0);
        String f_1_element = lists[0].get(1);

        String s_0_element = lists[1].get(0);
        String s_1_element = lists[1].get(1);

        // esegue qualche operazione...
    }

    public static void main(String[] args)
    {
        // per il metodo showParamInfo 
        ArrayList<Integer> l_I = new ArrayList<>();
        l_I.add(10);
        l_I.add(20);
        ArrayList<Double> l_D = new ArrayList<>();
        l_D.add(55.77);
        l_D.add(22.19);
        showParamInfo(l_I, l_D, "XYZ", 500);

        // per il metodo listManipulation 
        listManipulation(Arrays.asList("One, Two"), Arrays.asList("Red, Blue"));
    }
}
