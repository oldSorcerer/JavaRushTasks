package com.javarush.task.jdk13.task41.task4120.games;

public class Catan extends BoardGame {

    @Override
    protected void initialize() {
        System.out.println("""
                ---------------------------------------------------------
                Подготовка к игре Колонизаторы:
                    - составляем остров для колонизации;
                    - раздаем игрокам фигурки поселений, городов и дорог;
                    - раскладываем колоды сырья и развития.""");
    }

    @Override
    protected void play() {
        System.out.println("Игроки колонизируют остров, торгуют ресурсами, воруют ресурсы, интригуют и строят козни...");
    }

    @Override
    protected void end() {
        System.out.println("Один из игроков набрал 10 победных очков.");
    }
}
