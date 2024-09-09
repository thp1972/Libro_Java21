package LibroJava.Capitolo8;

public class Snippet_8_13
{
    private CharSequence name = "Pellegrino"; // campo di istanza

    public void Foo(CharSequence chars)
    {
        // la pattern variable name "nasconde" il campo di istanza name
        if (chars instanceof String name)
        {
            System.out.printf("%s%n", name.length()); // 4
            name += " Principe"; // OK, assegnamento consentito!
            System.out.printf("%s%n", name.length()); // 13
        }
        else
        {
            // ATTENZIONE: qua, name si riferisce al campo di istanza!
            char firstChar = name.charAt(0);
            System.out.println(firstChar); // P
        }
    }

    public static void main(String[] args)
    {
        new Snippet_8_13().Foo("Luca");
    }
}
