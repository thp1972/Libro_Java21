package LibroJava.Capitolo7;

public class ObjectsAsParameters
{
    private static void modify(Time_Revision7 t_p)
    {
        // questa modifica dell'orario si ripercuoterà sull'oggetto
        // di tipo Time_Revision7 passato come argomento e ciò perché
        // t_p (parametro) conterrà lo stesso riferimento verso quell'
        // oggetto contenuto da time (argomento)
        t_p.setTime(11, 00, 00);
    }

    public static void main(String[] args)
    {
        Time_Revision7 time = new Time_Revision7(18, 30, 0);
        System.out.printf("time, orario originario: %s%n", time.getTime());

        modify(time); // modifichiamo...

        System.out.printf("time, orario modificato: %s%n", time.getTime());
    }
}
