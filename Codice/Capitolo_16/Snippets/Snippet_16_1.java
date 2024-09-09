package LibroJava.Capitolo16;

public class Snippet_16_1
{
    public static void main(String[] args)
    {
        // ATTENZIONE - uso deprecato
        Character c = new Character('A'); // istanza di Character - 
                
        // valueOf ritorna una nuova istanza di tipo Character solo se è richiesta
        // questo metodo, infatti, utilizza una cache di valori nel range '\u0000' - '\u007F'
        // ciò significa che se utilizzassimo nuovamente Character.valueOf('B') sarebbe
        // ritornato un riferimento alla stessa istanza memorizzata in d
        Character d = Character.valueOf('B'); // istanza di Character
               
        Character e = 'Z'; // autoboxing 
        char c_c = e; // auto-unboxing
    }
}
