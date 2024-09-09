package LibroJava.Capitolo10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class CheckingAccount // non ereditabile 
{
    // immodificabili 
    public final String name;
    public final String bank;
    public final String city;
    private final List<Integer> accounts;

    public CheckingAccount(String name, String bank, String city, List<Integer> accounts)
    {
        this.name = name;
        this.bank = bank;
        this.city = city;
        this.accounts = accounts;
    }

    public final List<Integer> getAccounts()
    {
        // vista della collezione immodificabile 
        return Collections.unmodifiableList(accounts);
    }

    public CheckingAccount orderAccounts()
    {
        // accounts sorted e l'originale non è modificato 
        List<Integer> copy = new ArrayList<>(accounts);
        Collections.sort(copy);
        return new CheckingAccount(name, bank, city, copy);
    }
}

public class Immutability
{
    public static void main(String[] args)
    {
        CheckingAccount MrRossi = new CheckingAccount("Rossi", "FixaBank", "Rome",
                                                      Arrays.asList(98856, 34556, 78999));

        // error: cannot assign a value to final variable bank 
        // MrRossi.bank = "AcmeBank";

        // Exception in thread "main" java.lang.UnsupportedOperationException
        // MrRossi.getAccounts().clear();
        
        System.out.print("Conti Nr. ");
        System.out.println(MrRossi.getAccounts());

        System.out.print("Conti Nr. ");
        System.out.println(MrRossi.orderAccounts().getAccounts());
    }
}
