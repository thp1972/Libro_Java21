package LibroJava.Capitolo14;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RuntimeAnnotationProcessor
{
    public static void main(String args[]) throws NoSuchMethodException
    {
        // classe dove è presente l'annotazione 
        Class<Calculator_Revision1> class_obj = Calculator_Revision1.class;
        Method[] ms = class_obj.getDeclaredMethods(); // metodi dichiarati nella classe 

        for (Method m : ms)
        {
            Annotation[] method_annotations = m.getAnnotations(); // ottengo le annotazioni 
                                                                  // che decorano il metodo 

            if (method_annotations.length > 0)
            {
                // metodo dell'annotazione 
                System.out.printf("METODO ANNOTATO: %s()%n", m.getName());
                for (Annotation ann : method_annotations)
                {
                    if (ann instanceof WorkToDo_Revision1) // stampo i valori dell'annotazione 
                    {

                        WorkToDo_Revision1 wtd = (WorkToDo_Revision1) ann;
                        System.out.printf("Sviluppatore: %s%n", wtd.developer());
                        System.out.printf("Messaggio: %s%n", wtd.msg());
                        System.out.printf("Data inizio: %s%n", wtd.start_date());
                        System.out.printf("ID: %s%n", wtd.uid());
                    }
                }
            }
        }
    }
}
