package LibroJava.Capitolo20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream 
{
    public static void main(String[] args) throws IOException 
    {
        try (FileInputStream in = new FileInputStream("InData.txt");
             FileOutputStream out = new FileOutputStream("OutData.txt"))
        {
            int c;
            while ((c = in.read()) != -1) // legge un byte alla volta 
                out.write(c); // scrive un byte 
        }

        System.out.println("Lettura e scrittura effettuata correttamente!");
    }
}
