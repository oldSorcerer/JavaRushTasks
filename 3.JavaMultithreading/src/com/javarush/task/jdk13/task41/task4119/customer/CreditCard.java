package com.javarush.task.jdk13.task41.task4119.customer;

import java.time.LocalDate;

public class CreditCard {
    private String number;
    private String name;
    private int cvv;
    private LocalDate expiryDate;

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
