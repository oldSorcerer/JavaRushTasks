package com.javarush.task.pro.task09.task0923;

import java.util.Random;

public class CaptainBridge {

    private static boolean slave;
    private static boolean guest;
    private static boolean fighter;
    private static boolean veteran;
    private static boolean cartographer;
    private static boolean captain;
    private static boolean Steve;

    private static int attemptsCounter = 1;

    static {
        switch (new Random().nextInt(7)) {
            case 0 -> slave = true;
            case 1 -> guest = true;
            case 2 -> fighter = true;
            case 3 -> veteran = true;
            case 4 -> cartographer = true;
            case 5 -> captain = true;
            case 6 -> Steve = true;
        }
    }

    public static void checkAccess(String accessRank) {
        if (attemptsCounter <= 0) {
            System.out.println("⏰⏰⏰ ТРЕВОГА!!! Попытка несанкционированного проникновения! ⏰⏰⏰");
        } else {
            attemptsCounter--;
            if (getAccessibilityByRank(accessRank)) {
                System.out.printf("Добро пожаловать на капитанский мостик, %s.\n", accessRank);
            } else {
                System.out.printf("У ранга %s нет доступа на капитанский мостик!\n", accessRank);
            }
        }
    }

    private static boolean getAccessibilityByRank(String rank) {
        return switch (rank) {
            case "Раб" -> slave;
            case "Гость" -> guest;
            case "Боец" -> fighter;
            case "Ветеран" -> veteran;
            case "Картографист" -> cartographer;
            case "Капитан" -> captain;
            case "Стив" -> Steve;
            default -> false;
        };
    }

    public static boolean debugAccess(String accessRank) {
        return getAccessibilityByRank(accessRank);
    }
}
