package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            switch (string) {
                case Planet.SUN -> thePlanet = Sun.getInstance();
                case Planet.EARTH -> thePlanet = Earth.getInstance();
                case Planet.MOON -> thePlanet = Moon.getInstance();
                default -> thePlanet = null;
            }
        }
    }
}
