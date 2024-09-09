package LibroJava.Capitolo10;

import java.util.function.IntPredicate;

class ClassA // PROPRIO SCOPE - OUTER SCOPE 
{
    public static final int NUMBER = 10;
}

class ClassB // PROPRIO SCOPE - OUTER SCOPE 
{
    public static final int NUMBER = 100;
}

class ClassC // PROPRIO SCOPE - OUTER SCOPE 
{
    public static final int SIZE = 1000;

    public static class ClassD // PROPRIO SCOPE - INNER SCOPE 
    {
        // OK - nasconde SIZE di ClassC 
        public static final int SIZE = 2000;
    }
}

class ClassE // PROPRIO SCOPE - OUTER SCOPE 
{
    private int width = 55;
    private String prefix = "###";

    public void setWidth(int width) // PROPRIO SCOPE - INNER SCOPE 
    {
        // qui è usato il parametro width che nasconde la variabile d'istanza width 
        int w = width;

        // qui è usata la variabile d'istanza width tramite l'uso di this 
        int w2 = this.width;

        // prefix di ClassE è nascosta dalla variabile locale prefix 
        String prefix = ";;;";
        System.out.printf("In setWidth prefix è: %s%n", prefix);
    }
}

class ClassF // PROPRIO SCOPE - OUTER SCOPE 
{
    private int flag = -1;
    private int value = 100;

    // LAMBDA EXPRESSION ANNIDATA NELLA CLASSE 
    // (int) -> boolean
    private IntPredicate i_pred = (int flag) -> // PROPRIO SCOPE - INNER SCOPE 
    {
        // il parametro flag nasconde la variabile d'istanza flag 
        int _f = flag;

        // la variabile locale value nasconde la variabile d'istanza value 
        int value = 200;
        return value == _f;
    };

    public boolean test(int f)
    {
        return i_pred.test(f);
    }
}

class ClassG // PROPRIO SCOPE - OUTER SCOPE 
{
    private int flag = 100;
    private int value = 200;
    private int counter = 400;

    public void test(int flag) // PROPRIO SCOPE - INNER SCOPE 
    {
        int inc = 10;

        // CLASSE LOCALE 
        IntPredicate p1 = new IntPredicate() // PROPRIO SCOPE 
        {
            public boolean test(int value)
            {
                // inc nasconde la variabile locale inc del metodo test 
                // se avessimo invece scritto nell'ambito di test qualcosa come
                // inc = 33 
                // avremmo avuto il seguente errore: 
                // local variables referenced from an inner class 
                // must be final or effectively final 
                int inc = 33;

                // qui value nasconde la variabile d'istanza value 
                return value + inc == flag;
            }
        };
        System.out.println("Test del predicato p1 = " + p1.test(flag));

        // LAMBDA EXPRESSION 
        IntPredicate p2 = value -> // NO SCOPE PROPRIO!!! 
        {
            // inc non può essere dichiarata perché già dichiarata nel metodo test 
            // int inc = 33; 
            // se avessimo inoltre scritto qualcosa come
            // inc = 33 
            // avremmo avuto il seguente errore: 
            // local variables referenced from a lambda expression 
            // must be final or effectively final 

            // OK - la restrizione final non opera per i campi di una classe 
            counter += 200;

            // qui value nasconde la variabile d'istanza value 
            return value + counter == flag;
        };
        System.out.println("Test del predicato p2 = " + p2.test(flag));
    }
}

public class ScopingRules
{
    public static void main(String[] args)
    {
        // OK - lo stesso nome NUMBER può apparire in scope differenti 
        // si riferisce a entità distinte 
        // qui lo riferiamo qualificandolo con la classe di appartenenza 
        System.out.printf("ClassA.NUMBER = %d; ClassB.NUMBER = %d%n", ClassA.NUMBER, ClassB.NUMBER);

        System.out.printf("ClassC.SIZE = %d; ClassD.SIZE = %d%n", ClassC.SIZE, ClassC.ClassD.SIZE);

        new ClassE().setWidth(300);

        System.out.printf("Valore del test grazie a i_pred = %b%n", new ClassF().test(100));
        
        new ClassG().test(100); 
    }
}
