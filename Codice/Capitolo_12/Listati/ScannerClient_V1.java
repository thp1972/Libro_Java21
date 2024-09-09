package LibroJava.Capitolo12;

import com.pellegrinoprincipe.hardware.*;

public class ScannerClient_V1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner();
        
        // accesso diretto al campo vendor...
        // error: vendor is not public in Scanner; cannot be accessed from outside package
        scanner.vendor = "HP";        
        System.out.printf("Vendor dello scanner %s%n", scanner.vendor);        
    }
}
