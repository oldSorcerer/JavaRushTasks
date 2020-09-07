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
            Hen hen = null;

            if (country.equals(Country.BELARUS))
                hen = new BelarusianHen();
            if (country.equals(Country.MOLDOVA))
                hen = new MoldovanHen();
            if (country.equals(Country.RUSSIA))
                hen = new RussianHen();
            if (country.equals(Country.UKRAINE))
                hen = new UkrainianHen();

            return hen;
        }
    }


}
