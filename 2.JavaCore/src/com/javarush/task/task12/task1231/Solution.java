package com.javarush.task.task12.task1231;

/* 
Ненужные абстракции
*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static abstract class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public abstract void fly() {

        }
    }

    public static class SwimmingPegasus extends Pegasus {
        public void swim();
    }

}
