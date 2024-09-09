package LibroJava.Capitolo9;

import java.util.List;

public class Snippet_9_17
{     
    // non è possibile fare l'overloading dei seguenti metodi a causa dell'erasure
    // error: name clash: delete(List<Integer>) and delete(List<String>) have the same erasure
    public void delete(List<Integer> list) {}
    public void delete(List<String> list) {}
    
    public static void main(String[] args) { }
}
