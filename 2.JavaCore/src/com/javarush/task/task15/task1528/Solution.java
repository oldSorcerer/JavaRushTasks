package com.javarush.task.task15.task1528;

/* 
ООП. Hryvnia — тоже деньги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    public static class Hryvnia extends Money {
        private final double amount = 123d;

        @Override
        public Hryvnia getMoney() {
            return this;
        }

        @Override
        public Double getAmount() {
            return amount;
        }
    }
}
