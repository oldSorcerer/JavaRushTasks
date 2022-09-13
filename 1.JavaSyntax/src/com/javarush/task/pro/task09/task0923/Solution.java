package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.*;

public class Solution {
    public static void main(String[] args) {
        String str = "";
        if (debugAccess("Раб")) {
            str = "Раб";
        } else if (debugAccess("Гость")) {
            str = "Гость";
        } else if (debugAccess("Боец")) {
            str = "Боец";
        } else if (debugAccess("Ветеран")) {
            str = "Ветеран";
        } else if (debugAccess("Картографист")) {
            str = "Картографист";
        } else if (debugAccess("Капитан")) {
            str = "Капитан";
        } else if (debugAccess("Стив")) {
            str = "Стив";
        }
        checkAccess(str);
    }
}
