package LibroJava.Capitolo2;

public class FloatingPointType
{
    public static void main(String[] args)
    {
        float a_float = 1234.444f; // suffisso f per letterale float 
        double a_double_1 = 4.58e-2; // letterale double in notazione esponenziale 
        double a_double_2 = 1.660538921e-27; // unità di massa atomica... 

        // letterale in virgola mobile espresso in notazione esponenziale esadecimale 
        float f_in_hex = 0x1.59a8f6p8f; // hexadecimal floating-point literal

        // visualizza i valori in virgola mobile
        System.out.printf("Valore di a_float: %11.3f%n", a_float);
        System.out.printf("Valore di a_double_1: %f%n", a_double_1); // in notazione decimale convenzionale
        System.out.printf("Valore di a_double_2: %.9e%n", a_double_2); // in notazione esponenziale
        System.out.printf("Valore di f_in_hex: %14a%n", f_in_hex); // in notazione esponenziale
        System.out.printf("Valore di f_in_hex: %8.2f%n", f_in_hex); // in notazione decimale convenzionale 
    }
}
