package LibroJava.Capitolo5;

public class Snippet_5_5
{
    public static void main(String[] args)
    {
        int a = 0, b = 0, c = 0;

        // al termine dell'iterazione dei cicli le variabili a, b e c
        // conterranno rispettivamente i valori 10, 10 e 5 e ciò dimostrerà
        // che il I e il II ciclo non sono stati interrotti dal break del III ciclo
        while (a < 10) // I ciclo
        {
            a++;
            while (b < 10) // II ciclo innestato nel I
            {
                b++;
                while (c < 10) // III ciclo innestato nel II
                {
                    // in questo caso il break trasferisce il flusso di esecuzione del
                    // codice al II ciclo; la successiva istruzione sarà dunque
                    // while (b < 10) ...
                    if (c == 5)
                        break; // interrompe solo il III ciclo!
                    c++;
                }
            }
        }
    }
}
