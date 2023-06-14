package com.javarush.task.jdk13.task41.task4119.strategy;

import com.javarush.task.jdk13.task41.task4119.customer.Customer;

public class PaypalStrategy implements PaymentStrategy {
    private final String email;
    private final String password;

    public PaypalStrategy(Customer customer) {
        email = customer.getEmail();
        password = customer.getPaypalPassword();
    }

    @Override
    public void pay(int amount) {
        // много важного кода
        System.out.printf("Оплачено товаров на $%d с помощью Paypal.\n", amount);
    }
}
