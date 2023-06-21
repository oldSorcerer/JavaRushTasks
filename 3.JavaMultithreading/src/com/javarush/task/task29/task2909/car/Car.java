package com.javarush.task.task29.task2909.car;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract class Car {
    public static final int TRUCK = 0;
    public static final int SEDAN = 1;
    public static final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private final int type;

    @Getter
    @Setter
    private boolean driverAvailable;
    private final int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public abstract int getMaxSpeed();

    public void fill(double numberOfLiters) {
        if (numberOfLiters < 0) {
            throw new IndexOutOfBoundsException();
        }
        fuel += numberOfLiters;
    }

    public boolean isSummer(Date date, Date summerStart, Date summerEnd) {
        return date.after(summerStart) && date.before(summerEnd);
    }

    public double getWinterConsumption(int length) {
        return length * winterFuelConsumption + winterWarmingUp;
    }

    public double getSummerConsumption(int length) {
        return length * summerFuelConsumption;
    }

    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {
        return isSummer(date, summerStart, summerEnd) ?
                getSummerConsumption(length) :
                getWinterConsumption(length);
    }

    private boolean canPassengersBeTransferred() {
        return isDriverAvailable() && fuel > 0;
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if (!canPassengersBeTransferred()) {
            return 0;
        }
        return numberOfPassengers;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
        fastenDriverBelt();
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public static Car create(int type, int numberOfPassengers) {
        return switch (type) {
            case TRUCK -> new Truck(numberOfPassengers);
            case SEDAN -> new Sedan(numberOfPassengers);
            case CABRIOLET -> new Cabriolet(numberOfPassengers);
            default -> null;
        };
    }
}