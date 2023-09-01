package com.javarush.task.task38.task3809;

import lombok.Getter;

public class JavaRushBankAccount {

    private final String ownerName;

    @Getter
    @LongPositive
    private long amount;

    public JavaRushBankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
