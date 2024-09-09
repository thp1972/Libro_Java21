package LibroJava.Capitolo5;

public class ContinueAndLabeledStatement
{
    public static void main(String[] args)
    {
        int[][] numbers =
        {
            { 1, 3, 7, 6, 8, 9 },
            { 3, 5, 9, 7, 8, 2 },
            { 5, 7, 8, 9, 2, 0 }            
        };
                   
        // stampiamo solo i primi numeri dispari delle righe della matrice
        // numbers finché, cioè, non troviamo almeno un numero pari
        start:
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                // appena rileviamo un numero pari interrompiamo la
                // corrente iterazione del for e tramite continue start continuiamo
                // con la prossima iterazione del ciclo for decorato da start stesso
                if (numbers[i][j] % 2 == 0)
                {
                    System.out.println();
                    continue start;
                }
                System.out.printf("%d ", numbers[i][j]);
            }
        }
    }
}
