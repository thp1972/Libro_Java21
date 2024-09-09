package LibroJava.Capitolo20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream
{
    public static void main(String[] args) throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader("InData.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("OutData.txt")))
        {
            int c;
            while ((c = br.read()) != -1) // legge un carattere alla volta 
                bw.write(c); // scrive un carattere 
        }

        System.out.println("Lettura e scrittura effettuata correttamente!");
    }
}
