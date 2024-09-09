package LibroJava.Capitolo14;

@interface WorkToDo // un tipo annotazione del tipo normal annotation type
{
    String developer();
    String msg();  
    String start_date(); 
    int uid() default 0; // un valore di default per uid
}

@interface SubjectToChange { } // un tipo annotazione del tipo marker annotation type

@interface Developer // un tipo annotazione del tipo single-element annotation type
{
    String value(); // per convenzione, value è l'identificatore usato per l'unico 
                    // elemento di questo tipo di annotazione
}

public class Snippet_14_2
{
    public static void main(String[] args) { }
}
