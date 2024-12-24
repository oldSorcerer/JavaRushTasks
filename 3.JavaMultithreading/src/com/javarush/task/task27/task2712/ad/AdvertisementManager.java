package com.javarush.task.task27.task2712.ad;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AdvertisementManager {

    private final int timeSeconds;
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException("");
        }
//        List<Advertisement> advertisements = storage.list().stream()
//                .filter(adv -> adv.getDuration() <= timeSeconds)
//                .filter(adv -> adv.getAmountPerOneDisplaying() > 0)
//                .collect(Collectors.toList());
//
//        advertisements.stream()
//                .sorted(Comparator.comparing(Advertisement::getAmountPerOneDisplaying).reversed())
//                .sorted(null);

    }
}
