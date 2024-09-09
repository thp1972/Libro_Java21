package LibroJava.Capitolo20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream
{
    public static void main(String[] args) throws IOException
    {
        String first_names[] = { "Alba", "Mario", "Alfredo", "Michele" }; 
        String last_names[] = { "Chiara", "Rossi", "Alcala", "Mazza" }; 
        int ages[] = { 39, 33, 44, 66 };
        
        try (DataOutputStream dos = 
            new DataOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("Anagrafica.bin"))))
        {
            for (int i = 0; i < 4; i++) // scrivo in un formato binario i valori seguenti 
            {
                dos.writeUTF(first_names[i]);
                dos.writeChar('\t');
                dos.writeUTF(last_names[i]);
                dos.writeChar('\t');
                dos.writeInt(ages[i]);
            }
        }
        System.out.println("Scrittura completata!");
        
        try (DataInputStream dis = 
            new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream("Anagrafica.bin"))))
        {
            while (true) // leggo i valori binari 
            {
                System.out.print(dis.readUTF());
                System.out.print(dis.readChar());
                System.out.print(dis.readUTF());
                System.out.print(dis.readChar());
                System.out.print(dis.readInt() + "\n");
            }
        }
        catch (EOFException exc) { System.out.println("Lettura completata!"); }        
    }
}
