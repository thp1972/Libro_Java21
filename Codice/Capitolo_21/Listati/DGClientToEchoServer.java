package LibroJava.Capitolo21;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

class DGClientToEchoServer
{
    private DatagramSocket socket;
    private DatagramPacket receiving_packet;
    private DatagramPacket sending_packet;

    public DGClientToEchoServer() throws IOException
    {
        try
        {
            socket = new DatagramSocket();
            doProcessing();
        }
        finally { close(); }
    }

    private void doProcessing() throws IOException
    {
        String server_msg = "";

        do  // interazione col server
        {
            showMessage("CLIENT -> DIGITA DEL TESTO DA INVIARE AL SERVER");
            sendDataToServer(readFromInput());
            byte messages[] = new byte[200]; // impostazione buffer per la ricezione dei pacchetti
            receiving_packet = new DatagramPacket(messages, messages.length);
            socket.receive(receiving_packet); // in attesa della ricezione di un pacchetto
            server_msg = new String(receiving_packet.getData(), 0, receiving_packet.getLength());
            showMessage("SERVER HOST -> " + receiving_packet.getAddress() + " PORTA " + receiving_packet.getPort()
                        + " ECHO " + server_msg);

        }
        while (!server_msg.contains("BYE"));
    }

    private void showMessage(String msg) { System.out.println(msg); }

    private void sendDataToServer(DatagramPacket packet) throws IOException
    {
        socket.send(packet);
    }

    private void close() throws IOException
    {
        showMessage("CLIENT -> CHIUSURA CONNESSIONE SOCKET");
        if (socket != null) socket.close();
    }

    private DatagramPacket readFromInput() throws UnknownHostException
    {
        Scanner in = new Scanner(System.in); // preparo il messaggio da inviare
        String message = in.nextLine();
        byte data[] = message.getBytes();
        sending_packet = new DatagramPacket(data, data.length, InetAddress.getLocalHost(),
                                            30000);
        return sending_packet;
    }

    public static void main(String args[]) throws IOException
    {
        new DGClientToEchoServer();
    }
}
