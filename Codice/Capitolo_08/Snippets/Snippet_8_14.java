package LibroJava.Capitolo8;

record Point(int x, int y) { }

public class Snippet_8_14
{
    public static void main(String[] args)
    {
        Object obj = new Point(10, 10);

        // usiamo un type pattern con un tipo record
        // siamo costretti ad usare i metodi accessori x() e y() per
        // ottenere le relative coordinate
        if (obj instanceof Point p1)
        {
            int x = p1.x();
            int y = p1.y();
            System.out.printf("p1@[%d, %d]%n", x, y); // p1@[10, 10]
        }

        // usiamo un record pattern con un tipo record
        // possiamo usare direttamente x e y per ottenere le relative coordinate
        // di seguito i passaggi della DECOMPOSIZIONE:
        // 1) se obj è un'istanza di tipo Point applica il record pattern 
        // Point (int x, int y)
        // 2) chiama su obj i metodi accessori x() e y() per ottenere i valori 
        // dei componenti x e y
        // 3) assegna i valori ottenuti alle pattern variables x e y
        // 4) usa direttamente all'interno del ramo if le variabili x e y
        // la DECOMPOSIZIONE comporta l'estrazione delle variabili dai componenti 
        // del record originale (obj) e come effetto conseguente l'uso diretto di queste
        // variabili nel blocco di codice
        // questo rende il codice più chiaro, conciso e leggibile, permettendo di 
        // lavorare con i dati interni (lo stato) dei record in modo efficace e intuitivo
        if (obj instanceof Point(int x, int y))
        {
            System.out.printf("p1@[%d, %d]%n", x, y); // p1@[10, 10]
        }
    }
}