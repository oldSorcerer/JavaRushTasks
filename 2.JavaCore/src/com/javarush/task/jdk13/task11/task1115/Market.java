package com.javarush.task.jdk13.task11.task1115;

import java.util.ArrayList;
import java.util.List;

/* 
Агрегация 2
*/

public class Market {
    private final String name;
    private List<Product> products;

    public Market(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }
}
