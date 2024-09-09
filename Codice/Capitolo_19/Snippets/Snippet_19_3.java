package LibroJava.Capitolo19;

import java.util.concurrent.atomic.AtomicInteger;

public class Snippet_19_3
{
    public static void main(String[] args)
    {
        AtomicInteger i = new AtomicInteger(10);
        int val = i.incrementAndGet();
    }
}
