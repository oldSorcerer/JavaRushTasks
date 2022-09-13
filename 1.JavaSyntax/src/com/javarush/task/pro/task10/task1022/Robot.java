package com.javarush.task.pro.task10.task1022;

public class Robot {
    private int batteryCharge = 1;
    private boolean zombieMode = true;

    public int getCharge() {
        return batteryCharge;
    }

    public void replaceBattery(Battery battery) {
        if (battery != null) {
            batteryCharge += battery.use();
        }
        zombieMode = batteryCharge < 20;
    }

    @Override
    public String toString() {
        return (zombieMode ? "Robo-zombie{" : "Robot{") +
                "batteryCharge=" + batteryCharge +
                '}';
    }
}
