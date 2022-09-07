package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.checkAccess;
import static com.javarush.task.pro.task09.task0923.CaptainBridge.debugAccess;

public class Solution {
    public static void main(String[] args) {
        String str = "";
        if (debugAccess("Раб")) {
            str = "Раб";
        }
        if (debugAccess("Гость")) {
            str = "Гость";
        }
        if (debugAccess("Боец")) {
            str = "Боец";
        }
        if (debugAccess("Ветеран")) {
            str = "Ветеран";
        }
        if (debugAccess("Картографист")) {
            str = "Картографист";
        }
        if (debugAccess("Капитан")) {
            str = "Капитан";
        }
        if (debugAccess("Стив")) {
            str = "Стив";
        }
        checkAccess(str);
    }
}
