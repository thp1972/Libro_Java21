package LibroJava.Capitolo2;

class Base
{
    protected int a_field = 100;
}

class Derived extends Base // Derived deriva da Base
{
    // fenomeno dell'hiding
    // questa dichiarazione occulta (nasconde) la dichiarazione di a_field
    // effettuata nella classe Base
    private int a_field = 1000;

    public void foo()
    {
        // a_field si riferisce alla variabile di istanza relativa dichiarata
        // in questa classe (Derived)
        a_field = 1;
    }
}

class Type
{
    public void foo()
    {
        // fenomeno dell'obscuring
        // questa dichiarazione oscura la dichiarazione della classe Type perché
        // per la variabile int è usato un identificatore (Type) con lo stesso nome
        // del tipo classe (Type)
        int Type;

        // Type si riferisce alla variabile int Type e non alla classe Type
        // la regola è, infatti, che quando una variabile e un tipo hanno lo stesso nome
        // il nome della variabile venga preferito (ha precedenza)
        Type = 10;
    }
}

public class Snippet_2_28
{       
    public static void main(String[] args)
    {
    }
}
