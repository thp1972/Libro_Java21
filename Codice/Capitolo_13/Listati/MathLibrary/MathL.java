package mathlibrary;

import org.pmw.tinylog.Logger;

public class MathL // Versione 0.1
{
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b)
    {
        if (b == 0)
        {
            Logger.info("Attenzione divisione per 0: il metodo non sarà eseguito!");
            throw new ArithmeticException();
        }
        return a / b;
    }
}
