package LibroJava.Capitolo7;

class TopLevel
{
    private int outer_x = 100;

    void display()
    {
        Inner inner = new Inner(); // istanza classe interna di tipo 
                                   // member class 
        inner.display();
    }

    // dichiarazione di una classe interna (member class)
    public class Inner
    {
        private String show1 = "Valore 'outer_x' di TopLevel mostrato dal metodo display"
                               + " della classe Inner\n" + "in essa annidata = ";

        void display()
        {
            System.out.println(show1 + outer_x);
        }
    }
}

public class MemberClasses
{
    public static void main(String[] args)
    {
        TopLevel top_level = new TopLevel();
        top_level.display();
    }
}
