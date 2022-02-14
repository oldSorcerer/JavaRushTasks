package com.javarush.task.jdk13.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    interface CanRun {
        void run();
    }

    interface CanSwim {
        void swim();
    }

    abstract class Human implements CanRun, CanSwim {

    }

}
