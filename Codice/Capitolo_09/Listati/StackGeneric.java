package LibroJava.Capitolo9;

public class StackGeneric<E>
{
    private final int size;
    private static final int MAX = 5; // dimensione di default dello stack
    private int top;
    private E[] elems;

    public StackGeneric() { this(5); }

    public StackGeneric(int nr)
    {
        size = nr == 0 ? MAX : nr;
        top = -1; // stack inizialmente vuoto 
        elems = (E[]) new Object[size];
    }

    public void push(E value) throws Exception // mette un valore nello stack
    {
        if (top == size - 1)
            throw new Exception("Lo stack è pieno!");
        else
            elems[++top] = value;
    }

    public E pop() throws Exception // estrae un valore dallo stack
    {
        if (top == -1)
            throw new Exception("Lo stack è vuoto!");
        else
            return elems[top--];
    }
}
