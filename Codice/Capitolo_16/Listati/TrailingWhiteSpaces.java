package LibroJava.Capitolo16;

public class TrailingWhiteSpaces
{
    public static void main(String[] args)
    {
        // lo snippet di codice di jsToEval è stato copiato da
        // un altro editor di testo che però, per qualche oscura
        // ragione, ha anche copiato degli spazi finali presenti
        // per tutte e 4 le righe di testo che vanno da return a 
        // toString (riferirsi alla Figura...)
        // tipicamente, questi spazi finali non sono intenzionali e
        // rappresentano degli "artefatti" che sono normalmente
        // invisibili in un editor di testo
        // per tale ragione il compilatore Java li tratta come
        // spazi superflui e li scarta in automatico
        // si ricorda comunque che se si vogliono preservare degli
        // spazi finali si può usare la sequenza di escape \s
        // così che tutti gli spazi che la precedono sono, per l'appunto,
        // conservati
        String jsToEval = """
                          const rgbToHex = (r, g, b) => 
                          {
                              return "#" + ((1 << 24) +            
                                      (r << 16) +           
                                      (g << 8) + b).        
                                       toString(16).slice(1);
                          }                        
                          console.log(rgbToHex(255, 51, 255)); 
                          """;
        
        System.out.printf("%s", jsToEval);
    }
}
