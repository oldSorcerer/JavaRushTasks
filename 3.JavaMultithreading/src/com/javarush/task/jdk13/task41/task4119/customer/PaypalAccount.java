package com.javarush.task.jdk13.task41.task4119.customer;

public class PaypalAccount {
    private final String email;
    private final String password;

    public PaypalAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
