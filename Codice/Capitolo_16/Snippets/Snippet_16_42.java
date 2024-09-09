package LibroJava.Capitolo16;

public class Snippet_16_42
{
    public static void main(String[] args)
    {
        StringBuilder sb_1 = new StringBuilder("Sono una stringa di tipo builder!");

        sb_1.replace(sb_1.indexOf("una"), 
                     sb_1.lastIndexOf("!"), "StringBuilder"); // Sono StringBuilder! 
    }
}
