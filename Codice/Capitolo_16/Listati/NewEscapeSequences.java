package LibroJava.Capitolo16;

public class NewEscapeSequences
{
    public static void main(String[] args)
    {
        // questo blocco di testo formatta ed indenta uno snippet SQL
        // la sequenza di escape \LineTerminator, che si scrive digitando
        // il carattere \ e poi il carattere Invio, consente di rimuovere
        // quest'ultimo al fine di ottenere in output una sola riga "combinata",
        // unita che contiene tutte le 3 righe proprie del blocco di testo
        // in effetti \LineTerminator può anche essere visto come una sequenza
        // di escape che agisce come "continuatore di riga"
        // \LineTerminator mostra la sua utilità soprattutto se un letterale
        // stringa è formato da una lunga sequenza di caratteri che occuperebbe
        // nell'editor di testo molto spazio e dunque per comodità di formattazione
        // e leggibilità lo si separa su più righe pur mantenendo però in
        // output la sua formattazione originaria (apparirà infatti in una sola lunga riga)
        String sql = """
                     SELECT address \
                     FROM City \
                     WHERE cap = '00159';
                     """;

        System.out.printf("%s%n", sql);

        // questo blocco di testo formatta ed indenta valori RGB
        // la sequenza di escape \s consente di aggiungere un carattere
        // di spazio esattamente dove indicato ed evita anche che gli
        // eventuali caratteri finali di spazio che lo precedono siano
        // scartati in automatico
        // nel nostro caso \s su ogni riga fa sì che ciascuna di essa sia
        // lunga esattamente 16 caratteri spazi inclusi
        String RGB = """
                     Red(0xFF0000)  \s
                     Green(0x00FF00)\s
                     Blue(0x0000FF) \s
                     """;

        System.out.printf("%s", RGB);
    }
}
