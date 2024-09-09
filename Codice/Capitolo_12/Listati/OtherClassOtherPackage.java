package otherPackage;

import myPackage.MyClass;

public class OtherClassOtherPackage
{
    MyClass my_class = new MyClass();

    // error: name_private has private access in MyClass
    public int ex_name_private = my_class.name_private; // ERRORE - non visibile 
    
    // error: name_packaged is not public in MyClass; cannot be accessed from outside package
    public int ex_name_packaged = my_class.name_packaged; // ERRORE - non visibile 
    
    // error: name_protected has protected access in MyClass
    public int ex_name_protected = my_class.name_protected; // ERRORE non visibile      
    
    public int ex_name_public = my_class.name_public; // OK - visibile 
}
