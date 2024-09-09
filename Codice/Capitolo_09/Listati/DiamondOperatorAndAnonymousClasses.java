package LibroJava.Capitolo9;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DiamondOperatorAndAnonymousClasses
{
    public static <T> Iterable<T> getIterable(T... elems)
    {
        // una classe anonima che implementa un Iterable<T>
        return new Iterable<>() // Ok - il tipo inferito è denotable
        {
            public Iterator<T> iterator()
            {
                // una classe anonima che implementa un Iterator<T>
                return new Iterator<>() // Ok - il tipo inferito è denotable
                {
                    int i = 0;
                    public boolean hasNext() { return i < elems.length; }
                    public T next()
                    {
                        if (!hasNext()) throw new NoSuchElementException();
                        return elems[i++];
                    }
                };
            }
        };
    }
        
    public static void main(String[] args) throws Exception
    {
        String[] path = { "UP", "DOWN", "LEFT", "RIGHT" };

        Iterable<String> ipaths = getIterable(path);

        for (String apath : ipaths)
            System.out.println(apath);
    }        
}
