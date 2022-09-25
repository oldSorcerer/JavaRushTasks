package com.javarush.task.pro.task11.task1129;

/* 
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        Class[] music = {
                new AlternativeMetal().getClass(), new BlackMetal().getClass(),
                new DeathMetal().getClass(),new DoomMetal().getClass(),
                new SpeedMetal().getClass(), new FolkMetal().getClass(),
                new ThrashMetal().getClass(), new GlamMetal().getClass(),
                new HeavyMetal().getClass(), new PowerMetal().getClass(),
                new ProgressiveMetal().getClass(), new GothicMetal().getClass(),
                new SymphonicMetal().getClass(),
                new IndustrialMetal().getClass(), new Metalcore().getClass(),
        };
        sysadmin.load(music);

    }
}
