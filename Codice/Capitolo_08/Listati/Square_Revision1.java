package LibroJava.Capitolo8;

public class Square_Revision1 extends Rectangle_Revision1
{
    public Square_Revision1() { width = 1; }

    public Square_Revision1(Point2D upperleftCoords, int side)
    {
        super(upperleftCoords, side, side);
    }

    public int getSide() { return width; }    
    public void draw() { System.out.println("DISEGNO DEL QUADRATO"); }

    public String toString()
    {
        return "QUADRATO { " + upperleftCoords + " --> Lato: " + width + " }";
    }
}
