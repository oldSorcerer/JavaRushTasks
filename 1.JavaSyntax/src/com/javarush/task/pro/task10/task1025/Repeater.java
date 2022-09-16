package com.javarush.task.pro.task10.task1025;

public class Repeater {
    private String trajectory = "parabolic";
    private int frequency = 30;

    public String getTrajectory() {
        return trajectory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setTrajectory(String trajectory) {
        this.trajectory = trajectory;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return String.format("Repeater trajectory is %s, with a %dGHz communication frequency.", trajectory, frequency);
    }
}