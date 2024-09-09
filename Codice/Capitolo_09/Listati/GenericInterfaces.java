package LibroJava.Capitolo9;

import java.util.Arrays;

interface ISortable<T> // un'interfaccia generica
{
    void sort(T[] t);
}

// specifichiamo l'argomento di tipo per l'interfaccia
class MyInt implements ISortable<Integer>
{
    // può ordinare solo array di int!
    public void sort(Integer[] t)
    {
        Arrays.sort(t);
    }
}

// lasciamo T non specificato anche per l'interfaccia
class MyData<T> implements ISortable<T>
{
    public void sort(T[] t)
    {
        // può ordinare array di qualsiasi tipo a condizione però
        // che implementino l'interfaccia Comparable<T>
        Arrays.sort(t);
    }
}

public class GenericInterfaces
{
    public static void main(String[] args) throws Exception
    {
        Integer[] data = { 5, 100, 55, 6, -11, 3 };
        MyInt mi = new MyInt();
        mi.sort(data);
        
        for (int i : data)
            System.out.printf("%d ", i);
  
        System.out.println();

        Character[] cdata = { 't', 'u', 'q', 'b' };
        MyData<Character> md = new MyData<>();
        md.sort(cdata);

        for (char c : cdata)
            System.out.printf("%c ", c);
    
        System.out.println();     
    }
}
