package LibroJava.Capitolo8;

public class Snippet_8_12
{
    public static void main(String[] args)
    {
        CharSequence chars = "Pellegrino";

        // utilizzo con l'operatore AND logico condizionale
        // str è in scope a destra dell'operatore && perché la relativa
        // espressione sarà valutata solo se chars instanceof String sarà true
        // si avrà la certezza che str è stata creata e inizializzata
        if (chars instanceof String str && str.length() > 0)
        {
            System.out.println(str); // str qui è ancora in scope
        }

        // utilizzo con l'operatore OR logico condizionale
        // str NON è in scope a destra dell'operatore || perché la relativa
        // espressione sarà valutata quando chars instanceof String sarà false
        // str NON è stata quindi creata e inizializzata correttamente
        // errore di compilazione: Cannot resolve symbol 'str'
        if (chars instanceof String str || str.length() > 0)
        {
            System.out.println(str); // str qui NON è in scope
        }

        // utilizzo con l'operatore NOT logico
        // str è in scope nel ramo else perché str sarà creata e valorizzata
        // solamente se il ramo if è valutato false
        // quest'esempio rende esplicita la differenza tra il flow scoping e lo static scoping
        // infatti il flusso corretto di esecuzione del codice procede nel ramo else
        // perché è solo lì che si avrà la certezza che str è stata "definitely matched"
        if (!(chars instanceof String str))
        {
            // esegue questo ramo se è vero che str NON è di tipo String
            // str non può quindi essere in scope
            return; // non necessaria...
        }
        else
        {
            // esegue questo ramo se è vero che str è di tipo String
            // quindi in questo caso str è "definitely matched"
            System.out.println(str.length());
        }
    }
}
