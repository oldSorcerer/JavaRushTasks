package com.javarush.task.jdk13.task41.task4104.sound;

public class Speak implements SoundLogic {

    @Override
    public void sound(String name) {
        System.out.println(name + " говорит.");
    }
}
