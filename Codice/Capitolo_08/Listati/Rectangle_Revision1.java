package LibroJava.Capitolo8;

public class Rectangle_Revision1 implements TwoDShape
{
    protected int width;
    protected int height;
    protected Point2D upperleftCoords;

    // costruttori
    public Rectangle_Revision1() // di default
    {
        width = height = 1; // rettangolo con larghezza e altezza di un'unità
        upperleftCoords = new Point2D(0, 0); // posizione di default [0, 0]
    }

    public Rectangle_Revision1(Point2D upperleftCoords, int width, int height)
    {
        this.width = width;
        this.height = height;
        this.upperleftCoords = upperleftCoords;
    }
    
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Point2D getCoords() { return upperleftCoords; }
    public int area() { return width * height; }
    public int perimeter() { return 2 * width + 2 * height; }
    public void draw() { System.out.println("DISEGNO DEL RETTANGOLO"); }; 
    
    public String toString()
    {
        return "RETTANGOLO { " + upperleftCoords + " --> Larghezza: " + width + ", "
        + "Altezza: " + height + " } ";
    }
}
