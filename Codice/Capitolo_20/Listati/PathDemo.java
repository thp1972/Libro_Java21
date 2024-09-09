package LibroJava.Capitolo20;

import java.nio.file.Path;
import java.nio.file.Paths;
import static java.lang.System.out;

public class PathDemo
{
    public static void main(String[] args)
    {
        // a seconda del sistema operativo in uso utilizza la corretta stringa
        // che rappresenta un path
		// si noti l'uso del metodo getProperty che restituisce una stringa che
        // rappresenta il valore della correlativa proprietà di sistema indicata
        // dall'argomento fornito
        String windows = "C:\\MY_JAVA_SOURCES\\Test.java";
        String nix = System.getProperty("user.home") + 
                     "/MY_JAVA_SOURCES/Test.java"; // per GNU/Linux e macOS
        
        String current_path = System.getProperty("os.name").contains("Windows") ?
                              windows : nix;        
        
        Path path = Paths.get(current_path); // creo un path verso un file 

        // informazioni del path 
        out.format("toString: %s%n", path.toString());
        out.format("getFileName: %s%n", path.getFileName());
        out.format("getName(0): %s%n", path.getName(0));
        out.format("getNameCount: %d%n", path.getNameCount());
        out.format("subpath(1, 2): %s%n", path.subpath(1, 2));
        out.format("getParent: %s%n", path.getParent());
        out.format("getRoot: %s%n", path.getRoot());
    }
}
