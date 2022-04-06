package com.javarush.task.jdk13.task16.task1622;

/* 
Аэропорт
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // взлетная полоса

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Самолет #1");
        Plane plane2 = new Plane("Самолет #2");
        Plane plane3 = new Plane("Самолет #3");
    }

    private static void waiting() {
        // напишите тут ваш код

    }

    private static void takingOff() {
        // исправь этот метод
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignore) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    // если взлетная полоса свободна, занимаем ее
                    System.out.println(getName() + " взлетает");
                    takingOff();// взлетает
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // если взлетная полоса занята самолетом
                    System.out.println(getName() + " ожидает");
                    waiting(); // ожидает
                }
            }
        }
    }

    public static class Runway { // взлетная полоса
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

