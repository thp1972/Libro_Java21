package LibroJava.Capitolo12;

import com.pellegrinoprincipe.hardware.*;

public class ComputerClient
{
    public static void main(String[] args)
    {
        Computer c = new Computer(); // istanza di un oggetto Computer 
        c.setOS("GNU/LINUX");

        System.out.printf("OS = %s%n", c.getOS());
    }
}
