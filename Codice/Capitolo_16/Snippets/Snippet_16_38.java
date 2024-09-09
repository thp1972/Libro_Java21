package LibroJava.Capitolo16;

public class Snippet_16_38
{
    public static void main(String[] args)
    {
        StringBuilder sb_1 = new StringBuilder("Sono una stringa di tipo builder!");
        int l = sb_1.capacity(); // 49 
        sb_1.ensureCapacity(55); // più grande di capacity 
        l = sb_1.capacity(); // 100, ovvero (49 * 2 + 2) che è maggiore di 55
    }
}
