package com.javarush.task.pro.task11.task1132;

public class UltraMetal {
    public static void play() {
        for (RoboZombie roboZombie : Solution.roboZombies) {
            roboZombie.uninstallBugs();
        }
    }
}