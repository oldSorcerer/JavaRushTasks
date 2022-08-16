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
        // напишите тут ваш код
        wolf.ate.add(hood);
        wolf.ate.add(grandmother);
        woodman.killed.add(wolf);
    }

    //красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    //бабушка
    public static class Grandmother extends StoryItem {
    }

    //пирожек
    public static class Patty extends StoryItem {
    }

    //дровосек
    public static class Woodman extends StoryItem {
    }

    //волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();
    }
}
/*Страшная сказка
1. Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк.
2. У каждого класса есть 2 поля: убил (killed ArrayList) и съел (ate ArrayList).
3. Необходимые объекты созданы (hood, grandmother, …).
4. Расставь правильно связи, кто кого съел и убил, чтобы получилась логика сказки «Красная Шапочка».

PS: пирожки никто не ел. Их только несли. Волк чуток поел. А его потом убили.


Требования:
1. Метод main должен изменить состояние (внутренние переменные) объекта волк wolf.
2. Метод main должен изменить состояние (внутренние переменные) объекта дровосек woodman.
3. Пирожки никто не ел.
4. Волк чуток поел.
5. А потом волка убили.*/