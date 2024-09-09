package LibroJava.Capitolo8;

// la compilazione di questa classe produrrà anche:
// il file AnonymousClasses$1.class
// il file AnonymousClasses$2.class
public class AnonymousClassesWithVar
{
    public static void main(String[] args)
    {       
        // classe anonima che implementa l'interfaccia TwoDShape
        // utilizzo di un tipo manifesto
        // a compile time tds_1 "sarà inferito" come di tipo TwoDShape
        // a runtime tds_1 sarà di tipo AnonymousClasses$1
        // a compile time, però, il metodo translate non sarà trovato
        // su tds_1 perchè tds_1 sarà di tipo TwoDShape che non lo conterrà come
        // membro (non conterrà neppure il membro SHAPE_TYPE)       
        TwoDShape tds_1 = new TwoDShape() // a runtime quà sarà qualcosa come:
                                          // = new AnonymousClasses$1()
        {                    
            // membri nuovi
            public static final String SHAPE_TYPE = "2D";            
            public void translate() { System.out.println("Translate... X"); }         
      
            // membri sovrascritti
            public int area() { return 0; }
            public int perimeter() { return 0; }
            public void draw() { System.out.println("Draw... X"); }               
        };
        
        // ERRORE - TwoDShape non ha quel metodo... 
        tds_1.translate(); // error: cannot find symbol 
                           // symbol:   method translate()
                           // location: variable tds_1 of type TwoDShape
        
        
        // classe anonima che implementa l'interfaccia TwoDShape
        // utilizzo dell'identificatore var
        // a compile time tds_2 "sarà inferito" come di tipo AnonymousClasses$2
        // a runtime tds_2 sarà di tipo AnonymousClasses$2
        // a compile time, comunque, il metodo translate sarà trovato
        // su tds_2 perchè tds_2 sarà di tipo AnonymousClasses$2 che lo conterrà come
        // membro (conterrà anche il membro SHAPE_TYPE)  
        var tds_2 = new TwoDShape() // a runtime quà sarà qualcosa come:
                                    // = new AnonymousClasses$2()
        {
            // membri nuovi
            public static final String SHAPE_TYPE = "2D";            
            public void translate() { System.out.println("Translate... Y"); }
            
            // membri sovrascritti
            public int area() { return 1; }
            public int perimeter() { return 1; }
            public void draw() { System.out.println("Draw... Y"); }     
        };
        
        // OK - AnonymousClasses$2 ha quel metodo...
        tds_2.translate();        
    }
}
