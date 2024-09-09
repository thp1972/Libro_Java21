package LibroJava.Capitolo7;

class TopLevel // una classe top level
{
    private String data_1 = 
    "Valore di 'a' della classe Local dichiarata nel metodo display" +
    " della classe TopLevel = ";
    
    private String data_2 = 
    "Valore di 'ABC' del metodo display della classe TopLevel mostrato" +
    " dal metodo display\n" + "della classe Local dichiarata nel metodo" +
    " display della classe TopLevel = ";

    void display()
    {
        final int ABC = 11;

        class Local // classe locale al metodo display 
        {
            private int a;

            public Local() { a = 1000; }

            public void display()
            {
                System.out.println(data_1 + a + "\n" + data_2 + ABC);
            }
        }

        Local a_local = new Local();
        a_local.display();
    }
}

public class LocalClasses
{
    public static void main(String[] args)
    {
        TopLevel top_level = new TopLevel();
        top_level.display();
    }
}
