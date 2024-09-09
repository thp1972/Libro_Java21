package LibroJava.Capitolo16;

public class Snippet_16_5
{
    public static void main(String[] args)
    {
        Character c = 'A';
        Character d = 'A';
                
        // in questo caso anche c == d avrebbe ritornato true e questo perché, in
        // accordo con la specifica Java, dato un valore v che sta per subire un 
        // autoboxing e che è un letterale int tra -128 e 127, un letterale boolean
        // true o false o un letterale char tra '\u0000' e '\u007f', esso darà sempre
        // come risultato la stessa istanza se il suo valore è compreso negli
        // intervalli indicati
        // in pratica un'implementazione di Java può decidere che i valori compresi
        // in quegli intervalli siano memorizzati in una cache e siano boxati in oggetti
        // non differenti
        // c e d, dunque, conterranno lo stesso riferimento di tipo Character perché
        // il valore 'A' rientra nel range '\u0000' - '\u007f'
        // in ogni caso, indipendentemente da quanto detto, è sempre preferibile rilevare
        // l'eguaglianza dei sottostanti valori di oggetti Character con il metodo equals
        boolean b = c.equals(d); // true
    }
}
