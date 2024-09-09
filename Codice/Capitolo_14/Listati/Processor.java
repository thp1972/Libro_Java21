package LibroJava.Capitolo14;

import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes({ "LibroJava.Capitolo14.WorkToDo" })
@SupportedSourceVersion(SourceVersion.RELEASE_21)
public class Processor extends AbstractProcessor
{
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv)
    {
        for (Element elems : roundEnv.getElementsAnnotatedWith(WorkToDo.class))
        {
            // metodo dell'annotazione 
            System.out.printf("METODO ANNOTATO: %s%n", elems);
            WorkToDo wtd = elems.getAnnotation(WorkToDo.class);

            // output dati dell'annotazione 
            System.out.printf("Sviluppatore: %s%n", wtd.developer());
            System.out.printf("Messaggio: %s%n", wtd.msg());
            System.out.printf("Data inizio: %s%n", wtd.start_date());
            System.out.printf("ID: %s%n", wtd.uid());
        }
        return true;
    }
}
