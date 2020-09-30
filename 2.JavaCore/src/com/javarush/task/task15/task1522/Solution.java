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
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        String string = rd.readLine();

        if (Planet.EARTH.equals(string)) {
            thePlanet = Earth.getInstance();
        } else if (Planet.MOON.equals(string)) {
            thePlanet = Moon.getInstance();
        } else if (Planet.SUN.equals(string)) {
            thePlanet = Sun.getInstance();
        } else {
            thePlanet = null;
        }

    }
}
