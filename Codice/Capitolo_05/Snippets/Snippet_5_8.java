package LibroJava.Capitolo2;

class Producer
{
    int _prodVal;

    // si può qui usare yield come identificatore perché ricordiamo 
    // essere una keyword contestuale
    public int yield(int val)
    {
        _prodVal = val;
        return val * val;
    }

    public void PrintProducerValue()
    {
        // in questo caso dobbiamo qualificare il nome del metodo 
        // come this.yield(5);
        // yield(5); // error: yield outside of switch expression
        // to invoke a method called yield, qualify the yield with a
        // receiver or type name
    }

    public int GetValueToProduce()
    {
        // non-local jump vietato: GetValueToProduce è un metodo di istanza
        yield _prodVal;
    }
}

public class Snippet_5_8
{
    public static void main(String[] args)
    {
        String hexColorCode;
        String colorName = "red";

        hexColorCode = switch (colorName)
        {
            //case "red" -> yield; // error: No yield target
            
            // error: Bad type in switch expression: void cannot be converted to int
            // case "green" -> System.out.println("00FF00"); 
            
            case "red" -> { yield "FF0000"; }
            default ->
                throw new IllegalArgumentException("no color");
        };

        System.out.println(hexColorCode);
    }
}
