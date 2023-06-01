package com.javarush.task.task29.task2909.human;

import lombok.Getter;

public class BloodGroup {
    @Getter
    private final int code;

    private BloodGroup(int code) {
        this.code = code;
    }

    public static BloodGroup first() {
        return new BloodGroup(1);
    }

    public static BloodGroup second() {
        return new BloodGroup(2);
    }

    public static BloodGroup third() {
        return new BloodGroup(3);
    }

    public static BloodGroup fourth() {
        return new BloodGroup(4);
    }
}
