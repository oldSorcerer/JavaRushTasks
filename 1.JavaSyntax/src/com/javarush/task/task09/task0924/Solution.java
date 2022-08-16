package com.javarush.task.task09.task0924;

import java.util.ArrayList;

/* 
Страшная сказка
*/

public class Solution {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(hood);
        wolf.ate.add(grandmother);
        woodman.killed.add(wolf);
    }

    public static class LittleRedRidingHood extends StoryItem {
    }

    public static class Grandmother extends StoryItem {
    }

    public static class Patty extends StoryItem {
    }

    public static class Woodman extends StoryItem {
    }

    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}