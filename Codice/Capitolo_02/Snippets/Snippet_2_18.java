package LibroJava.Capitolo2;

public class Snippet_2_18
{
    public static void main(String[] args)
    {
        int var_1 = 1000;
        int var_2 = 2000;

        // ora var_1 conterrà una copia del valore di var_2 ossia il valore 2000
        var_1 = var_2;

        // ora var_1 conterrà il valore 4000 ma var_2 conterrà ancora il valore 2000
        var_1 = 4000;
    }
}
