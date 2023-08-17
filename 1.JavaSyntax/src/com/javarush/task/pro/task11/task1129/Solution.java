package com.javarush.task.pro.task11.task1129;

/* 
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        Class<?>[] music = {
                AlternativeMetal.class, BlackMetal.class,
                DeathMetal.class, DoomMetal.class,
                SpeedMetal.class, FolkMetal.class,
                ThrashMetal.class, GlamMetal.class,
                HeavyMetal.class, PowerMetal.class,
                ProgressiveMetal.class, GothicMetal.class,
                SymphonicMetal.class,
                IndustrialMetal.class, Metalcore.class,
        };
        sysadmin.load(music);
    }
}