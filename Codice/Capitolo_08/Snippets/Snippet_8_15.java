package LibroJava.Capitolo8;

interface  Shape { void draw(); }
enum Color { RED, GREEN, BLUE }
record Point(int x, int y) { } // un generico punto sul piano
record FilledPoint(Point p, Color c) { } // un punto colorato

// un rettangolo riempito di colore renderizzato in base alle coordinate
// fornite dai punti passati come argomenti
// implementa anche l'interfaccia Shape che lo "disegna" su schermo
record FilledRectangle(FilledPoint topLeft, FilledPoint bottomRight) implements  Shape
{
    public void draw()  { System.out.println("[]"); }
}

public class Snippet_8_15
{
    public static void main(String[] args)
    {
        // costruiamo un rettangolo rosso alle coordinate 10,10 -> 30,30
        Shape s = new FilledRectangle(
                new FilledPoint(new Point(10,10), Color.RED), // top left coord.
                new FilledPoint(new Point(30,30), Color.RED)); // bottom right coord.

        // I decomposizione: usiamo direttamente point1 e point2 di tipo FilledPoint
        if (s instanceof FilledRectangle(FilledPoint point1,
                                         FilledPoint point2))
        {
            // RECT@[10,10]->[30,30] COLOR:[RED]
            System.out.printf("RECT@[%d,%d]->[%d,%d] COLOR:[%s]%n", 
                              point1.p().x(), point1.p().y(),
                              point2.p().x(), point2.p().y(),
                              point1.c());
        }

        // II decomposizione annidata: usiamo direttamente p1 e p2 di tipo Point e
        // c1 tipo Color
        if (s instanceof FilledRectangle(FilledPoint(Point p1, Color c1),
                                         FilledPoint(Point p2, Color c2)))
        {
            // RECT@[10,10]->[30,30] COLOR:[RED]
            System.out.printf("RECT@[%d,%d]->[%d,%d] COLOR:[%s]%n", p1.x(), p1.y(),
                                                                    p2.x(), p2.y(),
                                                                    c1);
        }

        // III decomposizione annidata: usiamo direttamente x1, y1 e x2, y2 di tipo int
        // e c1 di tipo Color
        if (s instanceof FilledRectangle(FilledPoint(Point(int x1, int y1), Color c1),
                                         FilledPoint(Point(int x2, int y2), Color c2)))
        {
            // RECT@[10,10]->[30,30] COLOR:[RED]
            System.out.printf("RECT@[%d,%d]->[%d,%d] COLOR:[%s]%n", x1, y1, x2, y2, c1);
        }
   }
}
