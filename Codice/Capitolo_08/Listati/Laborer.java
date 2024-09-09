package LibroJava.Capitolo8;

class Laborer extends Employee
{
    private static final int AMOUNT = 8;
    private int[] percentage = { 2, 5, 8, 11 };
    private int hourlyPay = AMOUNT;
    private int hoursWorked;
    private int pieces;

    public Laborer(String fn, String ln, int p, int h)
    {
        super(fn, ln);
        setPieces(p);
        setHoursWorked(h);
    }

    public void setHoursWorked(int h) // imposto le ore lavorate
    {
        hoursWorked = h > 0 ? h : 0;
    }

    public void setPieces(int p) // imposto i pezzi da lavorare
    {
        pieces = p >= 0 && p <= 3 ? p : -1;
    }

    public int earning() // specializzazione del calcolo della paga
    {
        int p = 0;
        if (hoursWorked > 0)
        {
            p = hoursWorked * hourlyPay;
            if (pieces != -1)
                p += (p * percentage[pieces] / 100);
            return p;
        }
        else
            return 0;
    }

    public String toString()
    {
        return super.toString() + " guadagna € ";
    }
}
