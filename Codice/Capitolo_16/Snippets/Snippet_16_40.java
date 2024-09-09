package LibroJava.Capitolo16;

public class Snippet_16_40
{
    public static void main(String[] args)
    {
        StringBuilder sb_1 = new StringBuilder("Sono una stringa di tipo builder!");
        int l = sb_1.lastIndexOf("s");
        sb_1.setCharAt(l, 'S'); // Sono una Stringa di tipo builder!
    }
}
