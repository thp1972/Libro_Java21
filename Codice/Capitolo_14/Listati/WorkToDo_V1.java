package LibroJava.Capitolo14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkToDo_Revision1 // un tipo annotazione del tipo normal annotation type
{
    String developer();
    String msg();
    String start_date();
    int uid() default 0; // un valore di default per uid
}
