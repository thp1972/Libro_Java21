package myPackage;

public class ExtendMyClass extends MyClass
{
    // error: name_private has private access in MyClass
    public int ex_name_private = name_private; // ERRORE - non visibile  
    
    public int ex_name_packaged = name_packaged; // OK - visibile 
    public int ex_name_protected = name_protected; // OK - visibile 
    public int ex_name_public = name_public; // OK - visibile 
}
