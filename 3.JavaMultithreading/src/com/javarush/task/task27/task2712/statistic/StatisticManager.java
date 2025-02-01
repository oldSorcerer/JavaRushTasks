package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;

public class StatisticManager {

    private static final StatisticManager instance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();


    private StatisticManager() {
    }

    public void register(EventDataRow data) {

    }

    public static StatisticManager getInstance() {
        return instance;
    }

    private class StatisticStorage {

        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage() {
            Arrays.stream(EventType.values())
                    .forEach(type -> storage.put(type, new ArrayList<>()));
        }
    }
}
