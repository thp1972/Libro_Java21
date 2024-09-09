package LibroJava.Capitolo7;

// dichiarazione di un record
record Point(int x, int y, int z) { }

public class DataContainerWithRecord
{
    public static void main(String[] args)
    {
        var p = new Point(5, 5, 5);

        // usiamo esplicitamente i metodi accessori get
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