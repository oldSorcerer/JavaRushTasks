package com.javarush.task.pro.task10.task1025;

/* 
Взлом ретранслятора
*/

public class Solution {

    public static void main(String[] args) {
        Repeater repeater = new Repeater();
        if (repeater.getFrequency() < 100){
         repeater.setFrequency(repeater.getFrequency() * 10);
        }
        if (!(repeater.getTrajectory().equals("elliptic"))){
            repeater.setTrajectory("elliptic");
        }
    }
}