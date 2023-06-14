package com.javarush.task.jdk13.task41.task4119.strategy;

import com.javarush.task.jdk13.task41.task4119.customer.Customer;

import java.time.LocalDate;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private final String cardNumber;
    private int cvv;
    private LocalDate expiryDate;

    public CreditCardStrategy(Customer customer) {
        name = customer.getName();
        cardNumber = customer.getCardNumber();
        cvv = customer.getCardCvv();
        expiryDate = customer.getCardExpiryDate();
    }

    @Override
    public void pay(int amount) {
        // много важного кода
        System.out.printf("Оплачено товаров на $%d кредитной картой %s.\n", amount, cardNumber);
    }
}
