package com.javarush.task.task15.task1530;

abstract public class DrinkMaker {

    public abstract void getRightCup();

    public abstract void putIngredient();

    public abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}
