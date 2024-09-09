package LibroJava.Capitolo8;

// interfaccia sigillata solo l'enumerazione Month può
// legittimamente implementarla
sealed interface IDateTime permits Months
{
    int monthID();
}

// enum, in questo caso è implicitamente final e deriva implicitamente da Enum<E>
// il modificatore final non deve essere scritto altrimenti
// verrà generato un errore di compilazione
enum Months implements IDateTime
{
    JANUARY, FEBRUARY, MARCH,
    APRIL, MAY, JUNE, JULY,
    AUGUST, SEPTEMBER, OCTOBER,
    NOVEMBER, DECEMBER;

    // ricordiamo che il metodo ordinal è ereditato da Enum<E>
    // e restituisce la posizione ordinale della corrente costante
    // di enumerazione così come è stata dichiarata nella relativa
    // enumerazione (la prima costante di enumerazione dichiarata ha
    // un valore ordinale di 0)
    // con questo metodo vogliamo invece che i mesi vadano da 1 a 12
    public int monthID()
    {
        return ordinal() + 1;
    }
}

// interfaccia sigillata solo l'enumerazione NetState può
// legittimamente implementarla
sealed interface INetwork permits NetState
{
    String format();
}

// enum, in questo caso è implicitamente sealed e deriva implicitamente da Enum<E>
// le costanti di enumerazione hanno un class body e costituiscono
// implicitamente le uniche sottoclassi dirette "permesse"
// ricordiamo, infatti, che la dichiarazione di queste costanti sono
// "trasformate" dal compilatore in apposite dichiarazioni di classi
// anonime che sono dirette sottoclassi della relativa enumerazione
// (riferirsi al Decompilato 8.1 per un dettaglio)
// il modificatore sealed non deve essere scritto altrimenti
// verrà generato un errore di compilazione
enum NetState implements INetwork
{
    ONLINE
    {
        public String format()
        {
            return "***online***";
        }
    },
    OFFLINE
    {
        public String format()
        {
            return "***offline***";
        }
    }
}

// interfaccia sigillata solo il record Rectangle può
// legittimamente implementarla
sealed interface I2DShape permits Rectangle
{
    int area();
    int perimeter();
}

// il record Rectangle è implicitamente final e deriva implicitamente da Record
// il modificatore final può essere scritto ma è ridondante
// e NON verrà generato un errore di compilazione
record Rectangle(int width, int height) implements I2DShape
{
    public int area() { return width * height; }
    public int perimeter() { return 2 * width + 2 * height; }
}

public class Snippet_8_9
{
    public static void main(String[] args)
    {
        System.out.printf("JANUARY ID:[%d]%n", Months.JANUARY.monthID());

        NetState connState = NetState.ONLINE;
        System.out.printf("Connection STATUS:[%s]%n", connState.format());

        System.out.printf("Rectangle PERIMITER:[%d]%n", new Rectangle(4, 5).perimeter());
    }
}