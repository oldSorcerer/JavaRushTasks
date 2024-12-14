package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Waiter;
import com.javarush.task.task27.task2712.kitchen.Cook;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);

        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);

        Waiter waiter = new Waiter();
        cook.addObserver(waiter);

        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
    }
}
