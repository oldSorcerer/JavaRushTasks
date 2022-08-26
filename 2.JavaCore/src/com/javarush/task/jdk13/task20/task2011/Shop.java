package com.javarush.task.jdk13.task20.task2011;

import java.util.List;

public class Shop {
    public Goods goods = new Goods();
    public int count;
    public double profit;
    public List<String> secretData;

    @Override
    public String toString() {
        return "Shop{" +
                "goods=" + goods +
                ", count=" + count +
                ", profit=" + profit +
                ", secretData=" + secretData +
                '}';
    }

    static class Goods {
        public List<String> names;

        @Override
        public String toString() {
            return "Goods{" +
                    "names=" + names +
                    '}';
        }
    }
}
