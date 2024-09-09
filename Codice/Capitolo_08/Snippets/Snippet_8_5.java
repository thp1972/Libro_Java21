package LibroJava.Capitolo8;

// la classe Book è dichiarata sigillata con la specifica che
// solo le classi PrintedBook, EBook ed AudioBook possono
// estenderla
// ERROR: invalid permits clause: 'AudioBook' must directly extend 'Book'
// AudioBook deve estendere Book: vedere la sottostante dichiarazione
sealed class Book permits PrintedBook, EBook, AudioBook  {}

// la classe PrintedBook è dichiarata essa stessa come sigillata e
// specifica che le classi HardCoverBookFormat e PaperBackBookFormat
// sono le uniche che possono estenderla
// PrintedBook può legittimamente estendere Book
sealed class PrintedBook extends Book permits HardCoverBookFormat, PaperBackBookFormat {}

// la classe EBook è dichiarata final: nessun'altra classe la può estendere
// EBook può legittimamente estendere Book
final class EBook extends Book {}

// la classe AudioBook è dichiarata final: nessun'altra classe la può estendere
// AudioBook può legittimamente estendere Book ma NON lo fa!
// viene generato un errore di compilazione localizzato in fase di dichiarazione della
// classe Book, clausola permits
final class AudioBook {}

// la classe HardCoverBookFormat è dichiarata final: nessun'altra classe la può estendere
// HardCoverBookFormat può legittimamente estendere PrintedBook
final class HardCoverBookFormat extends PrintedBook {}

// la classe PaperBackBookFormat è dichiarata final: nessun'altra classe la può estendere
// PaperBackBookFormat può legittimamente estendere PrintedBook
final class PaperBackBookFormat extends PrintedBook {}

// la classe ComicBook è dichiarata final: nessun'altra classe la può estendere
// ComicBook NON può legittimamente estendere Book
// ERROR: class is not allowed to extend sealed class: LibroJava.Capitolo8.Book
// (as it is not listed in its 'permits' clause)
final class ComicBook extends Book {}

public class Snippet_8_5
{
    public static void main(String[] args) {}
}
