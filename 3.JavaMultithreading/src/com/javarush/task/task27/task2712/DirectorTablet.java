package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.*;

public class DirectorTablet {

    public void printAdvertisementProfit() {
        StatisticManager statisticManager = StatisticManager.getInstance();
        Map<String, Long> profitMap = statisticManager.getProfitMap();
        ArrayList<String> list = new ArrayList<>(profitMap.keySet());
        Collections.sort(list);

        for (String key : list) {
            double amount = 1.0 * profitMap.get(key) / 100;
            System.out.println(key + " - " + String.format(Locale.ENGLISH, "%.2f", amount));
        }


//        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//        Map<Date, Double> profitMap = StatisticManager.getInstance().getProfitMap();
//        double total = 0;
//        for (Map.Entry<Date, Double> entry : profitMap.entrySet()) {
//            total += entry.getValue();
//            ConsoleHelper.writeMessage(String.format(Locale.ENGLISH, "%s - %.2f", format.format(entry.getKey()), entry.getValue()));
//        }
//        if (total > 0)
//            ConsoleHelper.writeMessage(String.format(Locale.ENGLISH, "Total - %.2f", total));

//        StatisticManager statisticManager = StatisticManager.getInstance();
//        Map<Date, Double> map = statisticManager.getProfitMap();
//        List<Map.Entry<Date, Double>> list = new ArrayList<>(map.entrySet());
//
//        list.sort((a, b) -> b.getKey().compareTo(a.getKey()));
//
//        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//
//        double totalProfit = 0.0;
//
//        for (Map.Entry<Date, Double> entry : list) {
//            System.out.printf(Locale.ENGLISH, "%s - %.2f%n", df.format(entry.getKey()), entry.getValue() / 100.0);
//            totalProfit += entry.getValue();
//        }
//        System.out.printf(Locale.ENGLISH,"Total - %.2f%n", totalProfit / 100.0);

//        TreeMap<Long, Long> sortedData = new TreeMap<>(Comparator.comparing(Long::longValue).reversed());
//        sortedData.putAll(data);
//
//        Iterator<Map.Entry<Long, Long>> iterator = sortedData.entrySet().iterator();
//        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//        long total = 0;
//
//        while (iterator.hasNext()) {
//            Map.Entry<Long, Long> entry = iterator.next();
//
//            ConsoleHelper.writeMessage(String.format(Locale.US, "%s - %.2f", df.format(new Date(entry.getKey())), (double) entry.getValue() / 100));
//            total += entry.getValue();
//        }
//
//        if (total > 0)
//            ConsoleHelper.writeMessage(String.format(Locale.US, "Total - %.2f%n", (double) total / 100));
    }

    public void printCookWorkloading() {
        Map<String, Map<String, Integer>> cookWorkloadingMap = StatisticManager.getInstance().getCookWorkloadingMap();
        for (Map.Entry<String, Map<String, Integer>> dateMapEntry : cookWorkloadingMap.entrySet()) {

            ConsoleHelper.writeMessage(dateMapEntry.getKey());
            Map<String, Integer> value = dateMapEntry.getValue();
            for (Map.Entry<String, Integer> stringIntegerEntry : value.entrySet()) {
                ConsoleHelper.writeMessage((stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue() + " min"));
            }
        }

    }

    public void printActiveVideoSet() {

    }

    public void printArchivedVideoSet() {

    }
}
