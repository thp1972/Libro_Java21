package LibroJava.Capitolo7;

class DataManager
{
    int data_1;
    int data_2;
    int number = 1000;

    public DataManager()
    {
        this(0, 0);
        // DataManager() --> number = 2000
        System.out.printf("DataManager() --> number = %d%n", (number += 1000));
    }

    public DataManager(int d1, int d2)
    {
        // DataManager(int, int) --> number = 1000
        System.out.printf("DataManager(int, int) --> number = %d%n", number);
    }
}

public class Snippet_7_3
{
    public static void main(String[] args)
    {
        // all'atto di invocazione del costruttore DataManager() la prima istruzione
        // eseguita sarà quella di invocazione del costruttore DataManager(0, 0)
        // al cui interno come prima istruzione sarà eseguito l'assegnamento del valore
        // 1000 alla variabile di istanza number (number = 1000)
        // sarà poi eseguita la printf che manderà in output il valore di number (1000)
        // al termine di DataManager(int d1, int d2) il flusso di esecuzione del codice
        // riprenderà alla successiva istruzione di DataManager() (quella dopo this(0, 0))
        // che eseguirà la printf che manderà in output il valore di number 
        // incrementato di 1000 (2000)       
        new DataManager();
    }
}
