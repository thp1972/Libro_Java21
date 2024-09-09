package LibroJava.Capitolo20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import static java.lang.System.out;

public class AttributeDemo
{
    public static void main(String[] args) throws IOException
    {
        // a seconda del sistema operativo in uso utilizza la corretta stringa
        // che rappresenta un path
        String windows = "C:\\MY_JAVA_SOURCES\\InData.txt";
        String nix = System.getProperty("user.home")
                     + "/MY_JAVA_SOURCES/InData.txt"; // per GNU/Linux e macOS

        String current_path = System.getProperty("os.name").contains("Windows")
                              ? windows : nix;

        Path path = Paths.get(current_path); // creo un path verso un file 

        // lettura attributi file 
        out.format("Attributi del file %s%n", path.getFileName() + ":");

        BasicFileAttributes basic_attrs = Files.readAttributes(path,
                                          BasicFileAttributes.class);

        out.format("Data creazione: %s%n", basic_attrs.creationTime());
        out.format("Data ultimo accesso: %s%n", basic_attrs.lastAccessTime());
        out.format("Data ultima modifica: %s%n", basic_attrs.lastModifiedTime());
        out.format("E' una directory? %s%n", basic_attrs.isDirectory());
        out.format("E' un file? %s%n", basic_attrs.isRegularFile());
        out.format("E' un link simbolico? %s%n", basic_attrs.isSymbolicLink());
        out.format("Dimensione in byte: %d%n", basic_attrs.size());
    }
}
