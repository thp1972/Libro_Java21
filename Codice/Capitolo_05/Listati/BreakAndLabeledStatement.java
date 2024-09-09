package LibroJava.Capitolo5;

public class BreakAndLabeledStatement
{
    public static void main(String[] args)
    {
        String output = "";

        nr:
        for (int row = 1; row <= 5; row++)
        {
            for (int col = 1; col <= 10; col++)
            {
                if (col == 5)
                    break nr;
                output += "#";
            }       
        }
        System.out.println(output);
    }
}
