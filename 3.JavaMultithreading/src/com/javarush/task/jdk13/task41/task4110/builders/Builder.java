package com.javarush.task.jdk13.task41.task4110.builders;

import com.javarush.task.jdk13.task41.task4110.pizzas.PizzaType;

public interface Builder {

    void setType(PizzaType type);

    void setDough(String dough);

    void setSauce(String sauce);

    void setTopping(String topping);

}
