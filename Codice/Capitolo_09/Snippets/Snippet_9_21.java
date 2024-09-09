package LibroJava.Capitolo9;

// un record generico
// può rappresentare un punto sul piano con coordinate
// di tipi diversi: per esempio con Integer, Double, Float ecc.
// usiamo il parametro di tipo T
record Point<T>(T x, T y) { }

public class Snippet_9_21
{
    public static void main(String[] args)
    {
        // creiamo delle istanze concrete e parametrizzate di un record Point

        // creazione di un punto con coordinate Integer
        Point<Integer> intPoint = new Point<>(10, 20);
        System.out.printf("Point: [%d, %d]%n", intPoint.x(), intPoint.y());
        // Point: [10, 20]

        // creazione di un punto con coordinate Double
        Point<Double> doublePoint = new Point<>(10.5, 20.5);
        System.out.printf("Point: [%.1f, %.1f]%n", doublePoint.x(), doublePoint.y());
        // Point: [10.5, 20.5]

        // creazione di un punto con coordinate Float
        Point<Float> floatPoint = new Point<>(10.0f, 20.0f);
        System.out.printf("Point: [%.1f, %.1f]%n", floatPoint.x(), floatPoint.y());
        // Point: [10.0, 20.0]

        // creazione di un punto con coordinate String
        Point<String> stringPoint = new Point<>("22", "10");

        // possiamo usare instanceof con un record generico
        // in questo caso lo usiamo con un type pattern
        if(stringPoint instanceof Point<String> ps)
        {
            System.out.printf("Point: [%s, %s]%n", ps.x(), ps.y());
            // Point: [22, 10]
        }

        // creazione di un punto con coordinate Character
        Point<Character> aPoint = new Point<>('1', '9');

        // possiamo usare le etichette case con un record generico
        // in questo caso le usiamo con un record pattern
        switch (aPoint)
        {
            // inferenza dei tipi: il compilatore capisce che x e y sono
            // di tipo Character
            case Point (var x, var y) -> System.out.printf("Point: [%s, %s]%n", x, y);
            // Point: [1, 9]
        }
    }
}

