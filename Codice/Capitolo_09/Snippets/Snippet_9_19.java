package LibroJava.Capitolo9;

// delle interfacce generiche
interface IPrintable<T>
{
    void print();
}

interface IDrawable<T>
{
    void draw();
}

class MyOp<T> implements IPrintable<T>, IDrawable<T>
{
    public void print()
    {
        System.out.println("Printing...");
    }

    public void draw()
    {
        System.out.println("Drawing...");
    }
}

public class Snippet_9_19
{
    // OK - è possibile dichiarare un intersection type nella lista dei parametri di tipo
    // T ha 2 tipi vincolati: IPrintable<Integer> e IDrawable<Integer>
    // T è quindi limitato all'intersezione di quei due tipi e si spuò ritornare solo un'istanza
    // che è di quel tipo intersezione
    public static <T extends IPrintable<Integer> & IDrawable<Integer>> T createMutliOP()
    {
        // OK - MyOp ha implementato entrambe le interfacce...
        return (T)new MyOp<Integer>();        
    }

    public static void main(String[] args)
    {
        // ERRORE - non è possibile dichiarare my_op con un tipo intersezione manifesto
        IPrintable<Integer> & IDrawable<Integer> my_op = createMutliOP(); // error: not a statement
                                                                          // ';' expected
        
        // OK - è possible dichiarare other_op tramite var perché il compilatore
        // ne inferirà in autonomia il tipo intersezione
        var other_op = createMutliOP();
        other_op.print(); // Printing...
        other_op.draw(); // Drawing...
    }
}
