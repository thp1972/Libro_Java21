package LibroJava.Capitolo19;

public class Snippet_19_1
{
    // un metodo di istanza synchronized ha lo stesso effetto della seguente
    // dichiarazione che fa uso della statement synchronized
    // 
    // public void computation_1()
    // {
    //    synchronized(this) { /* statements */ }
    // }
    public synchronized void computation_1() { /* statements */ }
    
    // un metodo di classe synchronized ha lo stesso effetto della seguente
    // dichiarazione che fa uso della statement synchronized
    // 
    // public static void computation_2()
    // {
    //     try
    //     {
    //         synchronized (Class.forName("Snippet_19_1")) { /* statements */ }
    //     }
    //     catch (ClassNotFoundException e) { }
    // }
    public static synchronized void computation_2() { /* statements */ }
    
    public static void main(String[] args) { }
}
