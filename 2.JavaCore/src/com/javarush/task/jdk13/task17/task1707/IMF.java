package com.javarush.task.jdk13.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        return imf;
    }

    private IMF() {
    }
}
