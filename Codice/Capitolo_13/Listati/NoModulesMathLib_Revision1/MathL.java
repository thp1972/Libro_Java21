package MathLibrary;

public class MathL
{
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b)
    {
	  // ATTENZIONE: nessun uso della libreria di logging tinylog
        if (b == 0)
            throw new ArithmeticException
            ("Attenzione divisione per 0: il metodo non sarà eseguito!");
        return a / b;
    }
}

