package LibroJava.Capitolo20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Random;

public class ObjectStream
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        String first_names[] = { "Alba", "Mario", "Alfredo", "Michele" }; 
        String last_names[] = { "Chiara", "Rossi", "Alcala", "Mazza" }; 
        int ages[] = { 39, 33, 44, 66 };
    
        try (ObjectOutputStream oos =
            new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("Anagrafica.bin"))))
        {
            for (int i = 0; i < 4; i++) // scrivo in un formato binario i valori seguenti
            {
                oos.writeUTF(first_names[i]);
                oos.writeChar('\t');
                oos.writeUTF(last_names[i]);
                oos.writeChar('\t');
                oos.writeInt(ages[i]);
                oos.writeChar('\t');
                oos.writeInt(new Random().nextInt(20000)); // id registrazione
                oos.writeChar('\t');          
                oos.writeObject(Calendar.getInstance()); // data scrittura
            }
        }
        System.out.println("Scrittura completata!");

        try (ObjectInputStream ois = 
            new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream("Anagrafica.bin"))))
        {
            while (true) // leggo i valori binari
            {
                System.out.print(ois.readUTF());
                System.out.print(ois.readChar()); // legge il TAB
                System.out.print(ois.readUTF());
                System.out.print(ois.readChar()); // legge il TAB
                System.out.print(ois.readInt());
                System.out.print(ois.readChar()); // legge il TAB                
                System.out.print(ois.readInt());  // id registrazione
                System.out.print(ois.readChar()); // legge il TAB  
                System.out.print(((Calendar)ois.readObject()).getTime() + "\n"); // data                
            }
        }
        catch (EOFException exc){ System.out.println("Lettura completata!"); } 
    }
}
