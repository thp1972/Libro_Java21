package LibroJava.Capitolo2;

public class Snippet_2_27
{
    // nr è un membro di una classe e dunque una variabile "globale"
    // essa è "messa in ombra" (è celata) però dalla variabile locale nr dichiarata nel
    // metodo foo e solo all'interno di tale metodo
    private int nr = 200;

    // args, l e zed sono tutte variabili locali visibili solo nel metodo main
    // e negli altri eventuali blocchi di codice annidati
    public static void main(String[] args)
    {
        // l è una variabile locale, perché dichiarata nel metodo main
        // args è un parametro di un metodo e dunque una variabile locale
        int l = args.length;

        { // blocco di codice esplicito...

            // an_int è una variabile locale di un blocco di codice
            // è visibile solo in questo contesto oppure in altri
            // eventuali blocchi annidati
            int an_int = l; // Ok - l qui visibile e utilizzabile perché la ricerca della
            // dichiarazione relativa parte dal punto di utilizzo verso
            // "l'alto" ossia dal blocco corrente verso gli eventuali blocchi
            // contenitori; infatti in main, blocco contenitore, è presente
            // la sua dichiarazione
        }

        // ERRORE - an_int è utilizzabile solo nel suo blocco di codice
        int zed = an_int; // error: cannot find symbol
    }

    private void foo()
    {
        int nr = 100;

        // usa la variabile nr dichiarata localmente
        System.out.printf("nr = %d%n", nr); // nr = 100
    }

    private void bar()
    {
        // usa la variabile nr dichiarata "globalmente" perché è
        // visibile in tutto il corpo della classe e in questo
        // metodo non è nascosta da nessun'altra variabile con
        // lo stesso nome
        System.out.printf("nr = %d%n", nr); // nr = 200
    }

    private void baz()
    {
        // dichiarazione di una variabile locale di tipo int denominata x
        int x = 20;

        // blocco di codice annidato
        {
            // dichiarazione di una variabile locale di tipo int denominata x
            int x = 11; // error: variable x is already defined in method baz()
        }
    }
}
