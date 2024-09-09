package LibroJava.Capitolo20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScanningAndFormatting
{
    public static void main(String[] args) throws IOException
    {
        String name = "";
        int age = 0;
        boolean company = false;
        float euros = 0;

        try (Scanner scanner =
            new Scanner(
                new BufferedReader(
                    new FileReader("Record_in.txt")));
            PrintWriter pw = 
            new PrintWriter(
                new BufferedWriter(
                    new FileWriter("Record_out.txt"))))
        {
            while (scanner.hasNext()) // leggo dal file il prossimo token 
            {
                if (scanner.hasNextInt())
                    age = scanner.nextInt();
                else if (scanner.hasNextBoolean())
                    company = scanner.nextBoolean();
                else if (scanner.hasNextFloat())
                    euros = scanner.nextFloat();
                else
                    name = scanner.next();
            }
            String c_found = company ? "ha fondato" : "non è riuscito a fondare";

            pw.format("%2$s a %1$d anni %3$s un'azienda." +
                      " Prima guadagnava solo %4$,+.2f Euro al mese.",
                      age, name, c_found, euros);
        }
    }
}
