package com.javarush.task.jdk13.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
