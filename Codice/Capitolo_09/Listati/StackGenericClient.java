package LibroJava.Capitolo9;

public class StackGenericClient
{
    public static void main(String[] args) throws Exception
    {
        Double[] d =    { 11.1, 11.2, 8.6 }; 
        Integer[] i =   { 12, 13, 5 }; 
        Character[] c = { 'a', 'b', 'z' }; 

        final int MAX = 3; // numero massimo di elementi
        
        StackGeneric<Double> sd = new StackGeneric<>(MAX);
        StackGeneric<Integer> si = new StackGeneric<>(MAX);
        StackGeneric<Character> sc = new StackGeneric<>(MAX);
 
        // test push 
        for (double e : d)
            sd.push(e);
        for (int e : i)
            si.push(e);
        for (char e : c)
            sc.push(e);
        
        // test pop
        System.out.print("Valori double: ");
        for (int nr = 0; nr < d.length; nr++)
        {
            double d_tmp = sd.pop();
            System.out.printf("%.1f ", d_tmp);
        }

        System.out.print("| Valori int: ");
        for (int nr = 0; nr < i.length; nr++)
        {
            int i_tmp = si.pop();
            System.out.printf("%d ", i_tmp);
        }

        System.out.print("| Valori char: ");
        for (int nr = 0; nr < c.length; nr++)
        {
            char c_tmp = sc.pop();
            System.out.printf("%c ", c_tmp);
        }
        System.out.println();
    }        
}
