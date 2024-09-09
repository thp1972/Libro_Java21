package LibroJava.Capitolo4;

public class Snippet_4_9
{
    public static void main(String[] args)
    {
        final double ONE_METER_EQUALS_TO_FEET = 3.2808399;

        // ottengo quanti piedi sono pari a metri 120
        // meter è convertito in double prima della moltiplicazione con la costante double
        int meter = 120;
        double feet = meter * ONE_METER_EQUALS_TO_FEET; // 393.700788
    }
}
