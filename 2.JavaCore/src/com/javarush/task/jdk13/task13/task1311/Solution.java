package com.javarush.task.jdk13.task13.task1311;

/* 
Интерфейс Updatable в классе Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
