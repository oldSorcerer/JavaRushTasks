package com.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public class Catan {

    private int playersAmount;

    public final void start(int playersAmount) {
        this.playersAmount = playersAmount;

        System.out.println("""
                ---------------------------------------------------------
                Подготовка к игре Колонизаторы:
                    - составляем остров для колонизации;
                    - раздаем игрокам фигурки поселений, городов и дорог;
                    - раскладываем колоды сырья и развития.""");
        System.out.println("Игроки колонизируют остров, торгуют ресурсами, воруют ресурсы, интригуют и строят козни...");
        System.out.println("Один из игроков набрал 10 победных очков.");
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }
}
