package LibroJava.Capitolo11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyClause
{
    public static void main(String[] args)
    {
        String file_name = "notes.txt";
        
        // buffer per i caratteri da leggere in notes.txt
        char[] data = new char[20];

        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader(file_name));
            br.read(data, 10, data.length);
        }
        catch (IOException | IndexOutOfBoundsException e) 
        // se, per esempio, file non trovato
        // oppure se un indice di un array è "out of range" 
        {
            System.out.println(e);
        }
        finally // verrà comunque eseguita
        {
            // se br non è nullo rilascia tutte le risorse
            // da esso utilizzate... chiudi cioè il file notes.txt
            if (br != null)
            {
                System.out.println("Operazioni di cleanup per il file aperto...");
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
