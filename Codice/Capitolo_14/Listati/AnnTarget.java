package LibroJava.Capitolo14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

// l'annotazione può essere usata solo nei contesti di dichiarazione indicati
// notare l'utilizzo della sintassi di tipo array initializer per indicare
// i relativi valori
// essa è consentita perché l'unico elemento del tipo java.lang.annotation.Target
// è dichiarato come ElementType[] value ossia value è un array di elementi
// di tipo ElementType
@Target({ ElementType.FIELD, ElementType.LOCAL_VARIABLE }) 
@interface ShowInEditor // single-element annotation type
{
    boolean value();
}

// l'annotazione può essere usata solo nei contesti di tipo
@Target(ElementType.TYPE_USE)
@interface OnlyString { } // marker annotation type

public class AnnTarget
{
    @ShowInEditor(true) // declaration context
    private int data = 500;

    // type context               
    List<@OnlyString String> datas = new ArrayList<>();

    public static void main(String[] args)
    {
        @ShowInEditor(true) // declaration context
        int number = 100;
    }
}