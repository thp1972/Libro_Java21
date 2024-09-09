package LibroJava.Capitolo2;

import java.util.Scanner;

public class IntegerLiterals
{
    public static void main(String[] args)
    {
        // un oggetto di tipo Scanner è uno "scansionatore" di testo 
        Scanner scanner = new Scanner(System.in); // legge da tastiera

        int number; // una variabile di tipo int

        // istruzioni di input/output
        System.out.print("Digita un numero intero: ");

        // ritorna, come valore numerico di tipo int, il testo digitato da tastiera 
        number = scanner.nextInt();

        // il carattere + è utilizzato con delle stringhe per concatenarle
        // è spesso usato se una stringa è troppo lunga per una sola riga di testo
        // e così la si divide in più righe di testo
        System.out.printf("Il numero %d espresso in base 10 ha le seguenti "
                          + "rappresentazioni:%n", number);

        // lo specificatore di formato %s produce una stringa
        System.out.printf("in base 2  -> %s%n", Integer.toBinaryString(number));

        // 0 è tipicamente usato come prefisso per i numeri ottali
        System.out.printf("in base 8  -> 0%s%n", Integer.toOctalString(number));

        // 0x o 0X sono tipicamente usati come prefissi per i numeri esadecimali
        System.out.printf("in base 16 -> 0x%s%n", Integer.toHexString(number));
    }
}
