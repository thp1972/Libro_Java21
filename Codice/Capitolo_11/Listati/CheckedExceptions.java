package LibroJava.Capitolo11;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CheckedExceptions
{
    public static Scanner FileScanner(String file_name) throws FileNotFoundException
    {
        return new Scanner(new File(file_name));
    }

    public static void main(String[] args)
    {
        try (Scanner n_scanner = FileScanner("Test.html")) // try-with-resources
        {
            System.out.println("Se vi è un'eccezione non sarò visualizzata!");  
        }
        catch (FileNotFoundException fnf)
        {
            System.out.println("Eccezione. File non trovato. " +
                               "Forse il nome del file è errato?");
        }
    }
}
