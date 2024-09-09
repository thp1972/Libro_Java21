package LibroJava.Capitolo14;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited // applichiamo @Inherited al tipo annotazione Developer 
@Retention(RetentionPolicy.RUNTIME)
@interface Developer // un tipo annotazione del tipo single-element annotation type
{
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface SubjectToChange { } // un tipo annotazione del tipo marker annotation type

@Developer("Principe")
@SubjectToChange
class Employee {}

// Laborer eredita @Developer ma non @SubjectToChange
class Laborer extends Employee {}

public class AnnInherited
{
    public static void main(String[] args)
    {
        System.out.println
        (new Laborer().getClass().getAnnotation(Developer.class));
        System.out.println
        (new Laborer().getClass().getAnnotation(SubjectToChange.class));
    }
}
