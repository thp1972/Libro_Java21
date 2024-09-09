package LibroJava.Capitolo6;

class AClass // classe base 
{
    public void printMe() { }
}

class AClass_child_1 extends AClass // classe derivata da AClass 
{
    public void printMe() { System.out.println("child 1"); }
}

class AClass_child_2 extends AClass // classe derivata da AClass 
{
    public void printMe() { System.out.println("child 2"); }
}

public class UnmodifiableArgument
{
    // quando viene invocato aMethod il parametro a_class conterrà il valore
    // dell'argomento an_object ossia un riferimento verso un oggetto 
    // di tipo AClass_child_1
    public static void aMethod(AClass a_class)
    {
        // cambiamo il riferimento del parametro che riferirà, ora,
        // un oggetto di tipo AClass_child_2
        // quest'assegnamento non cambierà, però, il riferimento dell'argomento
        a_class = new AClass_child_2();
    }

    public static void main(String[] args)
    {
        // an_object punta a un oggetto di tipo AClass_child_1
        AClass an_object = new AClass_child_1();

        aMethod(an_object); // an_object ha un riferimento che punta a un oggetto
                            // di tipo AClass_child_1

        an_object.printMe(); // qui an_object punterà sempre a un oggetto
                             // di tipo AClass_child_1
    }
}
