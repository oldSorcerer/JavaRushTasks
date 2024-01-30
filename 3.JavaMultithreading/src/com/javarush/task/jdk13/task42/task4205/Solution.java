package com.javarush.task.jdk13.task42.task4205;

import java.util.Random;
import java.util.concurrent.DelayQueue;

/* 
Очередь сообщений
*/

public class Solution {
    private static final DelayQueue<Message> QUEUE = new DelayQueue<>();
    private static final int COUNT = 10;
    private static final long MULTIPLIER = 100;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= COUNT; i++) {
            long lifetime = getRandomInt(1, COUNT) * MULTIPLIER;
            Message message = new Message(i, "test " + i, lifetime);
            QUEUE.offer(message);
            System.out.println("Сообщение id#" + message.getMessageId() +
                    " добавлено в очередь, срок хранения истекает через " + message.getLifetime() + " мс");
        }

        while (!QUEUE.isEmpty()) {
            try {
                Message message = QUEUE.take();
                System.out.println("Сообщение id#" + message.getMessageId() +
                        ". Срок хранения (" + message.getLifetime() + " мс) истек! Сообщение удалено из очереди сообщений");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
