package LibroJava.Capitolo16;

public class Snippet_16_2
{
    public static void main(String[] args)
    {
        Character c = 'A'; // 65 -> valore decimale Unicode  
        Character d = 'B'; // 66 -> valore decimale Unicode  

        // il metodo ritorna il valore -1 a indicare che il carattere A è minore del carattere B
        // infatti il carattere A ha il valore decimale Unicode 65, che si trova a una posizione 
        // in meno dal valore decimale Unicode 66 del carattere B
        // se avessimo comparato il carattere A con il carattere E, che ha il valore decimale
        // Unicode 69, il risultato sarebbe stato -4
        int n = c.compareTo(d); // –1
    }
}
