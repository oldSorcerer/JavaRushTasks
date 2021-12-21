package com.javarush.task.pro.task14.task1407;

public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}
