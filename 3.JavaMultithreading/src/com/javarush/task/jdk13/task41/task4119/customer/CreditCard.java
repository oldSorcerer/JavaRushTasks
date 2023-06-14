package com.javarush.task.jdk13.task41.task4119.customer;

import java.time.LocalDate;

public class CreditCard {
    private final String number;
    private final String name;
    private final int cvv;
    private final LocalDate expiryDate;

    public CreditCard(String number, String name, int cvv, LocalDate expiryDate) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getCvv() {
        return cvv;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
