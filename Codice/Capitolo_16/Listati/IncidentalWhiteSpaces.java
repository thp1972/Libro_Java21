package LibroJava.Capitolo16;

public class IncidentalWhiteSpaces
{
    public static void main(String[] args)
    {
        // la riga con meno spazi iniziali è quella del delimitatore
        // di chiusura """
        // il blocco di testo sarà spostato a sinistra fino a che
        // la riga """ sarà adiacente al margine sinistro
        // questo permetterà di mantenere l'indentazione corretta, per esempio
        // la riga LINE 1 avrà mantenuto i 3 spazi iniziali rispetto
        // sempre al margine sinistro
        String inc_1 = 
        """
           LINE 1
              LINE 2
                 LINE 3
        """;    
        System.out.printf("%s%n", inc_1);
        
        // la riga con meno spazi iniziali è quella della riga LINE 1
        // il blocco di testo sarà spostato a sinistra fino a che
        // la riga LINE 1 sarà adiacente al margine sinistro
        // questo permetterà di mantenere l'indentazione corretta, per esempio
        // la riga LINE 2 avrà mantenuto lo spazio iniziale rispetto
        // alla riga LINE 1
        String inc_2 = 
        """
        LINE 1
         LINE 2
           LINE 3
             """;  
        System.out.printf("%s%n", inc_2);        
                
        // la riga con meno spazi iniziali è quella sia 
        // della riga LINE 1 che della riga LINE 2
        // il blocco di testo sarà spostato a sinistra fino a che
        // la riga LINE 1 e la riga LINE 2 saranno entrambe
        // adiacenti al margine sinistro
        // questo permetterà di mantenere l'indentazione corretta, per esempio
        // la riga LINE 3 avrà mantenuto i 2 spazi iniziali rispetto
        // alla riga LINE 1 e alla riga LINE 2
        String inc_3 = """
                       LINE 1
                       LINE 2
                         LINE 3
                         """;           
        System.out.printf("%s%n", inc_3); 
        
        // la riga con meno spazi iniziali è quella sia 
        // della riga LINE 1 che della riga LINE 3
        // il blocco di testo sarà spostato a sinistra fino a che
        // la riga LINE 1 e la riga LINE 3 saranno entrambe
        // adiacenti al margine sinistro
        // questo permetterà di mantenere l'indentazione corretta, per esempio
        // la riga LINE 2 avrà mantenuto i 5 spazi iniziali rispetto
        // alla riga LINE 1 e alla riga LINE 3
        String inc_4 = 
        """
        LINE 1
             LINE 2
        LINE 3"""; // notiamo come il delimitatore """ sia stato scritto
                   // di fiano a LINE 3 e dunque non viene inserito
                   // alcun carattere di new line
        System.out.printf("%s%n", inc_4);   
    }    
}
