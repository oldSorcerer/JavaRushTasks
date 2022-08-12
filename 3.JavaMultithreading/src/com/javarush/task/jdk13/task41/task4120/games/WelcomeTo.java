package com.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public class WelcomeTo {

    private int playersAmount;

    public final void start(int playersAmount) {
        this.playersAmount = playersAmount;

        System.out.println("""
                -----------------------------------------------------
                Подготовка к игре Бумажные кварталы:
                    - раздаем игрокам игровые поля и шариковые ручки;
                    - случайным образом выбираем три плана застройки;
                    - подготавливаем три стопки карт строительства.""");
        System.out.println("Игроки строят жилые кварталы с парками и бассейнами, нанимают торговых агентов и гастарбайтеров.");
        System.out.println("Один из игроков выполнил все три плана застройки.");
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }
}
