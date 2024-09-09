package LibroJava.Capitolo14;

// dichiarazione dei tipi annotazione
@interface Author { String value(); } // annotazione A 
@interface Authors { Author[] value(); } // annotazione B che ritorna A[] 

public class Snippet_14_7
{ 
    // utilizzo a ripetizione dell'annotazione A per il "tramite" di B 
    // notare l'uso di un comune inizializzatore di array per valorizzare
    // l'elemento Author[]
    @Authors({ @Author("Pellegrino Principe"), @Author("Silvio Rossi") })
    public static void execute() { }
    
    public static void main(String[] args) { }
}
