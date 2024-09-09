package LibroJava.Capitolo14;

public @interface WorkToDo // un tipo annotazione del tipo normal annotation type
{
    String developer();
    String msg();
    String start_date();
    int uid() default 0; // un valore di default per uid
}
