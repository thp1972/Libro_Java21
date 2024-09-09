package LibroJava.Capitolo2;

public class Snippet_2_4
{
    public static void main(String[] args)
    {
        int left︳right;         // CORRETTO; attenzione il carattere usato ︳ è detto
                                 // PRESENTATION FORM FOR VERTICAL LOW LINE e ha codepoint U+FE33
                                 // non è dunque uguale al carattere "pipe" | che è detto
                                 // VERTICAL LINE e ha codepoint U+007C
        int number_1;            // CORRETTO
        int _pref;               // CORRETTO
        int $int;                // CORRETTO
        int \u0061\u0062\u0063;  // CORRETTO - sequenze di escape Unicode:
                                 // \u0061\u0062\u0063 -> abc
        \u0069\u006e\u0074 step; // CORRETTO - sequenze di escape Unicode:
                                 // \u0069\u006e\u0074 -> int
        int αριθμούς;            // CORRETTO - number scritto in Greco

        int number 1; // ERRORE - l'identificatore è separato da un carattere di spazio
        int 1number;  // ERRORE - l'identificatore inizia con un carattere numerico
        int @part;    // ERRORE - l'identificatore inizia con un carattere non ammesso
        int from-to;  // ERRORE - l'identificatore ha "nel mezzo" un carattere non ammesso

        // a e A sono variabili DIVERSE!!!
        int a;
        int A;     
    }
}
