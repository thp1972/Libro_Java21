package LibroJava.Capitolo21;

import static java.lang.System.out;
import java.net.Inet4Address; 
import java.net.InetAddress; 
import java.net.InterfaceAddress; 
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.List;

public class DetailedInfoNIC
{
    public static void main(String[] args)
    {
        try
        {
            // ritorna la NIC con il nome indicato 
            NetworkInterface nic = NetworkInterface.getByName("wlan0");
            if (nic != null)
            {
                out.printf("Nome NIC: %s%n", nic.getDisplayName());

                byte ott[] = nic.getHardwareAddress(); // MAC address 

                if (ott != null)
                    out.format("Mac address: %02X-%02X-%02X-%02X-%02X-%02X\n",
                               ott[0], ott[1], ott[2], ott[3], ott[4], ott[5]);

                out.printf("È UP ? %b%n", nic.isUp());
                out.printf("È una sub-interfaccia ? %b%n", nic.isVirtual());

                List<InterfaceAddress> ia = nic.getInterfaceAddresses(); // indirizzi associati alla NIC 
                for (InterfaceAddress one_ia : ia)
                {
                    InetAddress addr = one_ia.getAddress();
                    String ip = addr.getHostAddress();

                    int prefix = one_ia.getNetworkPrefixLength();
                    boolean ipv4 = addr instanceof Inet4Address;

                    out.println("IP: " + ip + "/" + prefix);
                    if (ipv4)
                    {
                        String broadcast_addr = one_ia.getBroadcast().getHostAddress();
                        out.println("Broadcast address: " + broadcast_addr);
                    }
                }
            }
            else out.println("NIC non trovata!");
        }
        catch (SocketException ex) { System.out.println(ex.getMessage()); }
    }
}
