package LibroJava.Capitolo9;

abstract class Dog
{
    protected String name;  
    protected int age;
    public int getAge() { return age; }
    public String getName() { return name; }
}

class WhiteTerrier extends Dog
{
    public WhiteTerrier(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class GoldenRetriever extends Dog
{
    public GoldenRetriever(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class Snippet_9_9
{
    public static void main(String[] args)
    {
        // OK - array covariance
        // un array di Dog può contenere un riferimento verso un array di
        // WhiteTerrier perché un WhiteTerrier "è un" Dog
        Dog[] dogs = new WhiteTerrier[2];
        
        dogs[0] = new WhiteTerrier("Winter", 1); // OK a compile time e a runtime
        
        // possiamo assegnare a compile time un tipo GoldenRetriever come elemento di un
        // array di tipo Dog perché un GoldenRetriever "è un" Dog ma a runtime questo
        // genererà un'eccezione, perché, di fatto, dogs contiene un riferimento
        // verso un array di tipo WhiteTerrier e il sistema ci dice che stiamo
        // tentando di assegnare in modo illecito all'elemento 1 dell'array di tipo
        // WhiteTerrier un elemento di tipo GoldenRetriever (in pratica stiamo provando
        // a mettere in un "cesto di mele anche delle pere...")
        
        dogs[1] = new GoldenRetriever("Sandy", 11); // OK a compile time ma NON a runtime
                                                    // Eccezione di tipo:
                                                    // java.lang.ArrayStoreException
    }
}
