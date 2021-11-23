package com.javarush.task.pro.task12.task1213;

import java.util.ArrayList;

/* 
Солнечная система
*/

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Звезда Смерти");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(planets.indexOf("Земля") + 1, planetName);
    }

    public static void addPlanets() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
