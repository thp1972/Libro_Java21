package LibroJava.Capitolo13;

public class ModuleAConcreteExample
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!!!");
        System.out.printf("By: %s%n",
                          ModuleAConcreteExample.class.getModule().getName());

    }
}

