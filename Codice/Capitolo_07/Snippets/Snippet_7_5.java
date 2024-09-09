package LibroJava.Capitolo7;

class Data
{
    public int x; // membro di istanza
    public static int y; // membro statico

    // membro di istanza:
    // può accedere ad x e ad y senza problemi
    public void foo()
    {
        x = 100; // OK - è come this.x = 100;
        y = 200; // Ok - è come Data.y = 200;
    }

    // membro statico:
    // può accedere solo a y senza problemi
    public static void bar()
    {
        // ERRORE - non può accedere come this.x = 100;
        // this si riferisce alla corrente istanza, che, nel caso
        // di un metodo statico, semplicemente non esiste
        x = 100; // error: non-static variable x cannot be referenced from a static context
        y = 200; // Ok - è come Data.y = 200;
    }
}

public class Snippet_7_5
{
    public static void main(String[] args)
    {
        Data data = new Data();
        data.x = 1000; // OK

        data.y = 1000; // OK - comunque sconsigliato; meglio Data.y
        Data.y = 1000; // OK - best practice

        // ERRORE - non si può accedere a x tramite Data
        Data.x = 1000; // error: non-static variable x cannot be referenced from a static context
    }
}
