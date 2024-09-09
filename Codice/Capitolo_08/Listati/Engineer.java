package LibroJava.Capitolo8;

public class Engineer extends Employee
{
    private int percentage;
    private int fixedAmount;

    public Engineer(String fn, String ln, int p, int f)
    {
        super(fn, ln);
        setPercentage(p);
        setFixedAmount(f);
    }

    public void setFixedAmount(int f) // imposto il fisso come paga
    {
        fixedAmount = f > 0 ? f : 0;
    }

    public void setPercentage(int p) // imposto la percentuale
    {
        percentage = p > 0 ? p : 0;
    }

    public int earning() // calcolo specializzato del guadagno
    {
        return fixedAmount + (fixedAmount * percentage / 100);
    }

    public String toString()
    {
        return super.toString() + " guadagna € ";
    }
}