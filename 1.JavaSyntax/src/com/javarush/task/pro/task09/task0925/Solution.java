package com.javarush.task.pro.task09.task0925;

/*
Освобождение Пиратов
*/

import java.util.StringTokenizer;

public class Solution {

    public static String[] controlUnits = {"iAm/A/spyware/one", "iAm/A/malware/two", "iAm/A/virus/three", "iAm/A/trojan/four", "iAm/bug/five"};

    public static void main(String[] args) {
        splitArrayElements();
        getStringFromArray();
        printArray(controlUnits);
    }

    public static void splitArrayElements() {
        for (int i = 0; i < controlUnits.length; i++) {
            StringTokenizer tokenizer = new StringTokenizer(controlUnits[i], "/");
            while (tokenizer.hasMoreTokens()){
                controlUnits[i] = tokenizer.nextToken();
            }
        }
    }

    public static void getStringFromArray() {
        for (int i = 0; i < controlUnits.length; i++) {
            String format = String.format("Block %s back online.", controlUnits[i]);
            controlUnits[i] = format;
        }
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }
}