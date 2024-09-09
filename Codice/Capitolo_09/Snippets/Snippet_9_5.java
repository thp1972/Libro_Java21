package LibroJava.Capitolo9;

public class Snippet_9_5
{
    public static void main(String[] args)
    {
        // dei tipi int (wrapper class Integer)
        int x = 100, y = 200;

        // assegnamento lecito, perché il corrispondente tipo Integer
        // implementa l'interfaccia Comparable<Integer>
        // in questo caso usiamo Comparable come tipo raw e il compilatore
        // userà per il parametro di tipo T di Comparable<T> il tipo Object
        Comparable cmp_1 = x;

        System.out.println(cmp_1.compareTo(y)); // -1

        // a compile time non c'è nessun errore, perché è possibile assegnare
        // un tipo String ("D") a un tipo Object (il parametro formale o di compareTo)
        // tuttavia a runtime sarà generata un'apposita eccezione software
        // qui il compilatore non avrà eseguito nessun controllo di type-safety
        // avendo usato Comparable come tipo raw (non generico)
        System.out.println(cmp_1.compareTo("D")); // java.lang.ClassCastException: 
                                                  // java.base/java.lang.String cannot
                                                  // be cast to java.base/java.lang.Integer
                                                  
        // assegnamento lecito, perché il corrispondente tipo Integer
        // implementa l'interfaccia Comparable<Integer>
        // in questo caso usiamo Comparable come tipo generico
        Comparable<Integer> cmp_2 = x;

        System.out.println(cmp_2.compareTo(y)); // -1

        // a compile time è subito rilevato un errore di compilazione, perché
        // il compilatore effettuerà controlli di type-safety 
        // essendo Comparable<Integer> un'interfaccia generica
        // error: method compareTo in interface Comparable<T> cannot be applied to given types;
        // argument mismatch; String cannot be converted to Integer
        System.out.println(cmp_2.compareTo("D"));
    }
}
