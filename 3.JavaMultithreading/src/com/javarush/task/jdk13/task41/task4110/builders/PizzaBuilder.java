package com.javarush.task.jdk13.task41.task4110.builders;

import com.javarush.task.jdk13.task41.task4110.pizzas.Pizza;
import com.javarush.task.jdk13.task41.task4110.pizzas.PizzaType;

public class PizzaBuilder implements Builder {

    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;



    public Pizza getResult() {
        return new Pizza(type, dough, sauce, topping);
    }

    @Override
    public void setType(PizzaType type) {
        this.type = type;
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setTopping(String topping) {
        this.topping = topping;
    }
}
