package myPackage;

public class MyClass
{
    private int name_private;
    int name_packaged;
    protected int name_protected;
    public int name_public;

    public int ex_name_private = name_private; // OK - visibile 
    public int ex_name_packaged = name_packaged; // OK - visibile 
    public int ex_name_protected = name_protected; // OK - visibile 
    public int ex_name_public = name_public; // OK - visibile 
}
