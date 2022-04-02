package com.javarush.task.task14.task1405;

/* 
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
