package LibroJava.Capitolo7;

class A_Class
{
    public int number = 3233; // il valore 3233 è l'inizializzatore di variabile di istanza 
    private int x;
    private int y;
    private int z;
    
    // blocco di codice per inizializzare più istanze (instance initializer)
    {    
        x = 11;
        y = 12;
        z = 13;
        number = x + y + z + foo();
    }

    public A_Class(int val) // costruttore 
    {
        number += val * 2;
    }

    public A_Class(int val1, int val2) // altro costruttore 
    {
        number += (val1 + val2) * 2;
    }

    public int foo()
    {
        return 100;
    }
}

public class Initializers
{
    public static void main(String[] args)
    {
        // creo un oggetto di tipo A_Class invocando il costruttore a un argomento 
        A_Class an_obj = new A_Class(3); 
        System.out.print(an_obj.number); 
        
        // creo un oggetto di tipo A_Class invocando il costruttore a due argomenti 
        A_Class an_obj_2 = new A_Class(3, 2); 
        System.out.printf(" e %d%n", an_obj_2.number); 
    }
}
