package LibroJava.Capitolo2;

public class Snippet_2_32
{
    public static void main(String[] args)
    {
        // nonostante l'uso di var Java rimane un linguaggio 
        // 1) staticamente tipizzato
        // 2) fortemente tipizzato
        var data = 1; // qua data è di tipo int

        // ERRORE - il compilatore a compile time verifica la correttezza
        // dei tipi; data è di tipo int e non può poi diventare automaticamente
        // un tipo String
        // Java rimane staticamente tipizzato (statically typed)
        data = "33"; // error: incompatible types: String cannot be converted to int

        // ERRORE - il compilatore a compile time verifica la correttezza
        // dei tipi; data1 è di tipo int mentre data2 è di tipo String e non
        // si può moltiplicare l'uno per l'altro
        // Java rimane fortemente tipizzato (strongly typed)
        var data1 = 10;
        var data2 = "10";
        var data3 = data1 * data2; // error: bad operand types for binary operator '*'
                                   // first type:  int
                                   // second type: String
    }
}
