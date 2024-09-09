package LibroJava.Capitolo10;

import java.util.ArrayList;
import java.util.List;

class M
{
    public int a = 10;
}

public class Snippet_10_13
{
    public static void main(String[] args)
    {
        // deep copy 
        List<M> m1 = new ArrayList<>();
        m1.add(new M());
        List<M> m2 = new ArrayList<>(m1.size());

        for (M element : m1)
        {
            M copy = new M();
            copy.a = element.a;
            m2.add(copy);
        }        

       // qui la modifica del campo a dell'elemento 0 di m2 
       // NON si ripercuote sul campo a dell'elemento 0 di m1
        m2.get(0).a = 22;
        System.out.printf("%d %d%n", m1.get(0).a, m2.get(0).a); // 10 22
    }
}
