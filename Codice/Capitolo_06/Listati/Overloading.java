package LibroJava.Capitolo6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Overloading
{
    public static int a = 10, b = 20;

    // segnatura: result()
    public static void result()
    {
        System.out.printf("%d + %d = %d%n", a, b, (a + b));
    }

    // segnatura: result(String)
    public static void result(String file_name) throws IOException
    {
        if (file_name != null && file_name.length() > 0)
        {
            // in questo caso la clausola try agisce come un'istruzione ed è infatti
            // denominata dallo standard come "try-with-resources statement"
            // essa permette di rilasciare "automaticamente" una risorsa utilizzata
            // nel nostro caso permette di chiudere correttamente il file creato
            try (BufferedWriter out = new BufferedWriter(new FileWriter(file_name)))
            {
                out.write("La somma di 10 e 20 è " + (a + b));
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        // il compilatore selezionerà per la futura invocazione il
        // metodo result con la segnatura result(string)
        result("result.txt"); // scrivi su file
    }
}
