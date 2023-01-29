package com.javarush.task.pro.task11.task1133;

/* 
Компилятор космопорта
*/


import java.util.Random;

public class Cosmoport {
    public static Compiler COMPILER = new Compiler();
    public static RoboZombie[] roboZombies = Cosmoport.RoboZombieFactory.produce();

    public static void main(String[] args) {
        for (RoboZombie roboZomby : roboZombies) {
            System.out.println(roboZomby);
        }
    }

    public static class Compiler {
        public void compile(RoboZombie roboZombie) {
            roboZombie.destiny = "Loader";
        }
    }

    public static class RoboZombieFactory {
        public static RoboZombie[] produce() {
            RoboZombie[] army = new RoboZombie[new Random().nextInt(100)];
            for (int i = 0; i < army.length; i++) {
                army[i] = new RoboZombie();
                COMPILER.compile(army[i]);
            }
            return army;
        }
    }

    public static class RoboZombie {
        public String destiny;

        @Override
        public String toString() {
            return "RoboZombie{" +
                    "id='" + hashCode() + '\'' +
                    ", destiny='" + destiny + '\'' +
                    '}';
        }
    }
}
