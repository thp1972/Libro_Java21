package LibroJava.Capitolo21;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URLContent extends JFrame
{
    private JLabel lbl_img;
    private ImageProducer the_image;

    public URLContent() throws MalformedURLException, IOException
    {
        super("URLContent DEMO");
        String res
               = "http://www.pellegrinoprincipe.com/img/c_guida_alla_programmazione_pub.png";

        URL url = new URL(res);
        URLConnection u_conn = url.openConnection(); // ottieni l'immagine 
        Object o = u_conn.getContent();

        // se sei un ImageProducer allora assegna l'immagine scaricata alla label 
        if (o instanceof ImageProducer)
        {
            the_image = (ImageProducer) o;
            Image img = Toolkit.getDefaultToolkit().createImage(the_image);
            ImageIcon img_icon = new ImageIcon(img);
            lbl_img = new JLabel(img_icon);
        }
        else
            lbl_img = new JLabel("Immagine non rilevabile....");

        add(lbl_img, BorderLayout.CENTER);
    }

    public static void main(String[] args) throws MalformedURLException, IOException
    {
        URLContent window = new URLContent();
        window.setSize(500, 620);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}
