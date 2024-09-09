package LibroJava.Capitolo6;

class MyInt // una classe
{
    public int val;
}

public class ByValueAndReferenceType
{
    public static void fooNotMod(int a_in_method)
    {
        a_in_method = 100; // qui la variabile primitiva a_in_method non
                           // modificherà il valore dell'argomento
    }

    public static void fooMod(MyInt a_in_method_rif)
    {
        a_in_method_rif.val = 100; // qui la variabile riferimento a_in_method_rif
                                   // punterà allo stesso oggetto puntato dalla
                                   // variabile riferimento an_int e pertanto la
                                   // modifica del membro dato val sarà "visibile" anche
                                   // tramite la variabile an_int
    }

    public static void main(String[] args)
    {
        MyInt an_int = new MyInt(); // oggetto di tipo MyInt
        an_int.val = 200; // qui vale 200
        fooMod(an_int); // invoco fooMod
        System.out.printf("an_int.val vale: %d%n", an_int.val); // qui vale 100

        int c = 200;
        fooNotMod(c); // invoco fooNotMod
        System.out.printf("c vale: %d%n", c); // qui vale ancora 200
    }
}
