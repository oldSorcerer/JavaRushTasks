package com.javarush.task.task15.task1530;

public class TeaMaker extends DrinkMaker{
    @Override
    protected void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    protected void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    protected void pour() {
        System.out.println("Заливаем кипятком");
    }
}
