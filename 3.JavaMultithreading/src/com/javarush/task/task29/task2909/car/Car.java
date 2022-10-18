package com.javarush.task.task29.task2909.car;

import java.util.Date;

public class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    public Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int fill(double numberOfLiters) {
        if (numberOfLiters < 0)
            return -1;
        fuel += numberOfLiters;
        return 0;
    }

    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        double consumption;
        if (date.before(SummerStart) || date.after(SummerEnd)) {
            consumption = length * winterFuelConsumption + winterWarmingUp;
        } else {
            consumption = length * summerFuelConsumption;
        }
        return consumption;
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if (!isDriverAvailable())
            return 0;
        if (fuel <= 0)
            return 0;

        return numberOfPassengers;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
            fastenDriverBelt();
        } else {
            fastenDriverBelt();
        }
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public int getMaxSpeed() {
        if (type == TRUCK)
            return 80;
        if (type == SEDAN)
            return 120;
        return 90;
    }
}