package LibroJava.Capitolo8;

public class Square extends Rectangle
{
    public Square() { width = 1; }

    public Square(Point2D upperleftCoords, int side)
    {
        super(upperleftCoords, side, side);
    }

    public int getSide() { return width; }

    public String toString()
    {
        return "QUADRATO { " + upperleftCoords + " --> Lato: " + width + " }";
    }
}
