package LibroJava.Capitolo8;

public class Inheritance
{
    public static void main(String[] args)
    {
        Square a_square = new Square(new Point2D(22, 10), 10);

        System.out.printf("Coordinate = %s, Area = %d, Perimetro = %d%n",
                          a_square.getCoords(),
                          a_square.area(),
                          a_square.perimeter());
    }
}
