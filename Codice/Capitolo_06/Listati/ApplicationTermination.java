package LibroJava.Capitolo6;

import java.util.Scanner;

// Java, di default, non genera un'eccezione di overflow aritmetico se, per esempio,
// un numero è più grande del valore massimo o più piccolo del valore minimo del
// suo tipo di appartenenza
// creiamo quindi una "nuova" classe, che deriva dalla classe java.lang.ArithmeticException,
// e che rappresenta l'anomalia descritta
class OverflowException extends ArithmeticException { }

public class ApplicationTermination
{
    public static void main(String[] args)
    {
        // codici di errore arbitrari...
        final int ERROR_SUCCESS = 0x0;
        final int ERROR_ARITHMETIC_OVERFLOW = 0x77; // in base dieci - 119

        // non possiamo usare direttamente il tipo byte perché in Java esso è solo "signed"
        // ossia i suoi valori vanno da -128 a 127
        int nr;
        System.out.print("Digita un numero contenibile nell'intervallo di un byte [0 - 255]: ");

        try // prova a eseguire la conversione...
        {
            nr = new Scanner(System.in).nextInt();

            // se si verifica un overflow lancia la relativa eccezione...
            if (nr < 0 || nr > 255)
                throw new OverflowException();
        }
        catch (OverflowException oe)
        {
            // eseguire il programma dal file batch
            // altrimenti in caso di eccezione non vi sarà alcuna notifica!
            System.exit(ERROR_ARITHMETIC_OVERFLOW);
        }

        System.exit(ERROR_SUCCESS);
    }
}
