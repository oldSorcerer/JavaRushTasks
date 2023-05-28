package com.javarush.task.jdk13.task41.task4104;

/* 
Фантастические твари
*/

import com.javarush.task.jdk13.task41.task4104.creature.Cow;
import com.javarush.task.jdk13.task41.task4104.move.Fly;
import com.javarush.task.jdk13.task41.task4104.sound.Meow;

public class Solution {

    public static void main(String[] args) {
//        FlyingSpeakingСow cow = new FlyingSpeakingСow();
//        cow.move();
//        cow.sound();
//        cow.giveMilk();
//
//        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
//        human.move();
//        human.sound();
//        human.searchMeaningOfLife();

        Cow cow = new Cow(new Fly(), new Meow());
        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();
    }
}
