package com.javarush.task.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        if (imf == null) {
            synchronized (IMF.class) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
