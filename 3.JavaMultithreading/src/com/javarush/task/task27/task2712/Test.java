package com.javarush.task.task27.task2712;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static class Item {
        private final String name;
        private final int weight;
        private final int price;

        public Item(String name, int weight, int price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("1", 5, 6));
        items.add(new Item("2", 3, 4));
        items.add(new Item("3", 4, 5));
        items.add(new Item("4", 2, 3));

        int maxWeight = 8;

        int maxPrice = backpack(items, maxWeight);
        System.out.println("максимальная стоимость рюкзака = " + maxPrice);
    }

    public static int backpack(List<Item> items, int maxWeight) {
        int count = items.size(); // кол-во предметов (строк)
        int[][] array = new int[count + 1][maxWeight + 1]; // массив всех вариантов

        System.out.print("   ");
        for (int i = 0; i <= maxWeight; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= count; i++) {
            for (int j = 0; j <= maxWeight; j++) {
                if (items.get(i - 1).weight <= j) {
                    int x = array[i - 1][j - items.get(i - 1).weight];
                    array[i][j] = Math.max(array[i - 1][j], x + items.get(i - 1).price);

                } else {
                    array[i][j] = array[i - 1][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("№" + i + " ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        List<Item> selectedItems = new ArrayList<>();
        fillSelectedItems(array, items, count, maxWeight, selectedItems);
        System.out.println("Выбраны предметы: ");
        for (Item item : selectedItems) {
            System.out.println("Предмет " + item.name + ", вес: " + item.weight + ", стоимость: " + item.price);
        }
        return array[count][maxWeight];
    }

    private static void fillSelectedItems(int[][] array, List<Item> items, int count, int maxWeight, List<Item> selectedItems) {
        if (count == 0 || maxWeight == 0) return;

        if (array[count][maxWeight] != array[count - 1][maxWeight]) {
            selectedItems.add(items.get(count - 1));
            maxWeight = maxWeight - items.get(count - 1).weight;
        }
        fillSelectedItems(array, items, count - 1, maxWeight, selectedItems);
    }
}