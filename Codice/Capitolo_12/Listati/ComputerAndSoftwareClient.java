package LibroJava.Capitolo12;

import com.pellegrinoprincipe.hardware.*;
import com.pellegrinoprincipe.software.*;
import com.pellegrinoprincipe.software.Software.Graphic;

public class ComputerAndSoftwareClient
{
    public static void main(String[] args)
    {
        Computer c = new Computer(); // istanza di un oggetto Computer 
        c.setOS("GNU/LINUX");
        System.out.printf("OS = %s%n", c.getOS());

        Software s = new Software(); // istanza di un oggetto Software 
        Graphic g = Graphic.PHOTOSHOP;
        s.setGraphic(g);
        System.out.printf("SOFTWARE = %s%n", s.getGraphic());
    }
}
