package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.List;

abstract class Dog { }

class WhiteTerrier extends Dog { }
class GoldenRetriever extends Dog { }

public class Snippet_9_7
{
    public static void main(String[] args)
    {
        List<WhiteTerrier> wt = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        
        // di default non esiste nessuna varianza tra delle classi generiche
        // non è cioè mai possibile creare una relazione di sottotipo tra due
        // differenti istanze della stessa classe generica
        // in fondo una lista di WhiteTerrier è un oggetto completamente diverso
        // da una lista di Dog
        dogs = wt; // error: incompatible types: 
                   // List<WhiteTerrier> cannot be converted to List<Dog>
                           
        // se fosse lecito l'assegnamento dogs = wt sarebbe possibile mettere a
        // compile time e a runtime un oggetto di tipo WhiteTerrier in una lista di
        // WhiteTerrier
        dogs.add(new WhiteTerrier());
        
        // dal punto di vista del compilatore non c'è alcun problema nell'aggiungere
        // nella lista di cani un golden retriever perché esiste una relazione di
        // sottotipo tra GoldenRetriever e Dog ossia GoldenRetriever <: Dog
        // in fondo, cioè, un golden retriever "è un" cane...
        // tuttavia se fosse permesso l'assegnamento dogs = wt avremmo che a runtime
        // dogs conterrebbe un riferimento di tipo WhiteTerrier ossia quella lista
        // dovrebbe contenere solo oggetti di quel tipo, ma poi con la seguente
        // istruzione aggiungiamo un oggetto di tipo GoldenRetriever che non è dunque
        // compatibile e il sistema genererebbe un'eccezione di tipo 
        // ClassCastException ecco quindi che per ragioni di type safety 
        // il compilatore Java non permette di avere tipi generici varianti
        dogs.add(new GoldenRetriever());
    }
}
