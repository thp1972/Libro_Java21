package LibroJava.Capitolo12;

// single-static-import declaration
import static com.pellegrinoprincipe.A_Class_V1.DATA;

public class SingleStaticImportDeclaration
{
    public static void main(String[] args)
    {
        // si può utilizzare direttamente il nome semplice del membro statico importato
        int nr = DATA;
    }
}
