package LibroJava.Capitolo9;

import java.util.ArrayList;

interface IEnumerate<T>
{
    T getElement(int ix);
}

interface ICompare<T>
{
    boolean bornBefore(T t1, T t2);
}

abstract class Dog
{
    protected String name;
    protected int age;
    public int getAge() { return age; }
    public String getName() { return name; }
}

class WhiteTerrier extends Dog
{
    public WhiteTerrier(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class GoldenRetriever extends Dog
{
    public GoldenRetriever(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 }

class DogComparer implements ICompare<Dog>
{
    public boolean bornBefore(Dog t1, Dog t2)
    {
        return t1.getAge() < t2.getAge();
    }
}

class MyList<T> extends ArrayList<T> implements IEnumerate<T>
{
    public void addElement(T el)
    {
        add(el);
    }

    public T getElement(int ix)
    {
        return get(ix);
    }
}

public class VarianceAndWildcards
{
    public static void main(String[] args) throws Exception
    {
        // DIMOSTRAZIONE DELLA CONTROVARIANZA -----------------------------------
        //
        // Ok - assegnamento lecito un DogComparer "è un" ICompare<Dog> perché
        // l'ha in effetti implementato
        ICompare<Dog> dc = new DogComparer();
        
        WhiteTerrier wt = new WhiteTerrier("Winter", 1);
        WhiteTerrier ot = new WhiteTerrier("Sammy", 4);
        GoldenRetriever gr = new GoldenRetriever("Sandy", 10);
        GoldenRetriever or = new GoldenRetriever("Joel", 14);
        
        // OK - un comparatore di Dog può comparare WhiteTerrier e GoldenRetriever
        // perché entrambi "sono" dei Dog
        System.out.printf("%s è nato prima di %s? [%b]%n", wt.getName(), gr.getName(),
                                                           dc.bornBefore(wt, gr));
        System.out.printf("%s è nato prima di %s? [%b]%n", wt.getName(), ot.getName(),
                                                           dc.bornBefore(wt, ot));
        
        // questa conversione è lecita, perché rendiamo tc controvariante
        // in effetti si sta assegnando dc che è di tipo ICompare<Dog> 
        // in tc che è di tipo ICompare<? super WhiteTerrier> e dunque la relazione
        // di sottotipo è invertita
        // ? potrà essere di tipo WhiteTerrier oppure un suo supertipo come Dog
        ICompare<? super WhiteTerrier> tc = dc;
        
        // un comparatore di Dog è sicuramente in grado di comparare dei WhiteTerrier
        // esso è infatti utilizzabile in modo "più generale" rispetto ai suoi casi
        // "più specifici" e dunque fornisce una certa flessibilità di impiego
        // l'invocazione del metodo è type safe e il compilatore non permetterà di
        // comparare oggetti di tipo diverso da WhiteTerrier
        tc.bornBefore(wt, ot);
        
        // anche qui la conversione è lecita... così come la comparazione
        ICompare<? super GoldenRetriever> gc = dc;
        gc.bornBefore(gr, or);        
        
        // DIMOSTRAZIONE DELLA COVARIANZA -------------------------------------------
        //
        // creo una lista di tipo MyList<WhiteTerrier> che implementa un'interfaccia
        // di tipo IEnumerate<WhiteTerrier>
        MyList<WhiteTerrier> wtl = new MyList<>();
        wtl.addElement(new WhiteTerrier("Luc", 3));
        wtl.addElement(new WhiteTerrier("Ric", 5));
        
        // è lecito assegnare wtl a eg perché di fatto eg "è un" IEnumerate<? extends Dog>
        // covariante e quindi come è valida tale relazione di sottotipo
        // WhiteTerrier <: Dog così è valida per
        // IEnumerate<WhiteTerrier> <: IEnumerate<? extends Dog>
        // ? potrà essere di tipo Dog oppure un suo sottotipo come WhiteTerrier
        IEnumerate<? extends Dog> eg = wtl;
        
        // è type safe ottenere l'elemento 0 di eg perché è, in effetti, di tipo
        // WhiteTerrier e può dunque essere assegnato ad a_dog di tipo Dog
        Dog a_dog = eg.getElement(0);
        System.out.println(a_dog.getName());
        
        // creo una lista di tipo MyList<GoldenRetriever> che implementa
        // un'interfaccia di tipo IEnumerate<GoldenRetriever>
        MyList<GoldenRetriever> grl = new MyList<>();
        grl.addElement(new GoldenRetriever("Andy", 4));
        grl.addElement(new GoldenRetriever("Puppy", 9));
        
        // è lecito riutilizzare IEnumerate<? extends Dog> che ora riferirà un
        // IEnumerate<GoldenRetriever> sempre possibile per effetto della covarianza
        eg = grl;
        a_dog = eg.getElement(0);

        System.out.println(a_dog.getName());        
    }        
}
