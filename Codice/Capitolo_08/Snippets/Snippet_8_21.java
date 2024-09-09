package LibroJava.Capitolo8;

sealed interface IFace permits A_class, B_class {}
final class A_class implements IFace {}
final class B_class implements IFace {}

public class Snippet_8_21
{
    public static void main(String[] args)
    {
        Object o = "Pellegrino";

        // errore di compilazione:
        // 'switch' statement does not cover all possible input values
        // questa switch non è esaustiva perché non copre tutti i possibili tipi di o
        // 1) tutti i sottotipi di Object
        // 2) Object stesso
        switch (o)
        {
            case String s -> System.out.printf("%s%n", s);
        }

        // errore di compilazione:
        // 'switch' statement does not cover all possible input values
        // questa switch non è ANCORA esaustiva perché non copre tutti i 
        // possibili tipi di o
        // 1) tutti i sottotipi di Object
        // 2) Object stesso
        switch (o)
        {
            case String s -> System.out.printf("%s%n", s);
            case Integer i -> System.out.printf("%d%n", i);
        }

        // questa switch è esaustiva perché copre tutti i possibili tipi di o
        switch (o)
        {
            case String s -> System.out.printf("%s%n", s);
            case Integer i -> System.out.printf("%d%n", i);
            case Object ao -> System.out.printf("%s%n", ao);
        }

        // questa switch è esaustiva perché copre tutti i possibili tipi di o
        switch (o)
        {
            case String s -> System.out.printf("%s%n", s);
            case Integer i -> System.out.printf("%d%n", i);
            default -> System.out.printf("%s%n", o); // match-all switch label
        }

        // questa switch è esaustiva perché copre tutti i possibili tipi di iFace
        // in questo caso non è necessaria una label default perché il compilatore
        // è in grado in autonomia di verificare tutti i possibili tipi di iFace
        // rilevandoli dalla clausola permits utilizzata nella dichiarazione
        // dell'interfaccia sigillata IFace
        IFace iface = new A_class();
        switch (iface)
        {
            case A_class aClass -> System.out.printf("%s%n", aClass);
            case B_class bClass -> System.out.printf("%s%n", bClass);
        }
    }
}

