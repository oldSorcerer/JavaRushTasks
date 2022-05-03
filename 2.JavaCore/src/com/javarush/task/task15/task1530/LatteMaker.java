package com.javarush.task.task15.task1530;

public class LatteMaker extends DrinkMaker {
    @Override
    protected void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    protected void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }

    @Override
    protected void pour() {
        System.out.println("Заливаем кофе");
    }
}
