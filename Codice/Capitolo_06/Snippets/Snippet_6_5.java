package LibroJava.Capitolo6;

public class Snippet_6_5
{
    private static void foo(int nr)
    {
        System.out.println(nr);
    }

    public static void main(String[] args)
    {
        // invocazione del metodo foo con cast esplicito, perché il metodo sqrt
        // restituisce un valore double incompatibile con l'argomento int del metodo foo
        // Math.sqrt(3.3) restituirebbe 1.816590212458495 ma il cast in int
        // fa sì che quel valore perda la sua parte frazionaria e pertanto foo
        // riceverà nel suo parametro nr il valore 1
        foo((int) Math.sqrt(3.3)); // 1
    }
}
