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
            switch (country) {
                case (Country.BELARUS):
                    return new BelarusianHen();
                case (Country.RUSSIA):
                    return new RussianHen();
                case (Country.MOLDOVA):
                    return new MoldovanHen();
                case (Country.UKRAINE):
                    return new UkrainianHen();
                default:
                    return null;
            }
        }
    }


}
