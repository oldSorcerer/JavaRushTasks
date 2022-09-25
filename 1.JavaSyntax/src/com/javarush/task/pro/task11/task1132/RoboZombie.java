package com.javarush.task.pro.task11.task1132;

public class RoboZombie {
    public void uninstallBugs() {
        String fullName = this.toString();
        String name = fullName.substring(fullName.lastIndexOf('.') + 1);
        System.out.println(name + " обеззаражен.");
    }
}
