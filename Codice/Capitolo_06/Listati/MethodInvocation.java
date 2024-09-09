package LibroJava.Capitolo6;

import java.util.Scanner;

class MyMath // una classe matematica...
{
    // definizione di un "metodo di classe"
    public static long cube(long number) // cubo di un numero
    {
        long res; // variabile locale e privata alla funzione cube
        res = number * number * number; // algoritmo
        return res; // restituisce al chiamante il risultato della computazione
    }

    // definizione di un "metodo di istanza"
    public double sqrt(double number) // radice quadrata di un numero
    {
        final int MAX = 11;
        double val; // variabili 
        val = number; // istruzioni 
        return Math.sqrt(val); // valore restituito 
    }
}

public class MethodInvocation
{
    private static void execCube()
    {
        long c_number;

        System.out.print("Digita un numero di cui far calcolare il cubo " +
                         "tra -1000 e 1000: ");

        // processa i caratteri digitati da tastiera e li converte poi in long
        c_number = new Scanner(System.in).nextLong();

        while (c_number < -1000 || c_number > 1000)
        {
            System.out.println("Il un numero deve essere compreso tra -1000 e 1000!");
            System.out.print("Digita un numero di cui far calcolare il cubo " + 
                             "tra -1000 e 1000: ");;
            c_number = new Scanner(System.in).nextLong();
        }

        // invocazione di un "metodo di classe"
        System.out.printf("Il cubo di %d è %d%n", c_number, MyMath.cube(c_number));
    }

    private static void execSqrt()
    {
        double s_number;

        System.out.print("Digita un numero di cui far calcolare la radice quadrata " +
                         "tra 0 e 1000: ");

        // processa i caratteri digitati da tastiera e li converte poi in double
        s_number = new Scanner(System.in).nextDouble();

        while (s_number < 0 || s_number > 1000)
        {
            System.out.println("Il un numero deve essere compreso tra 0 e 1000!");
            System.out.print("Digita un numero di cui far calcolare la radice " + 
                             "quadrata tra 0 e 1000: ");
            s_number = new Scanner(System.in).nextDouble();
        }
        // creazione di un oggetto di tipo MyMath
        MyMath math = new MyMath();

        // invocazione di un "metodo di istanza"
        System.out.printf("La radice quadrata di %.0f è %f%n", s_number,
                          math.sqrt(s_number));
    }

    public static void main(String[] args)
    {
        // invocazioni dei "metodi di classe" della classe MethodInvocation
        execCube(); // senza anteporre il nome della classe
        MethodInvocation.execSqrt(); // anteponendo il nome della classe
    }
}
