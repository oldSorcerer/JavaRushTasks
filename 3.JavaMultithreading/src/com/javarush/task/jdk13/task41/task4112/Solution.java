package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* 
Шаром покати
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Bowling bowling = new Bowling(9);
        Set<Team> teams = new HashSet<>();
        teams.add(new Team("Шершни", bowling));
        teams.add(new Team("Блогошарики", bowling));
        teams.add(new Team("Страйкмобиль", bowling));
        teams.add(new Team("Шаром покати", bowling));
        teams.add(new Team("Девочки не шарят", bowling));
        teams.add(new Team("Гранитные шары", bowling));
        teams.add(new Team("Balls of Thunder", bowling));
        teams.add(new Team("Мы стараемся", bowling));
        teams.add(new Team("Dolls With Balls", bowling));
        teams.add(new Team("Заткнись и катись", bowling));
        teams.add(new Team("Парни и парни", bowling));
        teams.add(new Team("Алко Раш", bowling));
        teams.add(new Team("Сунь! Кинь! Сбей!", bowling));
        teams.add(new Team("Накатя выкати", bowling));

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = executor.invokeAll(teams);
        executor.awaitTermination(5, TimeUnit.SECONDS);
        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get();
        }
        System.out.println("Боулинг заработал $" + sum);

        executor.shutdown();
    }
}
