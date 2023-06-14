package com.javarush.task.jdk13.task41.task4119.shop;

import com.javarush.task.jdk13.task41.task4119.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private PaymentStrategy strategy;
    private final List<Item> items = new ArrayList<>();

    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay() {
        int amount = calculateTotal();
        strategy.pay(amount);
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
