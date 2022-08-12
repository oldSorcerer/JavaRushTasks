package com.javarush.task.jdk13.task41.task4104;

/* 
Фантастические твари
*/

public class Solution {

    public static void main(String[] args) {
        FlyingSpeakingСow cow = new FlyingSpeakingСow();
        cow.move();
        cow.sound();
        cow.giveMilk();

        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
        human.move();
        human.sound();
        human.searchMeaningOfLife();
    }
}
