package com.javarush.task.pro.task14.task1407;

/* 
Еда едой, а сон по расписанию
*/

public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("ищет еду");
            System.out.println("нашел " + food.name);
            System.out.println("все съел");
        } catch (NullPointerException e) {
            System.out.println("ничего не нашел");
        } finally {
            System.out.println("лег спать" + (food == null ? " голодным" : ""));
        }

    }
}
