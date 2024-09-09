package LibroJava.Capitolo2;

public class Snippet_2_14
{
    public static void main(String[] args)
    {
        int number = 100; // uso consueto di un tipo primitivo

        // non usiamo, in questo contesto didattico, la possibilità di usare
        // una caratteristica di conversione automatica dai tipi primitivi
        // ai tipi classe wrapper (e viceversa) detta di "autoboxing" e di "auto-unboxing"
        Integer another_number = new Integer(100); // uso esplicito di un tipo Integer 
        System.out.printf("Minimo valore contenibile in un tipo int: %d%n", 
                          another_number.MIN_VALUE); // Minimo valore contenibile in un tipo int: -2147483648
        
        System.out.printf("Massimo valore contenibile in un tipo int: %d%n", 
                          another_number.MAX_VALUE); // Massimo valore contenibile in un tipo int: 2147483647 
        
        int int_value = another_number.intValue(); // ritorna come int il valore dell'oggetto Integer
        System.out.printf("Valore \"incapsulato\" nel tipo Integer another_number: %d%n", 
                          int_value); // Valore "incapsulato" nel tipo Integer another_number: 100

        // utilizzo di alcuni utili metodi del tipo Integer
        int value_1 = Integer.parseInt("2000"); // converte la stringa argomento in un tipo int
        Integer value_2 = Integer.valueOf("1000"); // converte la stringa argomento in un tipo Integer
        
        // anche in questo caso non usiamo l'"auto-unboxing" per la variabile Integer value_2
        System.out.printf("La somma tra %d e %d è: %d%n", 
                          value_1, value_2, value_1 + value_2.intValue()); // La somma tra 2000 e 1000 è: 3000
    }
}
