package LibroJava.Capitolo2;

public class Snippet_2_22
{
    public static void main(String[] args)
    {
        // due oggetti di tipo StringBuilder
        // var_1 e var_2 conterranno un riferimento verso il rispettivo oggetto
        // di tipo StringBuilder
        StringBuilder var_1 = new StringBuilder("Linguaggio C++");
        StringBuilder var_2 = new StringBuilder("Linguaggio C#");

        // ora var_1 conterrà una copia del valore di var_2 ossia una copia del
        // valore del riferimento verso l'oggetto di tipo StringBuilder
        var_1 = var_2;

        // ora var_1 modificherà la "sua" stringa ma tale modifica si ripercuoterà
        // anche su var_2; var_1 e var_2 punteranno infatti alla stessa area di memoria
        // dove è stato allocato l'oggetto di tipo StringBuilder
        var_1.append(" e linguaggio Java");
    }
}
