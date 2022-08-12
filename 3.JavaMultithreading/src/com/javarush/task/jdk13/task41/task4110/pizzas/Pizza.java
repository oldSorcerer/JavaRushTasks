package com.javarush.task.jdk13.task41.task4110.pizzas;

public class Pizza {
    private final PizzaType type;
    private final String dough;
    private final String sauce;
    private final String topping;

    public Pizza(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public PizzaType getType() {
        return type;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}
