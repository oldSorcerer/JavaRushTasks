package com.javarush.task.pro.task09.task0922;

/* 
Закосить под пиратов
*/

import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int counter = 0;
        for (int i = 0; i < piratesDB.length && counter < 2; i++) {
            if (piratesDB[i].contains("b")) {
                piratesDB[i] = piratesDB[i].replaceAll("b", "\b");
                counter++;
            }
        }

    }

    public static void addTwoNames() {
        piratesDB = Arrays.copyOf(piratesDB, piratesDB.length + 2);
        piratesDB[piratesDB.length - 2] = "Рыжий Амиго";
        piratesDB[piratesDB.length - 1] = "Одноглазый Диего";
    }
}
