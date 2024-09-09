package myPackage;

public class OtherClass
{
    MyClass my_class = new MyClass();

    // error: name_private has private access in MyClass
    public int ex_name_private = my_class.name_private; // ERRORE - non visibile 
    
    public int ex_name_packaged = my_class.name_packaged; // OK - visibile 
    public int ex_name_protected = my_class.name_protected; // OK - visibile 
    public int ex_name_public = my_class.name_public; // OK - visibile     
}
