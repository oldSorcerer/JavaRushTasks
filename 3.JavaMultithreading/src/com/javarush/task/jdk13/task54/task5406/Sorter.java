package com.javarush.task.jdk13.task54.task5406;

import java.util.Arrays;
import java.util.Date;

public class Sorter {

    private final int[] array;
    private final int[] sortedArray;
    private final String arrayType;
    private long compareCount;
    private long switchCount;
    private long time;

    public Sorter(int[] array, String arrayType) {
        this.arrayType = arrayType;
        this.array = array;
        this.sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
    }

    void printResults(String text) {
        System.out.printf("%s, %s\t\tCompares: %,d\t\tSwitches: %,d\t\tTime: %,d milliseconds%n"
                , text, arrayType, compareCount, switchCount, time);
    }

    public void sortBubbleClassic() {
        int currentPosition;
        int maxPosition;
        int temp;
        time = new Date().getTime();

        for (maxPosition = array.length - 1; maxPosition >= 0; maxPosition--) {
            for (currentPosition = 0; currentPosition < maxPosition; currentPosition++) {
                compareCount++;
                if (array[currentPosition] > array[currentPosition + 1]) {
                    temp = array[currentPosition];
                    array[currentPosition] = array[currentPosition + 1];
                    array[currentPosition + 1] = temp;
                    switchCount++;
                }
            }
        }

        time = new Date().getTime() - time;
        assert Arrays.equals(array, sortedArray);
        printResults("Bubble Classic");
    }

    public void sortBubbleAdvanced() {
        time = new Date().getTime();

        //напишите тут ваш код


        time = new Date().getTime() - time;
        assert Arrays.equals(array, sortedArray);
        printResults("Bubble Advanced");
    }
}
