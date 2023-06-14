package com.javarush.task.jdk13.task41.task4120.games;

public class DiceForge extends BoardGame {

    @Override
    protected void initialize() {
        System.out.println("""
                ------------------------------------------------------------------------------------------
                Подготовка к игре Грани судьбы:
                    - раскладываем карты подвигов по островам;
                    - раздаем игрокам планшеты героя, маркеры ресурсов, фишку героя, два стартовых кубика;
                    - готовим поле храма.""");
    }

    @Override
    protected void play() {
        System.out.println("Игроки бросают кубики, апгрейдят кубики, бросают кубики, совершают подвиги, бросают кубики...");
    }

    @Override
    protected void end() {
        System.out.println("Закончился последний раунд, время подсчитать очки славы.");
    }
}
