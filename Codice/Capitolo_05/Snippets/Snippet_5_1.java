package LibroJava.Capitolo5;

public class Snippet_5_1
{
    public static void main(String[] args)
    { // compound statements

        if (10 == 10)
            ; // empty statement

        // declaration statement
        int j = 11;

        // Per Java, sono expression statement:
        // 1) gli assegnamenti         --> a = 10;
        // 2) i pre-incrementi         --> ++a;
        // 3) i pre-decrementi         --> --a;
        // 4) i post-incrementi        --> a++;
        // 5) i post-decrementi        --> a--;
        // 6) le invocazioni di metodo --> foo(); 
        // 7) le creazioni di istanze  --> new Type();
        j++; // expression statement
      
        EXIT: // label
        for (int a = 0; a < 100; a++) // labeled statement  
        {
            for (int b = 0; b < 200; b++)
            {
                for (int c = 0; c < 300; c++)
                {
                    if (c == 150) break EXIT;
                }
            }
        }
    }
}
