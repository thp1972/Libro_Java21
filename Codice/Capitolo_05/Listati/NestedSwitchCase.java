package LibroJava.Capitolo5;

public class NestedSwitchCase
{
    public static void main(String[] args)
    {
        int exp_1 = 2, exp_2 = 1;

        // confronta exp_1 
        switch (exp_1)
        {
            case 1:
                System.out.printf("exp_1 = %d%n", exp_1);
                break;
            case 2:
                // confronta exp_2 nello switch annidato 
                switch (exp_2)
                {
                    case 1: // qua nessun conflitto con case 1: della switch che annida
                        System.out.printf("exp_1 = %d ed exp_2 = %d%n", exp_1, exp_2);
                        break;
                }
        }
    }
}
