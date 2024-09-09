package LibroJava.Capitolo14;

@interface Developer // un tipo annotazione del tipo single-element annotation type
{
    String value(); // per convenzione, value è l'identificatore usato per l'unico 
                    // elemento di questo tipo di annotazione
}

// anche se quest'annotazione è a "singolo elemento" essa non è
// categorizzabile come single-element annotation type perché il
// nome del metodo non è value
@interface Copyright // un tipo annotazione del tipo normal annotation type
{
    int year();
}

// utilizzo di un'annotazione a singolo elemento
@Copyright(2017) // ERRORE - non è possibile omettere year
                 // error: cannot find symbol @Copyright(2017)
                 // symbol: method value() location: @interface Copyright
public class Snippet_14_4
{
    // utilizzo di un'annotazione a singolo elemento
    @Developer("Principe") // OK - è possibile omettere value
    public static void calculator()
    {
        System.out.println("Calcolato...");
    }
 
    public static void main(String[] args)
    {
        calculator();
    }
}
