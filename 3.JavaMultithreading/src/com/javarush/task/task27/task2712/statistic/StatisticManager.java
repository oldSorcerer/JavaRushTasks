package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class StatisticManager {

    private static final StatisticManager instance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();
    private Set<Cook> cooks = new HashSet<>();

    private StatisticManager() {
    }

    public static StatisticManager getInstance() {
        return instance;
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    public void register(Cook cook) {
        cooks.add(cook);
    }



    public Map<String, Long> getProfitMap() {


        Map<String, Long> map = new HashMap<>();

        List<EventDataRow> list = statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS);
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        long total = 0;

        for (EventDataRow eventDataRow : list) {
            VideoSelectedEventDataRow videoSelected = (VideoSelectedEventDataRow) eventDataRow;

            String date = format.format(videoSelected.getDate());

            if (!map.containsKey(date)) {
                map.put(date, 0L);
            }
            total += videoSelected.getAmount();

            map.put(date, map.get(date) + videoSelected.getAmount());
        }
        map.put("Total", total);

        return map;
    }

//        Map<Long, Long> map = new TreeMap<>();
//
//        List<EventDataRow> list = statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS);
//        for (EventDataRow eventDataRow : list) {
//            VideoSelectedEventDataRow videoSelected = (VideoSelectedEventDataRow) eventDataRow;
//
//            Long data = videoSelected.getDate().getTime();
//
//            long amount = videoSelected.getAmount();
//
//            if (map.containsKey(data)) {
//                map.put(data, map.get(data) + amount);
//            } else {
//                map.put(data, amount);
//            }
//        }
//
//        return map;
//        return statisticStorage.getStorage().get(EventType.SELECTED_VIDEOS).stream()
//                .map(eventDataRow -> (VideoSelectedEventDataRow) eventDataRow)
//                .collect(Collectors.toMap(
//                        videoSelected -> videoSelected.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
//                        videoSelected -> videoSelected.getAmount() / 100.0,
//                        Double::sum,
//                        TreeMap::new));
//    }

    public Map<String, Map<String, Integer>> getCookWorkloadingMap() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Map<String, Map<String, Integer>> map = new TreeMap<>(Comparator.reverseOrder());

        List<EventDataRow> eventDataRows = statisticStorage.getStorage().get(EventType.COOKED_ORDER);
        for (EventDataRow eventDataRow : eventDataRows) {
            CookedOrderEventDataRow cooked = (CookedOrderEventDataRow) eventDataRow;
            String date = format.format(cooked.getDate());
            String cookName = cooked.getCookName();
            int time = cooked.getTime();
            int timeMin = (time % 60 == 0) ? (time / 60) : (time / 60 + 1);
            if (!map.containsKey(date)) {
                map.put(date, new TreeMap<>());
                map.get(date).put(cookName, timeMin);
            } else {
                map.get(date).merge(cookName, timeMin, Integer::sum);
            }
        }

//        statisticStorage.getStorage().get(EventType.COOKED_ORDER).stream()
//                .map(eventDataRow -> (CookedOrderEventDataRow) eventDataRow)
//                .forEach(cooked -> map.computeIfAbsent(cooked.getDate(), k -> new TreeMap<>()).merge(cooked.getCookName(), cooked.getTime(), Integer::sum));

        return map;
    }

    private class StatisticStorage {

        private final Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage() {
            Arrays.stream(EventType.values())
                    .forEach(type -> storage.put(type, new ArrayList<>()));
        }

        private void put(EventDataRow data) {
            storage.get(data.getType()).add(data);
        }

        public Map<EventType, List<EventDataRow>> getStorage() {
            return storage;
        }
    }
}
