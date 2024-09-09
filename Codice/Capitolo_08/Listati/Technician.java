package LibroJava.Capitolo8;

class Technician extends Employee
{
    private static final int AMOUNT = 5;
    private int quantum = AMOUNT;
    private int pieces;
    private int fixedAmount;

    public Technician(String fn, String ln, int f, int p)
    {
        super(fn, ln);
        setFixedAmount(f);
        setPieces(p);
    }

    public void setFixedAmount(int f)
    {
        fixedAmount = f > 0 ? f : 0;
    }

    public void setPieces(int p) // pezzi da lavorare
    {
        pieces = p > 0 ? p : 0;
    }

    public int earning() // specializzazione della paga
    {
        return fixedAmount + (quantum * pieces);
    }

    public String toString()
    {
        return super.toString() + " guadagna € ";
    }
}
