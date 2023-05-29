package com.javarush.task.jdk13.task41.task4104.creature;

import com.javarush.task.jdk13.task41.task4104.move.MoveLogic;
import com.javarush.task.jdk13.task41.task4104.sound.SoundLogic;

public class Human extends Creature {

    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Человек";
    }

    public void searchMeaningOfLife() {
        System.out.println(getName() + " ищет смысл жизни.");
    }

}
