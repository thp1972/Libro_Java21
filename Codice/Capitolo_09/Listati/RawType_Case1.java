package LibroJava.Capitolo9;

public class RawType_Case1
{
    public static void main(String[] args) throws Exception
    {
        Double[] d = { 11.1, 11.2, 8.6 }; 
        
        // variabile di tipo raw con oggetto creato di tipo raw 
        StackGeneric sd = new StackGeneric(3);
 
        for (double e : d) // test push 
            sd.push(e);
        
        System.out.print("Valori dello stack Double: "); // test pop 
        for (int nr = 0; nr < d.length; nr++)
        {
            // error: incompatible types: Object cannot be converted to Double
            Double d_tmp = sd.pop();
            System.out.print(d_tmp + " ");
        }
        System.out.println();
    }       
}
