package com.javarush.task.task23.task2303;

/* 
Запрети создание экземпляров класса
*/

public class Solution {

    public static abstract class Listener {

        public void onMouseDown(int x, int y) {
            // Do something when the mouse down event occurs
        }

        public void onMouseUp(int x, int y) {
            // Do something when the mouse up event occurs
        }
    }

    public static void main(String[] args) {

    }
}
