package LibroJava.Capitolo9;

class Stack { } // una classe non generica
class StackGen<T> { } // una classe generica con un parametro di tipo
class Dictionary<K, V> { } // una classe generica con due parametri di tipo

// un tipo generico che deriva da un tipo concreto, ossia da un tipo non generico
class MyStack_1<T> extends Stack { }

// un tipo generico che deriva da un tipo parametrizzato
class MyStack_2<T> extends StackGen<Integer> { }

// un tipo generico che deriva da un tipo generico
class MyStack_3<T> extends StackGen<T> { }

// un tipo non generico che deriva da un tipo parametrizzato
class MyStack_4 extends StackGen<Integer> { }

// ERRORE - per un tipo non generico non è possibile derivare da un tipo generico
// senza passargli almeno un argomento di tipo
// error: cannot find symbol ... symbol: class T
class MyStack_5 extends StackGen<T> { }

// OK - è possibile derivare da un tipo generico fornendo solo un argomento di tipo
class MyDictionary_1<K> extends Dictionary<K, Integer> { }

// ERRORE - se non si fornisce almeno un argomento di tipo si deve fornire 
// anche l'altro parametro di tipo
// error: cannot find symbol ... symbol: class V
class MyDictionary_3<K> extends Dictionary<K, V> { }

// OK - è possibile derivare da un tipo generico ma bisogna fornirgli tutti gli
// argomenti di tipo se ne ha più di uno
class MyDictionary_4 extends Dictionary<String, Integer> { }

public class Snippet_9_6
{
    public static void main(String[] args)
    {
        
    }
}
