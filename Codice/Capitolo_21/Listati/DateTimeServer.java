package LibroJava.Capitolo21;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer
{
    private ServerSocket server_socket;
    private Socket socket;
    private ObjectOutputStream output_stream;
    private ObjectInputStream input_stream;

    public DateTimeServer() throws IOException, ClassNotFoundException
    {
        try // creo il server socket in ascolto sulla porta 29999 
            // con una coda di massimo 10 client 
        {
            server_socket = new ServerSocket(29999, 10);
            while (true)
            {
                listen();
                createStreams();
                initProcessing();
            }
        }
        finally { close(); }
    }

    private void listen() throws IOException
    {
        showMessage("SERVER -> IN ATTESA DI CONNESSIONI...");
        socket = server_socket.accept(); // pongo il server in attesa di connessioni 
        showMessage("SERVER -> CONNESSO CON " + socket.getInetAddress()
                    + " ALLA PORTA REMOTA "
                    + socket.getPort() + " E ALLA PORTA LOCALE "
                    + socket.getLocalPort());
    }

    private void createStreams() throws IOException
    {
        output_stream = new ObjectOutputStream(socket.getOutputStream());
        output_stream.flush();
        input_stream = new ObjectInputStream(socket.getInputStream());
        showMessage("SERVER -> STREAM CREATI");
    }

    private void initProcessing() throws IOException, ClassNotFoundException
    {
        String client_msg = "";
        client_msg = (String) input_stream.readObject();
        showMessage(client_msg);
        sendDataToClient("SERVER -> " + getDayTime());
    }

    private void showMessage(String msg) { System.out.println(msg); }

    private void sendDataToClient(String msg) throws IOException
    {
        output_stream.writeObject(msg);
        output_stream.flush();
    }

    private void close() throws IOException
    {
        showMessage("SERVER -> CHIUSURA CONNESSIONE SOCKET");
        if (output_stream != null && input_stream != null && socket != null)
        {
            output_stream.close();
            input_stream.close();
            socket.close();
        }
    }

    private String getDayTime() { return new Date().toString(); }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        new DateTimeServer();
    }
}
