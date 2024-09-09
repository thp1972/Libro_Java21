package LibroJava.Capitolo8;

public class Polymorphism
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(new Point2D(10, 10), 5, 3); // un oggetto Rectangle
        Square s = new Square(new Point2D(50, 50), 3); // un oggetto Square

        Rectangle r2; // un riferimento di tipo Rectangle
        Square s2; // un riferimento di tipo Square

        String output = "Un tipo Rectangle:\n" + r + " "
                        + "\n\nUn tipo Square:\n" + s + "\n";

        r2 = s; // assegno un riferimento di tipo Square a un riferimento di tipo Rectangle

        output += "\nUn oggetto di tipo Square tramite un riferimento di un tipo "
                  + "Rectangle:\n" + r2;

        System.out.println(output);
        
         output = "\nVerifichiamo il binding dinamico:\n";

        if (r2 instanceof Square) // r2, a runtime, "è" di tipo Square?
        {
            output += "r2 è a runtime un oggetto di tipo Square, "
                      + "riassegniamolo a un riferimento di tipo Square";

            s2 = (Square) r2; // downcast necessario!
        }
        else
            output += "r2 non è un oggetto di tipo Square!";

        System.out.println(output);
    }
}
