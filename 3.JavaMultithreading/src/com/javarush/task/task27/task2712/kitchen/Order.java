package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.Tablet;

import java.util.List;

public class Order {

    protected List<Dish> dishes;
    private final Tablet tablet;

    public Order(Tablet tablet) {
        this.tablet = tablet;
    }
}
