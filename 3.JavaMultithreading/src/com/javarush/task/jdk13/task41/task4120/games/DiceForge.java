package com.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public class DiceForge {

    private int playersAmount;

    public final void start(int playersAmount) {
        this.playersAmount = playersAmount;

        System.out.println("""
                ------------------------------------------------------------------------------------------
                Подготовка к игре Грани судьбы:
                    - раскладываем карты подвигов по островам;
                    - раздаем игрокам планшеты героя, маркеры ресурсов, фишку героя, два стартовых кубика;
                    - готовим поле храма.""");
        System.out.println("Игроки бросают кубики, апгрейдят кубики, бросают кубики, совершают подвиги, бросают кубики...");
        System.out.println("Закончился последний раунд, время подсчитать очки славы.");
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }
}
