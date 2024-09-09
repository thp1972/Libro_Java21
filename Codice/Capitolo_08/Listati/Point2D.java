package LibroJava.Capitolo8;

public record Point2D(int x, int y)
{
    // overriding di toString
    public String toString()
    {
        return "[ " + x + " , " + y + " ]";
    }
}