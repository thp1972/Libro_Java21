package LibroJava.Capitolo8;

record Point(int x, int y) { }

public class Snippet_8_18
{
    public static void main(String[] args)
    {
        Point p = new Point(-1, 100);

        // definiamo delle etichette case con dei guarded patterns ovvero con delle
        // espressioni condizionali supplementari che permettono di aggiungere
        // ulteriori criteri per la ricerca di corrispondenze di un pattern
        // così, case Point(int x, int y) when x < 0 può essere letta nel seguente modo:
        // dichiara un'etichetta case con un pattern che troverà una corrispondenza
        // se p è del tipo record indicato e il suo campo x sarà minore di 0
        // in pratica when si comporta come l'operatore && (AND logico condizionale)
        switch (p) // Attenzione valore x negativo!
        {
            case Point(int x, int y) when x < 0 -> System.out.println("Attenzione valore x negativo!");
            case Point(int x, int y) when y < 0 -> System.out.println("Attenzione valore y negativo!");
            case Point(int x, int y) -> System.out.printf("[%d, %d]%n", x, y);
        }

        // un altro esempio di un guarded pattern
        // in questo caso usiamo un type pattern unitamente ad una condizione
        // che verifica se la stringa corrispondente ha dei caratteri...
        CharSequence name = "Pellegrino";
        switch (name) // Pellegrino
        {
            case String n when n.length() > 0 -> System.out.println(n);
            default -> System.out.println("name non è valorizzato");
        }
    }
}
