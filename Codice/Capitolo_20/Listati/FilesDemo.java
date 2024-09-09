package LibroJava.Capitolo20;

import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;
import static java.lang.System.out;

public class FilesDemo
{
    private enum PathToProcess
    {
        PATH, OTHER_PATH, LINK_PATH, COPY_PATH
    };

    public static String getOSPath(PathToProcess ptp)
    {
        boolean isWindows = System.getProperty("os.name").contains("Windows");

        switch (ptp)
        {
            case PATH:
                return isWindows ? "C:\\MY_JAVA_SOURCES\\Test.java"
                       : System.getProperty("user.home") + "/MY_JAVA_SOURCES/Test.java";
            case OTHER_PATH:
                return isWindows ? "C:\\MY_JAVA_SOURCES\\InData.txt"
                       : System.getProperty("user.home") + "/MY_JAVA_SOURCES/InData.txt";
            case LINK_PATH: // symbolic link 
                return isWindows ? "C:\\MY_JAVA_SOURCES\\in"
                       : System.getProperty("user.home") + "/MY_JAVA_SOURCES/in";
            case COPY_PATH:
                return isWindows ? "C:\\MY_JAVA_CLASSES\\InData.txt"
                       : System.getProperty("user.home") + "/MY_JAVA_CLASSES/InData.txt";
            default:
                return "";
        }
    }

    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get(getOSPath(PathToProcess.PATH));
        Path other_path = Paths.get(getOSPath(PathToProcess.OTHER_PATH));
        Path link_path = Paths.get(getOSPath(PathToProcess.LINK_PATH));
        Path copy_path = Paths.get(getOSPath(PathToProcess.COPY_PATH));

        // test esistenza file 
        String ex_1 = Files.exists(path) ? "esiste" : "non esiste";
        String ex_2 = Files.exists(other_path) ? "esiste" : "non esiste";
        out.format("Il file %s %s. \n", path, ex_1);
        out.format("Il file %s %s. \n", other_path, ex_2);

        // test se due path localizzano lo stesso file 
        boolean path_eq = Files.isSameFile(other_path, link_path);
        out.format("Il file %s è lo stesso del file %s [%b] %n", other_path, link_path,
                   path_eq);

        try // cancello un file che non esiste! 
        {
            Files.delete(Paths.get("C:\\MY_JAVA_SOURCES\\nofile.txt"));
        }
        catch (NoSuchFileException fse)
        {
            out.format("Cancellazione fallita: il file %s non esiste. %n", fse.getFile());
        }

        try // copio il file InData.txt in C:\MY_JAVA_CLASSES 
        {
            Files.copy(other_path, copy_path, COPY_ATTRIBUTES);
            out.format("%s copiato correttamente in %s %n", other_path, copy_path);
        }
        catch (FileAlreadyExistsException fae)
        {
            out.println("Copia fallita: il file è già esistente!");
        }

        try // sposto il file InData.txt in C:\MY_JAVA_SOURCE sovrascrivendolo! 
        {
            Files.move(copy_path, other_path, ATOMIC_MOVE, REPLACE_EXISTING);
            out.format("%s spostato correttamente in %s %n", copy_path, other_path);
        }
        catch (AtomicMoveNotSupportedException am)
        {
            out.println("Il filesytem non supporta lo spostamento 'atomico'.");
        }
    }
}
