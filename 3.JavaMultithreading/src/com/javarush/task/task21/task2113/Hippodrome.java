package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        List<Horse> horses = new ArrayList<>();

        horses.add(new Horse("Lucky", 3, 0));
        horses.add(new Horse("Slevin", 3, 0));
        horses.add(new Horse("Homer", 3, 0));

        game = new Hippodrome(horses);


    }
}
