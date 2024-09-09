package LibroJava.Capitolo20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream
{
    public static void main(String[] args) throws IOException
    {
        try (FileReader in = new FileReader("InData.txt");
             FileWriter out = new FileWriter("OutData.txt"))
        {
            int c;
            while ((c = in.read()) != -1) // legge un carattere alla volta 
                out.write(c); // scrive un carattere 
        }

        System.out.println("Lettura e scrittura effettuata correttamente!");
    }
}
