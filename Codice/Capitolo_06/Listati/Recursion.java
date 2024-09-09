package LibroJava.Capitolo6;

import java.util.Scanner;

public class Recursion
{
    public static long factorial(long number)
    {
        if (number <= 1) // caso base
            return 1;
        else // passo ricorsivo
            return number * factorial(number - 1);
    }

    public static void main(String[] args)
    {
        long number, result = 0;

        System.out.println("*** Calcolo del fattoriale di un numero ***\n");
        System.out.print("Digita un numero [-1 per uscire]: ");

        while ((number = new Scanner(System.in).nextLong()) != -1)
        {
            if (number < 0) // per qualsiasi altro numero negativo diverso da -1...
                System.out.println("Digita solo numeri maggiori o uguali a 0");
            else if (number > 20) // max. il fattoriale di 20...
                System.out.println("Digita solo numeri minori o uguali a 20");
            else
            {
                result = factorial(number); // calcolo del fattoriale
                System.out.printf("Il fattoriale di %d è %d%n", number, result);
            }
            System.out.print("Digita un numero [-1 per uscire]: ");
        }
        System.out.println("\n*** Computazione terminata ***");
    }
}
