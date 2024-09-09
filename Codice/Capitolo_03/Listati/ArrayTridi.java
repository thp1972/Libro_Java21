package LibroJava.Capitolo3;

import java.util.Random;

public class ArrayTridi
{
    public static void main(String[] args)
    {
        // inizializzazione del generatore pseudo-casuale dei numeri
        Random rnd = new Random();

        final int NR_OF_PAGES = 3;
        final int NR_OF_ROWS = 20;
        final int NR_OF_COLS = 50;

        // vettore per le somme degli elementi di ciascuna tabella
        int[] sum = new int[NR_OF_PAGES]; // riutilizziamo NR_OF_PAGES...

        // array 3D
        int[][][] data = new int[NR_OF_PAGES][NR_OF_ROWS][NR_OF_COLS];
        
        // scrivo dei dati casuali nelle tre tabelle
        for (int j = 0; j < NR_OF_PAGES; j++) // indice pagina
        {
           for (int k = 0; k < NR_OF_ROWS; k++) // indice riga
           {
               for (int l = 0; l < NR_OF_COLS; l++) // indice colonna
               {
                   data[j][k][l] = rnd.nextInt(1000); // numeri pseudo-casuali
                                                      // tra 0 e 999

                   // operazione di somma: operatore += permette di scrivere in modo
                   // abbreviato: sum[j] = sum[j] + data[j][k][l];
                   sum[j] += data[j][k][l];
               }
           }
        }
        
         // mostro la somma dei valori per ciascuna tabella
        for (int j = 0; j < NR_OF_PAGES; j++)
        {
            System.out.printf("La tabella %d contiene valori per una " +
                              "somma totale di %d%n", j, sum[j]);
        }
    }
}
