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

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), serverAddress, serverPort);
        socket.send(packet);

        DatagramPacket pack = new DatagramPacket(new byte[1024], 1024);
        socket.receive(pack);

        return new String(pack.getData(), 0, pack.getLength());
    }

    public void close() {
        socket.close();
    }
}
