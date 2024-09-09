package LibroJava.Capitolo14;

class Base
{
    public void M1() { }
}

class Derived extends Base
{
    @Override
    public void M1() { } // OK - il metodo M1 è presente in Base 
}

class Derived2 extends Base
{
    @Override
    public void M2() { } // ERRORE - il metodo M non è presente in Base
                         // error: method does not override or implement 
                         // a method from a supertype
}

public class AnnOverride
{
    public static void main(String[] args) { }
}
