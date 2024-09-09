package LibroJava.Capitolo7;

class Button // nessun costruttore di istanza fornito...
{
    private String value;
    private int state;
}

class TextBox
{
    private int length;

    public TextBox(int l) // costruttore custom
    {
        length = l;
    }
}

public class Snippet_7_1
{
    public static void main(String[] args)
    {
        // OK - invocato il costruttore di default fornito in
        // automatico dal compilatore
        Button btn = new Button();

        // ERRORE - avendo definito un costruttore di istanza custom
        // il compilatore non ne fornisce uno di default senza parametri
        // error: constructor TextBox in class TextBox cannot be applied to given types;
        // TextBox txt = new TextBox();                      
        // required: int
        // found: no arguments
        // reason: actual and formal argument lists differ in length
        TextBox txt = new TextBox();
    }
}
