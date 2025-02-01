package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;

public class StatisticManager {

    private static final StatisticManager instance = new StatisticManager();

    private StatisticManager() {

    }

    public void  register(EventDataRow data) {

    }

    public static StatisticManager getInstance() {
        return instance;
    }
}
