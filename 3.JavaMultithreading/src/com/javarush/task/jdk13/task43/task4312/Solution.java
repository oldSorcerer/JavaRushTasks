package com.javarush.task.jdk13.task43.task4312;

import java.util.Set;

/* 
Антихакер
*/

public class Solution {

    public static void main(String[] args) {
        hackTheUniverse();
        Universe.getInstance().getLaws().forEach(System.out::println);
    }

    public static void hackTheUniverse() {
        Set<String> laws = Universe.getInstance().getLaws();
        try {
            laws.removeAll(laws);
            laws.add("Всё, что может пойти не так, пойдёт не так.");
            laws.add("Соседняя очередь всегда движется быстрее.");
            laws.add("Работа заполняет время, отведённое на неё.");
            laws.add("90% чего угодно — ерунда.");
            laws.add("Где работает закон подлости, там отдыхает теория вероятности.");
        } catch (Exception e) {
            System.out.println("Вселенная защищена лучше, чем мы думали...");
        }
    }
}
