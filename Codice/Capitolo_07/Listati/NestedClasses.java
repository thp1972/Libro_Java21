package LibroJava11.Capitolo7;

class TopLevel
{
    private int outer_x = 100;

    void display()
    {
        Nested inner = new Nested(); // istanza classe annidata 
        inner.display();
    }

    // dichiarazione di una classe annidata 
    public class Nested
    {
        private String show1 = "Valore 'outer_x' di TopLevel mostrato dal metodo display"
                               + " della classe Nested\n" + "ad essa annidata = ";

        void display()
        {
            System.out.println(show1 + outer_x);
        }
    }
}

public class NestedClasses
{
    public static void main(String[] args)
    {
        TopLevel top_level = new TopLevel();
        top_level.display();
    }
}
