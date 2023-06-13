package com.javarush.task.jdk13.task41.task4119.strategy;

public class PaypalStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        // много важного кода
        System.out.printf("Оплачено товаров на $%d с помощью Paypal.\n", amount);
    }
}
