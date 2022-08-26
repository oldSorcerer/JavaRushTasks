package com.javarush.task.jdk13.task40.task4002;

import java.io.IOException;

/* 
UDP сервер и клиент
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        new MessageServer().start();
        UdpClient client1 = new UdpClient(4446);
        UdpClient client2 = new UdpClient(4447);

        System.out.println(client1.sendReceive("111111111"));
        System.out.println(client1.sendReceive("222222222"));
        System.out.println(client1.sendReceive("333333333"));
        System.out.println(client1.sendReceive("444444444"));

        System.out.println(client2.sendReceive("qqqqqqq"));

        System.out.println(client1.sendReceive("55555555"));
        System.out.println(client1.sendReceive("end"));

        client1.close();
        client2.close();
    }
}
