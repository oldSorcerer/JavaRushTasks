package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        private final List<Money> allMoney;
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<>();
            allMoney.add(new Hryvnia(52.4));
            allMoney.add(new USD(52.4));
            allMoney.add(new Ruble(52.4));
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}