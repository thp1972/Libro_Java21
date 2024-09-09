package LibroJava.Capitolo16;

public class Snippet_16_41
{
    public static void main(String[] args)
    {
        StringBuilder sb_1 = new StringBuilder("Sono una stringa di tipo builder!");
        int offset = sb_1.indexOf("u");
        sb_1.deleteCharAt(offset); // Sono na stringa di tipo builder!
    }
}
