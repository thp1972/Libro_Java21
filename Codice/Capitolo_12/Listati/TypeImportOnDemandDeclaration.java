package LibroJava.Capitolo12;

// type-import-on-demand declaration
import com.pellegrinoprincipe.*; // tutti i tipi del package
import com.pellegrinoprincipe.Another_Class.*; // tutti i tipi del tipo (la classe)

public class TypeImportOnDemandDeclaration
{
    public static void main(String[] args)
    {
        // si può utilizzare direttamente il nome semplice della classe importata
        A_Class a_class = new A_Class();

        // si può utilizzare direttamente il nome semplice del tipo importato
        A_Child_Class a_child_class = new Another_Class().new A_Child_Class();

        // si può utilizzare direttamente il nome semplice del tipo importato
        An_Enum an_enum = An_Enum.ONE;        
    }
}
