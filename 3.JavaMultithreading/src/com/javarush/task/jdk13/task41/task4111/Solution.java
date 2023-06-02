package com.javarush.task.jdk13.task41.task4111;

/* 
Ленивый зам
*/

public class Solution {

    public static void main(String[] args) {
//        Entity entity = VeryHeavyEntity.load(10001);
        Entity entity = new LazyInitializer(10001);
        System.out.println(entity.getId());
        System.out.println(entity.find("John"));
    }
}
