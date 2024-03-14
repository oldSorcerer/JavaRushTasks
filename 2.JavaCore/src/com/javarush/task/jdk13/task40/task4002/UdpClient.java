package com.javarush.task.jdk13.task40.task4002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    private final DatagramSocket socket;
    private final InetAddress serverAddress;
    private final int serverPort;

    public UdpClient(int port) throws IOException {
        socket = new DatagramSocket(port);
        serverAddress = InetAddress.getByName("localhost");
        serverPort = 4445;
    }

    public String sendReceive(String message) throws IOException {
        socket.connect(serverAddress, serverPort);
        DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(), message.length());
        socket.send(datagramPacket);

        socket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();

        String string = new String(data);
        return string;
    }

    public void close() {
        socket.close();
    }
}
