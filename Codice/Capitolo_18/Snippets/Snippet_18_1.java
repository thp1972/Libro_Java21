package LibroJava.Capitolo18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Snippet_18_1
{
    public static void main(String[] args)
    {
        String os[] =
        {
            "GNU/Linux", "Windows 7", "Solaris", "Amiga OS", "FreeBSD",
            "Mac OS X"
        };

        LinkedList<String> al_operating_systems = new LinkedList<>(Arrays.asList(os));
        List<String> sync_al_operating_systems = 
        Collections.synchronizedList(al_operating_systems);
        
        synchronized (sync_al_operating_systems)
        {
            Iterator<String> it = sync_al_operating_systems.iterator();
            while (it.hasNext())
                it.next(); // fai qualcosa...
        }
    }
}