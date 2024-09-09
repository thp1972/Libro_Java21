package LibroJava.Capitolo17;

public class Snippet_17_2
{
    public static void main(String[] args)
    {
        String ip = "10.150.36.25";
        String regex = "\\.";
        String rep = ip.replaceAll(regex, "#"); // 10#150#36#25
    }
}
