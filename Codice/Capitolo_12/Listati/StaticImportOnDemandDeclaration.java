package LibroJava.Capitolo12;

// static-import-on-demand declaration
import static java.lang.Math.*;
import static com.pellegrinoprincipe.A_Class_V2.*;

public class StaticImportOnDemandDeclaration
{
    public static void main(String[] args)
    {
        // si può utilizzare direttamente il nome semplice dei membri statici importati
        foo();
        double value = sqrt(DATA);
    }
}
