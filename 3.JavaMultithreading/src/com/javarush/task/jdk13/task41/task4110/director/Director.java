package com.javarush.task.jdk13.task41.task4110.director;

import com.javarush.task.jdk13.task41.task4110.builders.Builder;
import com.javarush.task.jdk13.task41.task4110.pizzas.PizzaType;

public class Director {

    public void makeHawaiianPizza(Builder builder){
        builder.setType(PizzaType.HAWAIIAN);
        builder.setDough("обычное");
        builder.setSauce("мягкий");
        builder.setTopping("ветчина + ананас");
    }

    public void makeSpicyPizza(Builder builder) {
        builder.setType(PizzaType.SPICY);
        builder.setDough("запеченное");
        builder.setSauce("острый");
        builder.setTopping("пепперони + салями");
    }
}
