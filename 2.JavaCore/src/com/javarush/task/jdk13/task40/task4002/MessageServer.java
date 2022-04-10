package com.javarush.task.jdk13.task40.task4002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MessageServer extends Thread {

    private final DatagramSocket socket;

    private final List<String> client4446Messages = new ArrayList<>();
    private final List<String> client4447Messages = new ArrayList<>();

    public MessageServer() throws SocketException {
        socket = new DatagramSocket(4445);
    }

    @Override
    public void run() {
        boolean running = true;

        try {
            while (running) {
                byte[] buf = new byte[256];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);

                String received = new String(packet.getData(), 0, packet.getLength());
                if (received.toLowerCase().startsWith("end")) {
                    running = false;
                }

                InetAddress clientAddress = packet.getAddress();
                int clientPort = packet.getPort();
                if (clientPort == 4446) {
                    client4446Messages.add(received);
                    buf = getBytes(client4447Messages);
                } else if (clientPort == 4447) {
                    client4447Messages.add(received);
                    buf = getBytes(client4446Messages);
                }
                packet = new DatagramPacket(buf, buf.length, clientAddress, clientPort);
                socket.send(packet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }

    private byte[] getBytes(List<String> messages) {
        byte[] result;
        if (messages.isEmpty()) {
            result = "Для вас нет новых сообщений.".getBytes(StandardCharsets.UTF_8);
        } else {
            StringBuilder builder = new StringBuilder("У вас " + messages.size() + " новых сообщений:\n");
            for (String message : messages) {
                builder.append(message).append("\n");
            }
            result = builder.toString().getBytes(StandardCharsets.UTF_8);
            messages.clear();
        }

        return result;
    }
}
