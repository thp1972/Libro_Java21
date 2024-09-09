package LibroJava.Capitolo16;

public class Snippet_16_37
{
    public static void main(String[] args)
    {
        String name = "Principe";
        String query = """
                       SELECT *
                       from [dbo].[TabBrowser]
                       where [Utente] = %s
                       """;
        
        System.out.println(query.formatted(name));// SELECT *
                                                  // from [dbo].[TabBrowser]
                                                  // where [Utente] = Principe
    }
}
