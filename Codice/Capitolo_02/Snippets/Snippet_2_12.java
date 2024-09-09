package LibroJava.Capitolo2;

public class Snippet_2_12
{
    public static void main(String[] args)
    {
        char c = 122; // c vale 'z'

        // -- decrementa di 1 il valore di c
        c--; // c ora vale 'y' (codice numerico 121)

        // += incrementa di 2 il valore di c
        c += 2; // c ora vale '{' (codice numerico 123)

        // '5' ha il valore esadecimale Unicode 0x35 - (53 in base 10)
        // quindi l'addizione porrà nella variabile nr il valore 106 (in base 10)
        int nr = '5' + '5';
        char c_2 = (char) nr; // c_2 vale 'j' (codice numerico 106)

        // 'a' ha il valore esadecimale Unicode 0x61 - (97 in base 10)
        // 'A' ha il valore esadecimale Unicode 0x41 - (65 in base 10)
        // quindi la sottrazione porrà nella variabile dist il valore 32 (in base 10)
        int dist = 'a' - 'A'; // il carattere 'a' "dista", è "più avanti" di 32 caratteri
                              // rispetto al carattere 'A'    
    }
}
