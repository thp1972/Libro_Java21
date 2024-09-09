package LibroJava.Capitolo6;

public class Echo
{
    public static void main(String[] args)
    {
        // l'array args non conterrà mai il valore null e infatti se
        // non saranno passati argomenti dalla riga di comando la sua
        // proprietà length conterrà semplicemente il valore 0
        // in pratica args sarà un array vuoto - "zero-element array"
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
