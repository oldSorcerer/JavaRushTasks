package com.javarush.task.pro.task07.task0720;

public class GalavirXIII {
    public static int superWeapon = Integer.MAX_VALUE;
    public double health = Double.MAX_VALUE;

    public void defend(double damage){
        health -=  superWeapon/damage;
    }

    public int attack(){
        return superWeapon;
    }

}