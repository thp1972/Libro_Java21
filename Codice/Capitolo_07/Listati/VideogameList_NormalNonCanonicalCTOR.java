package LibroJava.Capitolo7;

record Videogame(String title, String publisher, String genre, int year, float price)
{
    // compact canonical record constructor
    Videogame
    {
        // verifica degli argomenti
        // il metodo trim della classe String rimuove da una stringa
        // eventuali spazi iniziali e finali
        title = title != null ? title.trim() : "N.A.";
        publisher = publisher != null ? publisher.trim() : "N.A.";
        genre = genre != null ? genre.trim() : "N.A";
        year = year >= 1970 && year <= 2030 ? year : -1;
        // non è possibile inizializzare esplicitamente i corrispondenti
        // campi di istanza pena la generazione di un errore di compilazione
    }

    // normal non-canonical record constructor
    Videogame()
    {
        // invoca il costruttore canonico normale per assicurare la corretta 
        // inizializzazione dei campi di istanza
        // scelgo dei valori di "default"
        this("Pong", "Atari", "Sport", 1972, 80);
    }
}


public class VideogameList_NormalNonCanonicalCTOR // client utilizzatore
{
    public static void main(String[] args)
    {
        Videogame[] videogames =
        {
            new Videogame(), // OK consentito invocare questo costruttore
            new Videogame("Super Mario Bros", "Nintendo", "Platform", 1985, 50),
            new Videogame("Double Dragon", "Taito", "Beat 'em up", 1987, 99),
            new Videogame("Wipeout", "Psygnosis", "Racing", 1995, 35),
            new Videogame("Tomb Raider", "Eidos Interactive", "Action-adventure", 1996, 29),
            new Videogame("Assassin's Creed", "Ubisoft", "Action-adventure", 2007, 40)
        };

        System.out.print
                ("""
                     TITLE               PUBLISHER          GENRE               YEAR          PRICE
                     ------------------------------------------------------------------------------
                """);

        for(int i= 0; i < videogames.length; i++)
        {
            var vg = videogames[i];
            // il flag - come per esempio in %-20s permetterà di allineare a sinistra
            // il corrispondente valore
            String vgString = String.format("%-20s%-19s%-20s%-14d%-5.2f",
                    vg.title(), vg.publisher(), vg.genre(), vg.year(),vg.price());
            System.out.printf("%d:   %s%n",i,vgString);
        }
    }
}
