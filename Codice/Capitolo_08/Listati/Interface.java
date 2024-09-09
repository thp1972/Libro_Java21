package LibroJava.Capitolo8;

public class Interface
{
    public static void main(String[] args)
    {
        // ATTENZIONE - non è mai possibile creare un'interfaccia mediante l'operatore
        // new; è solo possibile dichiarare una variabile del tipo di un'interfaccia
        TwoDShape tds;

        Rectangle_Revision1 r = new Rectangle_Revision1(new Point2D(10, 10), 5, 4);
        Square_Revision1 s = new Square_Revision1(new Point2D(35, 40), 9);

        // TwoDShape ora è un tipo Rectangle_Revision1
        tds = r; // Rectangle_Revision1 supporta, è "compatibile" con TwoDShape
        tds.draw();

        // TwoDShape ora è un tipo Square_Revision1
        tds = s; // Square_Revision1 supporta, è "compatibile" con TwoDShape
        tds.draw();
    }
}
