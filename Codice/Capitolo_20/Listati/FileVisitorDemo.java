package LibroJava.Capitolo20;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorDemo
{
    public static void main(String[] args)
    {
        // a seconda del sistema operativo in uso utilizza la corretta stringa
        // che rappresenta un path
        String windows = "C:\\MY_JAVA_SOURCES";
        String nix = System.getProperty("user.home")
                     + "/MY_JAVA_SOURCES"; // per GNU/Linux e macOS

        String current_path = System.getProperty("os.name").contains("Windows")
                              ? windows : nix;

        Path path = Paths.get(current_path);
        try
        {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>()
            {
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                        throws IOException
                {
                    System.out.println("Sto per visitare: " + dir.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                        throws IOException
                {
                    System.out.println("Sto visitando: " + file.getFileName()
                                       + " dimensioni: (" + attrs.size() + ") byte");
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                        throws IOException
                {
                    System.out.println("Ho terminato la visita di: " + dir.getFileName());
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult visitFileFailed(Path file, IOException exc)
                {
                    System.err.println("ERRORE nella visita: " + exc);
                    return FileVisitResult.CONTINUE;
                }
            });
        }
        catch (IOException ex) { ex.printStackTrace(); }
    }
}
