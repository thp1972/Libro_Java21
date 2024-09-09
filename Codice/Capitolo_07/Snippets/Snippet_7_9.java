package LibroJava.Capitolo7;

// Inner e Local sono categorizzate come classi interne
class Container // classe contenitrice, in generale, di Inner e Local
{
    private int data_1 = 1000;
    private static int data_2 = 2000;

    class Inner // classe membro non static
    {
        // ERRORE - number_1 è un membro statico
        // error: Illegal static declaration in inner class Container.Nested
        // modifier 'static' is only allowed in constant variable declarations
        private static int number_1 = 5;

        // OK - NUMBER_2 è una constant variable
        private static final int NUMBER_2 = 10;
    }

    public static void foobar()
    {
        class Local // classe locale
        {
            // ERRORE - dichiarata in un contesto statico; data_1 è un campo di istanza
            // error: non-static variable data_1 cannot be referenced from a static context
            private int z = data_1;
        }
    }

    public void foo()
    {
        class Local // classe locale
        {
            public void bar()
            {
                // OK - è possibile accedere a data_1 anche se è private
                // allo stesso modo è possibile accedere ai membri statici della
                // classe contenitrice
                int x = data_1;
                int y = Container.data_2;
            }

            // ERRORE - non è possibile dichiarare un inizializzatore statico
            // error: Illegal static declaration in inner class Local
            // modifier 'static' is only allowed in constant variable declarations
            static { }
        }
    }
}

public class Snippet_7_9
{
    public static void main(String[] args)
    {
    }
}
