package LibroJava.Capitolo7;

public class Snippet_7_2
{ // outer scope

    private int data = 100;

    public void dataProcessing()
    { // inner scope

        // qui data nasconde la variabile di istanza data
        int data = 10;
        System.out.printf("variabile locale data = %d%n" +
                          "variabile di istanza data = %d%n",
                          data, // 10... nessuna qualificazione...
                          this.data); // 100... qualificazione tramite this
    }

    public static void main(String[] args)
    {
        new Snippet_7_2().dataProcessing();
    }
}
