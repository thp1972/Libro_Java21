package LibroJava.Capitolo9;

// una semplice lista di oggetti non generica
// avremmo potuto creare tante liste quanti erano i tipi da manipolare
// (SimpleIntList, SimpleStringList e così via) con ciascuna che usava
// il relativo tipo (int, String e così via) al posto di Object
// tuttavia, come già detto, ciò avrebbe provocato problemi di produttività
// e manutenibilità del codice
class SimpleList
{
    private Object[] data;

    public SimpleList(int nr)
    {
        data = new Object[nr];
    }

    public Object getData(int ix)
    {
        return ix < data.length ? data[ix] : null;
    }

    public void addData(int ix, Object data)
    {
        if (ix < this.data.length)
            this.data[ix] = data;
    }
}

public class Snippet_9_1
{
    public static void main(String[] args)
    {
        // una lista che conterrà 4 oggetti di tipo differente
        SimpleList list = new SimpleList(4);
        list.addData(0, 12); // un tipo int
        list.addData(1, "Ciao"); // un tipo String - upcasting
        list.addData(2, true); // un tipo boolean
        list.addData(3, 44.66); // un tipo double

        // Ok - conversione corretta ma cast "manuale" necessario
        int data_0 = (int) list.getData(0);

        // ERRORE - conversione non attuabile
        // il compilatore, a compile time, non sarà in grado di avvisare che stiamo
        // eseguendo una conversione non attuabile da un tipo boolean verso un tipo String
        // a runtime avremo infatti la generazione della seguente eccezione:
        // java.lang.ClassCastException: java.base/java.lang.Boolean cannot be cast 
        // to java.base/java.lang.String
        String data_2 = (String) list.getData(2);
    }
}
