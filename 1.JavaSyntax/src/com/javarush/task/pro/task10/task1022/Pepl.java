package com.javarush.task.pro.task10.task1022;

/* 
Робозомби
*/

import java.util.Arrays;

public class Pepl {

    public static Battery[] batteryWarehouse = Battery.getBatteries();

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
        System.out.println(Arrays.toString(robots));

        distributeBatteries(robots);

        System.out.println(Arrays.toString(robots));
    }

    public static void distributeBatteries(Robot[] robots) {
        int i = 0;
        for (Robot robot : robots) {
            robot.replaceBattery(batteryWarehouse[i++]);
            while (robot.getCharge() < 20) {
                robot.replaceBattery(batteryWarehouse[i++]);
            }
        }
    }
}
