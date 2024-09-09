package LibroJava.Capitolo14;

import java.lang.annotation.Repeatable;

@Repeatable(Authors.class) 
@interface Author { String value(); } 

@interface Authors { Author[] value(); } 

public class AnnRepeatable
{    
    // utilizzo a ripetizione dell'annotazione Author 
    @Author("Pellegrino Principe")
    @Author("Silvio Rossi")
    public static void execute() { }
    
    public static void main(String[] args) { }
}
