package LibroJava.Capitolo14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@interface Manager { String value(); }

@Retention(RetentionPolicy.CLASS)
@interface Developer { String value(); }

@Retention(RetentionPolicy.RUNTIME)
@interface Serializable {boolean value(); }

@Serializable(false)
public class AnnRetention
{
    @Manager("Luca Bò")
    @Developer("Mario Rossi")
    public static void execute() {}
    
    public static void main(String[] args)
    {
        System.out.printf("La classe AnnRetention è serializzabile? %b%n",  
                          AnnRetention.class.getAnnotation(Serializable.class).value());
    }
}
