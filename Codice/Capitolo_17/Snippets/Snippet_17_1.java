package LibroJava.Capitolo17;

public class Snippet_17_1
{
    public static void main(String[] args)
    {
        String ip = "192.168.1.25";
        String regex = "(\\d{1,3}\\.){3}\\d{1,3}";
        
        // verifica se la stringa ip contiene la rappresentazione di un indirizzo di rete
        // ovviamente la regex non è completa, perché non verifica il range di valori accettabili
        // infatti un valore come 999.999.999.999 sarebbe valido per la regex, ma non lo sarebbe
        // come indirizzo di rete i cui valori accettabili, per ogni ottetto, sono compresi tra 0 e 255
        boolean b = ip.matches(regex); // true
    }
}
