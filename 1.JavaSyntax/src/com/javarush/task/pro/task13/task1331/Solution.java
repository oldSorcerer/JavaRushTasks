package com.javarush.task.pro.task13.task1331;

/* 
Лог и дебаг Инстаматрицы
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static Set<String> matrixLogs = new HashSet<>();

    public static int numberOfBugs = 58;

    public static void main(String[] args) {
        fillMatrixLog();

        for (String log : matrixLogs) {
            System.out.println(log);
        }
    }

    public static void fillMatrixLog() {
        for (int i = 0; i < 400; i++) {
            matrixLogs.add("interestingLog" + i + ".log");
            if ((i > 0) && (i % 5 == 0) && (i < 295)) {
                matrixLogs.add("buahaha" + i + ".bug");
            }
        }
    }
}