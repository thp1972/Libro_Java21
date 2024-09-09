package LibroJava.Capitolo2;

public class Snippet_2_11
{
    public static void main(String[] args)
    {
        byte b = 99;

        // anche se un tipo char ha la stessa rappresentazione di un tipo short unsigned
        // (è un tipo intero senza segno a 16 bit) rispetto a esso, però, non può
        // accettare valori di tipo byte (da 0 a 127) e short (da 0 a 32767) 
        // un tipo short, invece, può accettare valori di tipo byte e short stesso
        short s = b; // OK - conversione implicita da byte a short permessa        
        char c = b; // ERRORE - conversione implicita da byte a char non permessa

        char o_c = 10; // OK - è possibile assegnare un letterale intero a un char    
    }
}
