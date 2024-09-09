package LibroJava.Capitolo7;

enum CardinalPoints // enumerazione
{
    NORTH,
    NORTH_EAST,
    EAST,
    SOUTH_EAST,
    SOUTH,
    SOUTH_WEST,
    WEST,
    NORTH_WEST
}

public class SimpleEnumeration
{
    public static void main(String[] args)
    {
        // cp è una variabile di tipo CardinalPoints che contiene
        // come valore iniziale CardinalPoints.NORTH
        CardinalPoints cp = CardinalPoints.NORTH;

        // non è mai possibile in Java convertire un'enumerazione in un tipo int
        // un'enumerazione non è infatti, come in C, un tipo di dato intero 
        // rappresentato da una serie di identificatori simbolici costanti di tipo int 
        // che contengono valori interi come 0, 1 e così via
        // error: incompatible types: CardinalPoints cannot be converted to int
        int value = (int) cp;

        // si noti la leggibilità del codice
        // in assenza di un enum avremmo dovuto utilizzare qualcosa come:
        // case 0: case 1: e così via, che di sicuro, sono "magic number" poco chiari!
        switch (cp) // lecito utilizzare un enum in un costrutto switch
        {
            case NORTH -> System.out.println("NORTH");
            case NORTH_EAST -> System.out.println("NORTH_EAST");
            case EAST -> System.out.println("EAST");
            case SOUTH_EAST -> System.out.println("SOUTH_EAST");
            case SOUTH -> System.out.println("SOUTH");
            case SOUTH_WEST -> System.out.println("SOUTH_WEST");
            case WEST -> System.out.println("WEST");
            case NORTH_WEST -> System.out.println("NORTH_WEST");
        }
    }
}
