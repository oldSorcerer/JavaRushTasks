package com.javarush.task.jdk13.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }

    public class Duck implements CanEat, CanFly, CanMove{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
