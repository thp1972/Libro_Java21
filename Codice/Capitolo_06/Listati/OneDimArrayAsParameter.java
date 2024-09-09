package LibroJava.Capitolo6;

public class OneDimArrayAsParameter
{
    public static int subtraction(int[] data)
    {
        int result = 0;

        if (data.length > 0)
        {
            result = data[0];
            for (int i = 1; i < data.length; i++)
                result -= data[i];
        }

        return result;
    }

    public static void main(String[] args)
    {
        // un array monodimensionale
        int[] some_data = { 369, 10, 15, 65, 88, 66 };

        // invocazione di un metodo passando come argomento un tipo array
        int res = subtraction(some_data);

        System.out.printf("Il risultato della sottrazione di tutti gli elementi di" +
                          " some_data è: %d%n", res);
    }
}
