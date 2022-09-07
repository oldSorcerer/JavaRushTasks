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
        int randomFactor = new Random().nextInt(7);
        switch (randomFactor) {
            case 0:
                slave = true;
                break;
            case 1:
                guest = true;
                break;
            case 2:
                fighter = true;
                break;
            case 3:
                veteran = true;
                break;
            case 4:
                cartographer = true;
                break;
            case 5:
                captain = true;
                break;
            case 6:
                Steve = true;
                break;
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
        boolean accessibility = false;
        switch (rank) {
            case "Раб":
                accessibility = slave;
                break;
            case "Гость":
                accessibility = guest;
                break;
            case "Боец":
                accessibility = fighter;
                break;
            case "Ветеран":
                accessibility = veteran;
                break;
            case "Картографист":
                accessibility = cartographer;
                break;
            case "Капитан":
                accessibility = captain;
                break;
            case "Стив":
                accessibility = Steve;
                break;
        }

        return accessibility;
    }

    public static boolean debugAccess(String accessRank) {
        return getAccessibilityByRank(accessRank);
    }
}
