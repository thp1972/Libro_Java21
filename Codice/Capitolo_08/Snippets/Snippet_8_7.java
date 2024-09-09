package LibroJava.Capitolo8;

interface IDrawable
{
    void draw();
}

interface IPrintable
{
    void print();
}

interface IClonable
{
    Object clone();
}

interface IComparable
{
    void compare();
}

// si decide di fornire più "comportamenti" per un'eventuale forma geometrica
// che dovesse implementare quest'interfaccia
interface IAdvancedShape extends IDrawable, IPrintable, IClonable, IComparable { }

// si decide di far supportare in modo specialistico a un oggetto Circle
// i comportamenti forniti dall'interfaccia implementata
class Circle implements IAdvancedShape
{
    public void draw() // sa disegnarsi...
    {
        System.out.println("Drawing...");
    }

    public void print() // sa stamparsi...
    {
        System.out.println("Printing...");
    }

    public Object clone() // sa clonarsi...
    {
        System.out.println("Cloning...");
        return new Object();
    }

    public void compare() // sa compararsi...
    {
        System.out.println("Comparing...");
    }
}

public class Snippet_8_6
{
    public static void main(String[] args)
    {
        // un Circle "è un" IAdvancedShape
        IAdvancedShape s = new Circle();

        s.draw(); // Drawing... 
        s.print(); // Printing...
        s.clone(); // Cloning...
        s.compare(); // Comparing...
    }
}
