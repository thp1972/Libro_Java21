package LibroJava.Capitolo20;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Snippet_20_1
{
    public static void main(String[] args)
    {
        // a seconda del sistema operativo in uso utilizza la corretta stringa
        // che rappresenta un path
        String windows = "C:\\MY_JAVA_SOURCES\\Test.java";
        String nix = System.getProperty("user.home")
                     + "/MY_JAVA_SOURCES/Test.java"; // per GNU/Linux e macOS

        String current_path = System.getProperty("os.name").contains("Windows")
                              ? windows : nix;

        Path path = Paths.get(current_path); // creo un path verso un file 
        Path path_2 = Paths.get("Test.class");
        FileSystem fs = FileSystems.getDefault();

        PathMatcher matcher = fs.getPathMatcher("glob:*.java");
        matcher.matches(path); // false 

        matcher = fs.getPathMatcher("glob:**.java");
        matcher.matches(path); // true - è stato percorso tutto il path 
        matcher = fs.getPathMatcher("glob:????.class");
        matcher.matches(path_2); // true - esattamente 4 caratteri prima di .class 

        matcher = fs.getPathMatcher("glob:*.{class,java}");
        matcher.matches(path_2); // true - il nome termina con .class o .java 

        matcher = fs.getPathMatcher("glob:T[abef]s?.class");
        // true - il nome inizia con T, ha una delle lettere a, b, e oppure f, ha la lettera s 
        // ha esattamente un qualsiasi carattere, termina con .class 
        matcher.matches(path_2);
    }
}
