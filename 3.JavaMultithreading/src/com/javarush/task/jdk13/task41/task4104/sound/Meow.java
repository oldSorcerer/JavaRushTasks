package com.javarush.task.jdk13.task41.task4104.sound;

public class Meow implements SoundLogic {

    @Override
    public void sound(String name) {
        System.out.println(name + " мяукает.");
    }
}
