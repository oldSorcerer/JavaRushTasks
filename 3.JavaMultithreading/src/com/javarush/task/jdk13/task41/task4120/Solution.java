package com.javarush.task.jdk13.task41.task4120;

import com.javarush.task.jdk13.task41.task4120.games.Catan;
import com.javarush.task.jdk13.task41.task4120.games.DiceForge;
import com.javarush.task.jdk13.task41.task4120.games.WelcomeTo;

/* 
Игра как жизнь
*/

public class Solution {

    public static void main(String[] args) {
        new Catan().start(4);
        new DiceForge().start(2);
        new WelcomeTo().start(10);
    }
}
