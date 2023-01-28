package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            return switch (country) {
                case Country.BELARUS -> new BelarusianHen();
                case Country.RUSSIA -> new RussianHen();
                case Country.MOLDOVA -> new MoldovanHen();
                case Country.UKRAINE -> new UkrainianHen();
                default -> null;
            };
        }
    }


}
