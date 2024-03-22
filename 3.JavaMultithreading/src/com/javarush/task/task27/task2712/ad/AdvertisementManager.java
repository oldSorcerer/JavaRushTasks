package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvertisementManager {

    private final int timeSeconds; // длительность заказа
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    List<List<Advertisement>> listList = new ArrayList<>();

    public void processVideos() throws NoVideoAvailableException {
        List<Advertisement> list = storage.list().stream()
                .filter(adv -> adv.getDuration() <= timeSeconds)
                .filter(adv -> adv.getAmountPerOneDisplaying() > 0).collect(Collectors.toList());

        if (list.isEmpty()) {
            throw new NoVideoAvailableException();
        }
        make(list);
        List<List<Advertisement>> newListList = new ArrayList<>();


        for (List<Advertisement> advertisements : listList) {
            if (getSumDuration(advertisements) < timeSeconds) {
                newListList.add(advertisements);
            }
        }

        newListList.sort(Comparator.comparing(this::getSumAmount));
        newListList.sort(Comparator.comparing(this::getSumDuration));
        List<Advertisement> result = newListList.get(0);
        result.sort(Comparator.comparing(Advertisement::getDuration));
        for (Advertisement advertisement : result) {
            // вывод на экран
            advertisement.revalidate();
        }


    }

    private int getSumDuration(List<Advertisement> list) {
        return list.stream().mapToInt(Advertisement::getDuration).sum(); // W
    }

    private long getSumAmount(List<Advertisement> list) {
        return list.stream().mapToLong(Advertisement::getAmountPerOneDisplaying).sum(); // P
    }


    private void make(List<Advertisement> list) {
        if (!list.isEmpty()) {
            listList.add(list);
        }

        for (int i = 0; i < list.size(); i++) {
            List<Advertisement> newlist = new ArrayList<>(list);
            newlist.remove(i);
            make(newlist);
        }

    }
}
