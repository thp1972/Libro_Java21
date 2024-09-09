package LibroJava.Capitolo5;

public class Continue
{
    public static void main(String[] args)
    {
        int a;
        System.out.print("a = ");
        for (a = 1; a <= 10; a++) // finché a <= 10
        {
            if (a == 5) // salta l'istruzione successiva se a == 5
                continue;
            System.out.printf("%d%c ", a, a != 10 ? ',' : ' ');
            // continue fa spostare il flusso di esecuzione qui;
            // poi il ciclo riprende con a++ quindi a <= 10
        }
        System.out.println();

        a = 1;

        System.out.print("a = ");
        while (a <= 10) // finché a <= 10
        {
            if (a == 5) // salta le istruzioni successive se a == 5
            {
                a++;
                continue;
            }
            System.out.printf("%d%c ", a, a != 10 ? ',' : ' ');
            a++;
            // continue fa spostare il flusso di esecuzione qui;
            // poi il ciclo riprende con a <= 10
        }
        System.out.println();
    }
}
