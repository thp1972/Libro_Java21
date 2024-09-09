package LibroJava.Capitolo4;

public class Snippet_4_10
{
    public static void main(String[] args)
    {
        int a = 100, b = 3;

        // risultato intero: la parte frazionaria è stata troncata
        int res = a / b; // 33

        // b è esplicitamente convertito in float cosicché tutta l'espressione
        // viene valutata in virgola mobile per le consuete regole di promozione
        // dei tipi; infatti a viene convertita in float e dunque la divisione
        // avviene tra 100.000000 / 3.000000
        float f_res = a / (float) b; // 33.333332

        // ERRORE - divisione per 0, rilevata a runtime
        int div_0 = 100 / 0; // java.lang.ArithmeticException : / by zero

        // ERRORE - divisione per 0, rilevata a runtime
        int zero = 0;
        int div_2_0 = 100 / zero; // java.lang.ArithmeticException : / by zero
    }
}
