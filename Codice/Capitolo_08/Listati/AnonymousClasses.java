package LibroJava.Capitolo8;

public class AnonymousClasses
{
    public static void doShape(TwoDShape s) // mostra l'area e il perimetro 
                                            // di un oggetto TwoDShape 
    {
        System.out.printf("Area: %d Perimetro: %d%n", s.area(), s.perimeter());
    }

    public static void doEmployee(Employee e) // mostra quanto guadagna un Employee 
    {
        System.out.printf("%s vorrebbe guadagnare %d€%n", e, e.earning());
    }

    public static void main(String[] args)
    {
        doShape(new TwoDShape() // classe anonima che implementa l'interfaccia TwoDShape 
        {
            public int area() { return 0; }
            public int perimeter() { return 0; }
            public void draw() { System.out.println("Draw... X");}
        });

        class A_Shape implements TwoDShape // metodo alternativo 
                                           // con l'uso di una classe locale 
        { 
            public int area() { return 1; } 
            public int perimeter() { return 1; } 
            public void draw() { System.out.println("Draw... Y"); } 
        } 
        A_Shape i = new A_Shape(); 
        doShape(i); 
        
        doEmployee(new Employee("Pellegrino", "Principe") // classe anonima che eredita 
                                                          // dalla classe Employee 
        { 
            public int earning() { return 40000;} 
        }); 
        
        class An_Employee extends Employee // metodo alternativo 
                                           // con l'uso di una classe locale 
        { 
            public An_Employee(String first_name, String last_name) { super(first_name, last_name); } 
            public int earning() { return 60000; } 
        } 
        An_Employee e = new An_Employee("Pellegrino", "Principe"); 
        doEmployee(e); 
     }
}
