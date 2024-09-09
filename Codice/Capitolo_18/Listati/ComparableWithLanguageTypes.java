package LibroJava.Capitolo18;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class ComparableWithLanguageTypes
{
    public static void main(String[] args)
    {
        Set<Integer> numbers = new TreeSet<>(); // TreeSet di numeri 
        numbers.add(44);
        numbers.add(-11);
        numbers.add(2);
        System.out.printf("Interi ordinati: %s%n", numbers);

        Set<String> strings = new TreeSet<>(); // TreeSet di stringhe 
        strings.add("Principe");
        strings.add("Alonso");
        strings.add("Russo");
        System.out.printf("Stringhe ordinate: %s%n", strings);

        Set<GregorianCalendar> dates = new TreeSet<>(); // TreeSet di date 
        dates.add(new GregorianCalendar(2010, 11, 10));
        dates.add(new GregorianCalendar(1999, 1, 12));
        dates.add(new GregorianCalendar(2006, 10, 11));

        StringBuilder ordered_dates = new StringBuilder("Date ordinate: [");
        for (GregorianCalendar c : dates)
        {
            String data = c.get(Calendar.DAY_OF_MONTH) + "/" +
                          c.get(Calendar.MONTH) + "/" +
                          c.get(Calendar.YEAR) + ", ";
            ordered_dates.append(data);
        }
        ordered_dates.delete(ordered_dates.length() - 2, ordered_dates.length());
        ordered_dates.append("]");
        System.out.println(ordered_dates);
    }
}
