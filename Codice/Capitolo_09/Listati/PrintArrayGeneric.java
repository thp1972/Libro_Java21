package LibroJava.Capitolo9;

public class PrintArrayGeneric
{
    public <E> void printArray(E el[])
    {
        for (E e : el) // stampa in modo generico gli elementi dell'array di tipo differente
            System.out.printf("%s ", e);
    }
}
