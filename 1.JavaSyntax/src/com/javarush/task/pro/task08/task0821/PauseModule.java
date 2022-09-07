package com.javarush.task.pro.task08.task0821;

/* 
Путевые заметки Диего
*/

public class PauseModule {

    public static void main(String[] args) throws InterruptedException {
        pause(1000L);
        pause(-1000L);
        pause(1234567L);
        pause(-9876543L);
        pause(0L);
    }

    public static void pause(long timeUnits) throws InterruptedException {
        if (timeUnits < 0) {
            timeUnits = timeUnits * (-1);
        }
        while (timeUnits > 999_999){
            timeUnits = timeUnits / 10;
        }
            Thread.sleep(0, (int) timeUnits);
    }
}
