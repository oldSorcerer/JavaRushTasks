package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }
    public interface CanRun {
        void run();
    }


}
