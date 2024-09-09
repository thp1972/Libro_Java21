package LibroJava.Capitolo14;

@interface WorkToDo // un tipo annotazione del tipo normal annotation type
{
    String developer();
    String msg();
    String start_date();
    int uid() default 0; // un valore di default per uid
}

public class Snippet_14_3
{
    // utilizzo di un'annotazione normale
    // ogni elemento ha un valore associato dello stesso tipo del tipo
    // restituito dal corrispettivo metodo
    // l'elemento uid non è indicato perché ha la clausola default
    @WorkToDo(developer = "Pellegrino Principe",
              msg = "Inizio calcolo somme",
              start_date = "05/01/2017")
    public static void calculator()
    {
        System.out.println("Calcolato...");
    }

    public static void main(String[] args)
    {
        calculator();
    }
}
