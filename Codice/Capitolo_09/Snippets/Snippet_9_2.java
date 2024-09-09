package LibroJava.Capitolo9;

import java.io.Serializable;

// una classe non generica
class T { }

// una classe generica
class C<T> // T è un type parameter
{
    private T c; // T è una type variable
}

// una classe generica
class J<T extends Number> { } // T è un type parameter
                              // Number è un bound type

// una classe generica
class M<T extends Number & Serializable> {} // T è un type parameter
                                            // T è un intersection type 
                                            // Number è un bound type
                                            // Serializable è un bound type
public class Snippet_9_2
{
    public static void main(String[] args)
    {
        C<Integer> c = new C<>(); // C<Integer> è un parametrized type
                                  // Integer è un type argument

        int i = 100; // int è un reifiable type
        T t = new T(); // T è un reifiable type
        
        J j = new J(); // J è un raw type
    }
}
