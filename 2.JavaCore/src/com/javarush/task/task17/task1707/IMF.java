package com.javarush.task.task17.task1707;


public class IMF {

    private volatile static IMF imf;

    public static IMF getFund() {

        if (imf == null) {
            synchronized (IMF.class) {
                if (imf == null) {
                    imf = new IMF();
                }
            }
        }

        return imf;
    }

    private IMF() {
    }
}
