package LibroJava.Capitolo21;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCreator
{
    public static void main(String[] args) throws MalformedURLException
    {
        // ATTENZIONE - gli URL indicati non esistono realmente
        URL a_url = new URL("http://www.pellegrinoprincipe.com:801/JAVASCRIPT/elaJa_V0.1/index.html");
        URL r_url = new URL(a_url, "about/index.html");
        URL param_url = new URL("http", "www.pellegrinoprincipe.com", "index.html");

        // ottieni le singole parti dell'URL 
        System.out.printf("PROTOCOLLO: %s%nHOST: %s%nAUTHORITY: %s%nPATH: %s%n", 
                          r_url.getProtocol(), r_url.getHost(), r_url.getAuthority(),
                          r_url.getPath());
    }
}
