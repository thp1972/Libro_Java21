package LibroJava.Capitolo7;

import java.util.Objects;

class Point
{
    // campi di istanza
    private final int x;
    private final int y;
    private final int z;

    // costruttore di istanza
    Point(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // metodi accessori "get"
    int x() { return x; }
    int y() { return y; }
    int z() { return z; }

    // verifica di eguaglianza di un oggetto Point
    // override da equals di Object
    public boolean equals(Object o)
    {
        if (!(o instanceof Point)) return false;
        Point other = (Point) o;
        return other.x == x && other.y == y && other.z == z;
    }

    // genera un hash code per la corrente istanza
    // override da hashCode di Object
    public int hashCode()
    {
        // genera un hash code in base alla sequenza di valori passati come
        // argomenti del metodo 
        return Objects.hash(x, y, z);
    }

    // formattazione leggibile di Point
    // override da toString di Object
    public String toString()
    {
        // usa il metodo format della classe String che consente, in breve,
        // di utilizzare una stringa di formato come quella usata
        // con il metodo printf
        return String.format("Point[x=%d, y=%d, z=%d]", x, y, z);
    }
}

public class DataContainerWithClass
{
    public static void main(String[] args)
    {
        var p = new Point(5, 5, 5);

        // usiamo esplicitamente i metodi accessori "get"
        System.out.printf("Point[x=%d, y=%d, z=%d]%n", p.x(), p.y(), p.z());

        // test equals
        var p2 = new Point(6, 6, 6);
        System.out.printf("p è uguale a p2? [%b]%n", p.equals(p2));

        // test hashCode
        System.out.printf("hash code di p [%d] %n", p.hashCode());

        // test toString
        System.out.println(p);
    }
}
