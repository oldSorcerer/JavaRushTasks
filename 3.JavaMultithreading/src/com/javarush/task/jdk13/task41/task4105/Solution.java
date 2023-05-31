package com.javarush.task.jdk13.task41.task4105;

import com.javarush.task.jdk13.task41.task4105.facade.PotionConversionFacade;

/* 
Алхимическая библиотека
*/

public class Solution {

    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        PotionConversionFacade facade = new PotionConversionFacade();
        String convertPotion = facade.convertPotion(potionName, type);

        System.out.println(convertPotion);
    }
}
