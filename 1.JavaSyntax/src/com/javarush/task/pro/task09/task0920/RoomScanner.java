package com.javarush.task.pro.task09.task0920;

import java.util.Random;

public class RoomScanner {

    private static final Random random = new Random();
    private static final String[] pirates = {"pirate", "yunga", "kok", "skipper", "bosun", "parrot"};

    public static String[] scanRoom(String roomName) {
        System.out.printf("Сканируется %s...\n", roomName);

        String[] room = NimrodAi.getRoomByName(roomName);
        if (room == null || random.nextBoolean()) {
            return room;
        }

        int itemsToRemoveNumber = room.length % (random.nextInt(3) + 1);
        int piratesNumber = random.nextInt(4);
        int resultSize = room.length - itemsToRemoveNumber + piratesNumber;

        String[] result = new String[resultSize];
        System.arraycopy(room, 0, result, 0, room.length - itemsToRemoveNumber);
        for (int i = 0; i < piratesNumber; i++) {
            result[resultSize - 1 - i] = pirates[random.nextInt(pirates.length)];
        }

        return result;
    }
}
