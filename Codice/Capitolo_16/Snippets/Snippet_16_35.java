package LibroJava.Capitolo16;

public class Snippet_16_35
{
    public static void main(String[] args)
    {
        // nulla vieta di usare stripIndent con i letterali stringa!
        String someText = "   Nel mezzo del cammin   ";

        // mantiene gli spazi iniziali e finali
        System.out.println(someText);               //    Nel mezzo del cammin

        // non mantiene gli spazi iniziali e finali
        System.out.println(someText.stripIndent()); // Nel mezzo del cammin
    }
}
