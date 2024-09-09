package LibroJava.Capitolo2;

// ERRORE - var come nome di un tipo
class var { } // error: 'var' not allowed here as of release 10, 'var' is a restricted 
             // local variable type and cannot be used for type declarations

// ERRORE - var come nome di un tipo
interface var { } // error: 'var' not allowed here as of release 10, 'var' is a restricted 
                 // local variable type and cannot be used for type declarations

class Data
{
    // ERRORE - var come parametro formale di un costruttore
    Data(var nr) { } // error: 'var' is not allowed here
}

public class Snippet_2_30
{
    // ERRORE - dichiarazione di un campo
    public static var field = 44.44; // error: 'var' is not allowed here
    
    public static void main(String[] args)
    {
        // ERRORE - non c'è un inizializzatore
        var data_id; // error: cannot infer type for local variable data_id
                     // (cannot use 'var' on variable without initializer)
        
        // ERRORE - sono presenti più di un dichiaratore di variabile ossia oltre
        // a data0 = 11 sono presenti anche data1 = 12 e data2 = 13
        var data0 = 11, data1 = 12, data2 = 13; // error: 'var' is not allowed in a compound declaration
        
        // ERRORE - l'identificatore buffer presenta anche le parentesi quadre proprie 
        // della dichiarazione di un array
        var buffer[] = new int[3]; // error: 'var' is not allowed as an element type of an array
                                   // illegal reference to restricted type 'var'
                                   // incompatible types: int[] cannot be converted to var[]
               
        // ERRORE - è presente un inizializzatore di array                 
        var zips = { 1000, 2000 }; // error: cannot infer type for local variable zips
                                   // (array initializer needs an explicit target-type)                   

        // ERRORE - self-reference
        var blob = (blob = "abm123123213zs0f0f0f"); // error: cannot infer type for local variable blob
                                                    // (cannot use 'var' on self-referencing variable)
             
        // ERRORE - null type
        var name = null; // error: cannot infer type for local variable name
                         // (variable initializer is 'null')
        
        // ERRORE - var come tipo eccezione nella clausola catch
        try
        {
            var res = 10 / 0;
        }
        catch(var exc) { } // error: 'var' is not allowed here
    }
    
    // ERRORE - var come tipo per i parametri formali di un metodo
    public static void missing(var one, var two) { } // error: 'var' is not allowed here
    
    // ERRORE - var come tipo restituito da un metodo
    public static var build() // error: 'var' is not allowed here
    {
        var product = 10 * 100;
        return product;
    }   
}