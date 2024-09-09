import com.pellegrinoprincipe.hardware.*;

public class ScannerClient
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner();
        
        // accesso diretto al campo vendor...
        scanner.vendor = "HP";        
        System.out.printf("Vendor dello scanner %s%n", scanner.vendor);        
    }
}
