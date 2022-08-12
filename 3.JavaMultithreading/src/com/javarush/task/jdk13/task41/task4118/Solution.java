package com.javarush.task.jdk13.task41.task4118;

import com.javarush.task.jdk13.task41.task4118.ui.Player;
import com.javarush.task.jdk13.task41.task4118.ui.UI;

/* 
Usb mp3 плеер
*/

public class Solution {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
