package LibroJava.Capitolo8;

// ATTENZIONE - abbiamo deciso di ignorare la eventuale segnalazione del compilatore
// di mancanza di overriding del metodo hashCode
class CPoint
{
    int x;
    int y;

    public CPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // override di Object.equals
    // così abilitiamo per le istanze di CPoint una value equality
    // rispetto a una reference equality abilitata di default dalla
    // implementazione di Object.equals
    public boolean equals(Object obj)
    {
        // il metodo getClass, dichiarato nella classe java.lang.Object, ritorna
        // il tipo di classe dell'istanza sui cui è invocato
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        // due oggetti di tipo CPoint sono uguali per equality solo se sono
        // entrambi di tipo CPoint e le rispettive variabili x e y hanno lo stesso
        // valore (hanno dunque lo stesso stato)
        CPoint p = (CPoint) obj;
        return this.x == p.x && this.y == p.y;
    }
}

public class Snippet_8_5
{
    public static void main(String[] args)
    {
        // eguaglianza con i tipi primitivi
        int a = 10, b = 10;
        System.out.println(a == b); // true

        // eguaglianza con i tipi riferimento
        CPoint cpoint1 = new CPoint(100, 100);
        CPoint cpoint2 = new CPoint(100, 100);
        CPoint cpoint3 = cpoint2;
        System.out.println(cpoint1 == cpoint2); // false
        System.out.println(cpoint2 == cpoint3); // true
        System.out.println(cpoint1.equals(cpoint2)); // true
    }
}
