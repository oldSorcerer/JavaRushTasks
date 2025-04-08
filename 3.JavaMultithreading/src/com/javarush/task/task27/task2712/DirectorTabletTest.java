package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.Advertisement;
import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Dish;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class DirectorTabletTest {

    private static   DirectorTablet directorTablet;

//    @BeforeEach
    static void setUp() {
        StatisticManager instance = StatisticManager.getInstance();
        Cook cook = new Cook("Иванов");
        instance.register(cook);

        Cook cook2 = new Cook("Тестов");
        instance.register(cook2);

        List<Dish> dishList = new ArrayList<>();
        dishList.add(Dish.STEAK);
        dishList.add(Dish.SOUP);


        CookedOrderEventDataRow cookedOrderEventDataRow = new CookedOrderEventDataRow("1", cook.toString(), 25, dishList);
        Date date = new Date();
        date.setMonth(06);
        cookedOrderEventDataRow.setCurrentDate(date);
        instance.register(cookedOrderEventDataRow);

        CookedOrderEventDataRow cookedOrderEventDataRow2 = new CookedOrderEventDataRow("1", cook.toString(), 25, dishList);
        Date date2 = new Date();
        date2.setMonth(07);

        cookedOrderEventDataRow2.setCurrentDate(date2);
        instance.register(cookedOrderEventDataRow2);

        CookedOrderEventDataRow cookedOrderEventDataRow3 = new CookedOrderEventDataRow("1", cook.toString(), 65, dishList);
        Date date3 = new Date();
        date3.setMonth(07);
        cookedOrderEventDataRow3.setCurrentDate(date3);
        instance.register(cookedOrderEventDataRow3);


        CookedOrderEventDataRow cookedOrderEventDataRow4 = new CookedOrderEventDataRow("1", cook2.toString(), 65, dishList);
        Date date4 = new Date();
        date4.setMonth(07);

        cookedOrderEventDataRow4.setCurrentDate(date4);
        instance.register(cookedOrderEventDataRow4);

        VideoSelectedEventDataRow videoSelectedEventDataRow = new VideoSelectedEventDataRow(new ArrayList<Advertisement>(), 1011, 10);
        Date date5 = new Date();
        date5.setMonth(06);
        videoSelectedEventDataRow.setCurrentDate(date5);
        instance.register(videoSelectedEventDataRow);


        VideoSelectedEventDataRow videoSelectedEventDataRow2 = new VideoSelectedEventDataRow(new ArrayList<Advertisement>(), 10022, 100);
        Date date6 = new Date();
        date6.setMonth(04);
        videoSelectedEventDataRow2.setCurrentDate(date6);
        instance.register(videoSelectedEventDataRow2);

        VideoSelectedEventDataRow videoSelectedEventDataRow3 = new VideoSelectedEventDataRow(new ArrayList<Advertisement>(), 1012, 11);
        videoSelectedEventDataRow3.setCurrentDate(date5);
        instance.register(videoSelectedEventDataRow3);

        directorTablet = new DirectorTablet();
    }

//    @Test
    static void printAdvertisementProfit() {
        setUp();
        directorTablet.printAdvertisementProfit();
    }

//    @Test
    static void printCookWorkloading() {
        setUp();
        directorTablet.printCookWorkloading();
    }

    public static void main(String[] args) {

        printAdvertisementProfit();
        printCookWorkloading();

    }
}
