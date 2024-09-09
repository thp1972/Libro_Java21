package LibroJava.Capitolo7;

class Data
{
    private static int counter; // membro statico privato
    private int number; // membro di istanza privato

    public Data() { counter++; } // costruttore

    public int getNumber() { return number; }
    public void setNumber(int value) { number = value; }

    // metodo statico per ottenere il valore del campo statico counter
    public static int getCounter() { return counter; }

    // metodo statico per impostare il valore del campo statico counter
    public static void setCounter(int value) { counter = value; }
}

public class Snippet_7_7
{
    public static void main(String[] args)
    {
        Data d1 = new Data(); // counter = 1
        d1.setNumber(100);
        Data d2 = new Data(); // counter = 2
        d2.setNumber(200);

        // questo cambiamento sarà condiviso tra le istanze d1 e d2
        Data.setCounter(3); // counter = 3

        int value = d1.getNumber() + Data.getCounter(); // 103
    }
}
