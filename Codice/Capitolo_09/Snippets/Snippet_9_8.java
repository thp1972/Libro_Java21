package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snippet_9_8
{
    public static void main(String[] args)
    {
        // dichiarazione COVARIANTE
        // ? potrà essere di un tipo derivato da Number oppure Number stesso        
        // l'unica operazione type safe sarà però la "lettura" 
        // numbers potrà avere come tipo dei suoi elementi qualsiasi tipo derivato da Number o Number stesso
        // sarà pertanto sempre lecito assegnare un elemento di numbers, ora di tipo Integer,
        // poi di tipo Double, a number di tipo Number
        // detto in altro modo: il get di un elemento di numbers sarà sempre sicuro
        // perché, qualsiasi sarà il tipo, esso sarà sempre assegnabile con
        // il tipo Number, unico tipo conosciuto con certezza dal compilatore
        // un tipo parametrizzato covariante è dunque un tipo read-only
        // tipicamente, infatti, i valori restituiti utilizzano wildcard vincolati superiormente
        // ovvero la covarianza è generalmente associata a costrutti che "producono" o
        // ritornano dei valori
        List<? extends Number> numbers = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
        Number number = numbers.get(0); // 1
                 
        // non è possibile usare un tipo parametrizzato covariante in "scrittura" perché
        // altrimenti si violerebbe la type safety
        // infatti, dato che ? esprime un tipo sconosciuto il compilatore non ne conosce
        // la sua natura e pertanto non potrà mai permettere inserimenti nella lista
        // ? sarà un Integer?, sarà un Number?, non si sa...
        // error: incompatible types...
        numbers.add(5, 11.2);
        
        numbers = Arrays.asList(new Double[] { 1.1, 2.2, 3.3, 4.4, 5.5 });        
        number = numbers.get(0); // 1.1
       
        // dichiarazione CONTROVARIANTE
        // ? potrà essere Integer stesso oppure un suo supertipo come Number    
        // l'unica operazione type safe sarà però la "scrittura" 
        // other_numbers potrà avere come tipo dei suoi elementi Integer stesso
        // sarà pertanto sempre lecito aggiungere in numbers un elemento di tipo Integer
        // detto in altro modo: l'add di un elemento in numbers sarà sempre sicuro
        // perché, il tipo Integer, unico tipo conosciuto con certezza dal compilatore
        // sarà sempre inseribile in una lista di Integer oppure di Number
        // un tipo parametrizzato controvariante è dunque un tipo write-only
        // tipicamente, infatti, i parametri utilizzano wildcard vincolati inferiormente
        // ovvero la controvarianza è generalmente associata a costrutti che "consumano" o
        // prendono come argomenti dei valori
        List<? super Integer> other_numbers = new ArrayList<Number>();
        
        // quest'aggiunta, ribadiamo, è type safe perché un tipo Integer è sempre inseribile in una lista
        // di Integer oppure, come nel nostro caso, in una lista di tipo Number
        other_numbers.add(11);
        
        // non è possibile usare un tipo parametrizzato controvariante in "lettura" perché
        // altrimenti si violerebbe la type safety
        // infatti, dato che ? esprime un tipo sconosciuto il compilatore non ne conosce
        // la sua natura e pertanto non potrà mai permettere estrazioni dalla lista
        // ? sarà un Integer?, sarà un Number?, non si sa..
        // error: incompatible types...
        number = other_numbers.get(0);
        
        // dichiarazione INVARIANTE
        // di default i tipi generici sono invarianti e dunque la sottoindicata statement
        // non è ammessa
        // error: incompatible types: ArrayList<Integer> cannot be converted to List<Number>        
        List<Number> again_numbers = new ArrayList<Integer>();       
    }
}
