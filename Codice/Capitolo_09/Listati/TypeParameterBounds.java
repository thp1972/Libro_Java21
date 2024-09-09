package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Base
{
    public void m_base()
    {
        System.out.println(getClass());
    }
}

class Derived extends Base
{
    public void m_derived()
    {
        System.out.println(getClass());
    }
}

interface ISortable<T>
{
    void sort(T[] t);
}

class MyInt implements ISortable<Integer>
{
    public void sort(Integer[] t)
    {
        Arrays.sort(t);
    }
}

class MyClass_1<T extends Base> // extends class_type
{
    public void foo(T t)
    {
        t.m_base(); // OK - lecito invocare m_base
    }
}

class MyClass_2<T extends ISortable<Integer>> // extends interface_type
{
    public void foo(T t, Integer[] array)
    {
        t.sort(array); // OK - lecito invocare sort su t di tipo T perché 
                       // il compilatore potrà presumere che implementerà l'interfaccia 
                       // ISortable<Integer> che fornisce, per l'appunto, quel metodo
        for (int el : array)
            System.out.print(el + " ");
 
        System.out.println();
    }
}

class MyClass_3<T>
{
    public <U extends T> void foo(U t) // extends type_variable
    {
        // OK - rafforziamo la volontà di volere una relazione di ereditarietà
        // tra il tipo T e il tipo U ossia stiamo dicendo che alla lista solo
        // i tipi T o che derivano da esso possono essere lì inseriti
        List<U> list = new ArrayList<>();
        list.add(t);
        System.out.println(list.get(0).getClass());
    }
}

public class TypeParameterBounds
{
    public static void main(String[] args) throws Exception
    {
        // OK - l'argomento di tipo soddisfa il vincolo imposto su T
        MyClass_1<Base> m1 = new MyClass_1<>();
        m1.foo(new Base());

        // OK - l'argomento di tipo soddisfa il vincolo imposto su T
        MyClass_1<Derived> m2 = new MyClass_1<>();
        m1.foo(new Derived());

        // OK - l'argomento di tipo soddisfa il vincolo imposto su T
        MyClass_2<MyInt> m3 = new MyClass_2<>();
        m3.foo(new MyInt(), new Integer[] { 44, 2, 55, 0, -44 });

        MyClass_3<Base> m4 = new MyClass_3<>();
        // OK - l'argomento di tipo soddisfa il vincolo imposto su U
        m4.foo(new Derived());
    }        
}
