package LibroJava.Capitolo7;

record Point(int x, int y, int z)
{
    // campi statici
    public final static Point left = new Point(-1, 0, 0);
    public final static Point top = new Point(0, 1, 0);
    public final static Point forward = new Point(0, 0, 1);

    // override esplicito di toString
    public String toString()
    {
        return String.format("(%d,%d,%d)", x, y, z);
    }
	
    // metodo di istanza
    public float distance(Point other)
    {
        // usiamo la libreria matematica predefinita di Java
        // classe Math, package java.lang, modulo java.base
        return (float) Math.sqrt(
                Math.pow(x - other.x, 2) +
                Math.pow(y - other.y, 2) +
                Math.pow(z - other.z, 2)
        );
    }
}

public class DataContainerWithRecordAndMembers
{
    public static void main(String[] args)
    {
        var leftPoint = Point.left;
        System.out.printf("Coordinate di leftPoint: %s%n", leftPoint);

        var p1 = new Point(3, 4, -2);
        var p2 = new Point(1, 0, 7);

        System.out.printf("La distanza tra %s e %s è di: %.2f%n", p1, p2, p1.distance(p2));
    }
}
