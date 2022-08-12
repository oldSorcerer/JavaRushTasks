package com.javarush.task.jdk13.task42.task4201;

public class CompanyAccount {
    private Integer totalMoney;

    public CompanyAccount(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void addMoney(int money) {
        totalMoney += money;
    }
}
