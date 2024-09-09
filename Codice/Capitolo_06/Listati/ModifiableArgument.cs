using System;

namespace LibroCSharp.Capitolo6
{
    class AClass // classe base 
    {
        public virtual void printMe() { }
    }

    class AClass_child_1 : AClass // classe derivata da AClass 
    {
        public override void printMe() { Console.WriteLine("child 1"); }
    }

    class AClass_child_2 : AClass // classe derivata da AClass 
    {
        public override void printMe() { Console.WriteLine("child 2"); }
    }

    class ModifiableArgument
    {
        // notare l'utilizzo del modificatore ref
        // quando verrà invocato aMethod il parametro a_class conterrà il valore
        // dell'argomento an_object ossia un riferimento verso un oggetto di
        // tipo AClass_child_1
        static void aMethod(ref AClass a_class)
        {
            // cambiamo il riferimento del parametro che riferirà, ora,
            // un oggetto di tipo AClass_child_2 
            // quest'assegnamento cambierà, però, anche il riferimento dell'argomento 
            a_class = new AClass_child_2();
        }

        static void Main(string[] args)
        {
            // an_object punta a un oggetto di tipo AClass_child_1
            AClass an_object = new AClass_child_1();

            // notare l'utilizzo del modificatore ref
            aMethod(ref an_object); // an_object ha un riferimento che punta a un oggetto 
                                    // di tipo AClass_child_1 

            an_object.printMe(); // qui an_object punterà ora a un oggetto
                                 // di tipo AClass_child_2 
        }
    }
}
