package LibroJava.Capitolo11;

import java.util.ArrayList;
import java.util.List;

enum Colors { RED, GREEN, BLUE }
class Paint
{
    public static void paint(Colors c)
    {
        // INTERNAL INVARIANT
        // asserisco che potrò colorare solo con i colori RED, GREEN e BLUE
        // se, per esempio, in futuro amplio l'enumerazione con la costante YELLOW
        // e poi la utilizzo per l'argomento c allora la chiamata di paint genererà 
        // un AssertionError perché non è prevista la "colorazione" con quel colore
        // e dunque la condizione dell'invariante non è più vera ossia non è più
        // vero che c può avere come valore solo RED, GREEN o BLUE
        switch (c)
        {
            case RED:
                System.out.println("Disegno con il rosso..."); break;
            case GREEN:
                System.out.println("Disegno con il verde..."); break;
            case BLUE:
                System.out.println("Disegno con il blu..."); break;
            default:
                assert false : "Colore non legale [ " + c + " ]";
        }
    }
}

class Char
{
    public Character toUpper(Character c) // metodo PUBBLICO
    {
        // qua una precondizione con assert non dovrebbe essere usata perché la verifica
        // degli argomenti nei metodi pubblici dovrebbe essere parte del "contratto" del metodo
        // e questo "contratto" deve sempre essere rispettato
        // dato che le asserzioni possono essere, a discrezione, abilitate e soprattutto 
        // disabilitate quel "contratto", in caso, per l'appunto, di una disabilitazione
        // delle asserzioni sarebbe non rispettato
        // utilizziamo, dunque, il meccanismo di gestione delle eccezioni 
        if (Character.isDigit(c))
            throw new IllegalArgumentException("Carattere illegale [ " + c + " ]");

        Character c_conv = convert(c);

        // POSTCONDITION
        // asserisco che l'oggetto c_conv sia sempre valorizzato 
        // il metodo cioè può ritornare solo se tale condizione è soddisfatta
        assert c_conv != null : "Nessuna conversione occorsa";
        return c_conv;
    }

    private char convert(Character c) // metodo PRIVATO
    {
        // PRECONDITION
        // asserisco che l'argomento c sia sempre valorizzato
        // il metodo cioè può svolgere il suo compito elaborativo solo se tale
        // condizione è soddisfatta
        assert c != null : "Conversione non attuabile";
        return Character.toUpperCase(c);
    }
}

class Square
{
    private int side;

    public Square(int side) { this.side = side; }

    public int area()
    {
        assert isComputable() : "Square non valido";
        return side * side;
    }

    public int perimeter()
    {
        assert isComputable();
        return side * 4;
    }

    // CLASS INVARIANT
    // asserisco la validità dello stato di un oggetto Square
    // in pratica deve sempre avere un lato maggiore o uguale a 0  
    // qualsiasi operazione si effettui
    // tipicamente il check di un invariante di classe è effettuato da un metodo privato
    // della classe che si intende testarne lo stato e ritorna un valore booleano
    // che esprime, per l'appunto, il risultato di quel check
    private boolean isComputable()
    {
        return side >= 0; // campo da verificare...
    }
}

class Numbers
{
    private enum NEP { EVEN, ODD };
    
    // numeri iniziali...
    // qua diamo per scontato che i numeri siano sempre o pari o dispari
    private int[] even_numbers =  { 2, 4, 6, 8 };
    private int[] odd_numbers = { 1, 3, 5, 7 };    
    private List<Integer> alnr = new ArrayList<>();
    
    public int[] getEvenNumbers() { return even_numbers; }
    public int[] getOddNumbers() { return odd_numbers; }
    
    // se quest'algoritmo interno è errato oppure lo sono gli algoritmi dei metodi
    // isEven e isOdd, allora il flusso di esecuzione del codice in swapEven e in swapOdd 
    // raggiungerà il punto che diamo per scontato non dovrebbe mai essere raggiunto
    // e dunque sarà sollevata un'eccezione AssertionError
    private void filter(int[] from, int[] to, NEP nep)
    {
        alnr.clear();
        for(int n : to)
        {
            if (nep == NEP.EVEN)
            {
                if (isEven(n)) alnr.add(n);
            }
            else if (nep == NEP.ODD)
            {
                if (isOdd(n)) alnr.add(n);
            }                    
        }

        from = new int[alnr.size()];
        for (int i = 0; i < from.length; i++)
            from[i] = alnr.get(i);        
        
        if(nep == NEP.EVEN) even_numbers = from;
        else if(nep == NEP.ODD) odd_numbers = from;
    }
    
    public void evenNumbersSupplier(int[] en)
    {
        filter(even_numbers, en, NEP.EVEN);
    }            
    public void oddNumbersSupplier(int[] on) 
    {
        filter(odd_numbers, on, NEP.ODD);        
    }
    
    private void swap(int[] data, int from, int to)
    {
        int temp;
        temp = data[from];
        data[from] = data[to];
        data[to] = temp;
    }
           
    // CONTROL FLOW INVARIANT
    // asserisco che il controllo del flusso di esecuzione non potrà mai raggiungere
    // il punto indicato dall'assert; qua i numeri possono solo essere pari...
    public void swapEven(int from, int to)
    {
        if (isEven(even_numbers[from]) && isEven(even_numbers[to]))
        {
            swap(even_numbers, from, to);
            return;
        }
        assert false : "Linea di codice in swapEven illegalmente raggiunta";
    }

    // CONTROL FLOW INVARIANT
    // asserisco che il controllo del flusso di esecuzione non potrà mai raggiungere
    // il punto indicato dall'assert; qua i numeri possono solo essere dispari...
    public void swapOdd(int from, int to)
    {
        if (isOdd(odd_numbers[from]) && isOdd(odd_numbers[to]))
        {
            swap(odd_numbers, from, to);
            return;
        }
        assert false : "Linea di codice in swapOdd illegalmente raggiunta";
    }    
    
    private boolean isEven(int n) { return n % 2 == 0; }    
    private boolean isOdd(int n) { return !isEven(n); }
}

public class Snippet_11_1
{
    public static void main(String[] args)
    {
        new Paint().paint(Colors.RED); // Disegno con il rosso...
        System.out.println(new Char().toUpper('a')); // A
        System.out.println(new Square(10).area()); // 100
        
        Numbers numbers = new Numbers();
        numbers.swapEven(0, 1);
        numbers.swapOdd(0, 1);
        numbers.getEvenNumbers(); // 4, 2, 6, 8
        numbers.getOddNumbers(); // 3, 1, 6, 8
        
        numbers.evenNumbersSupplier(new int[] { 8, 9, 2 });
        numbers.swapEven(0, 1); 
        numbers.getEvenNumbers(); // 2, 8
        
        numbers.oddNumbersSupplier(new int[] { 8, 9, 7 });
        numbers.swapOdd(0, 1); 
        numbers.getOddNumbers(); // 7, 9
    }
}
