package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AdvertisementManager {

    private final int timeSeconds;
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();

    private List<Advertisement> bestAdvertisements;
    private long bestAmount;
    private int bestDuration = Integer.MAX_VALUE;


    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException("");
        }
        List<Advertisement> advertisements = storage.list().stream()
                .filter(adv -> adv.getDuration() <= timeSeconds)
                .filter(adv -> adv.getAmountPerOneDisplaying() > 0)
                .collect(Collectors.toList());

        makeAllAdvertisements(advertisements);

        bestAdvertisements.sort(
                Comparator.comparingLong(Advertisement::getAmountPerOneDisplaying)
                        .thenComparingInt(Advertisement::getDuration)
                        .reversed());


        VideoSelectedEventDataRow eventDataRow = new VideoSelectedEventDataRow(
                bestAdvertisements,
                bestAmount,
                bestDuration);
        StatisticManager.getInstance().register(eventDataRow);

        for (Advertisement advertisement : bestAdvertisements) {
            ConsoleHelper.writeMessage(advertisement.toString());
            advertisement.revalidate();
        }
    }

    private int calcDuration(List<Advertisement> advertisements) {
        return advertisements.stream().mapToInt(Advertisement::getDuration).sum();
    }

    private long calcAmount(List<Advertisement> advertisements) {
        return advertisements.stream().mapToLong(Advertisement::getAmountPerOneDisplaying).sum();
    }

    private void updateBestAdvertisments(List<Advertisement> advertisements) {
        int newDuration = calcDuration(advertisements);
        long newAmount = calcAmount(advertisements);

        if (bestAdvertisements == null && newDuration <= timeSeconds) {
            extracted(advertisements, newAmount, newDuration);

        } else {
            if (newDuration <= timeSeconds) {

                if (newAmount > bestAmount) {
                    extracted(advertisements, newAmount, newDuration);
                }

                if (newAmount == bestAmount) {
                    if (newDuration > bestDuration) {
                        extracted(advertisements, newAmount, newDuration);
                    }

                    if (newDuration == bestDuration && advertisements.size() < bestAdvertisements.size()) {
                        extracted(advertisements, newAmount, newDuration);
                    }
                }
            }
        }
    }

    private void extracted(List<Advertisement> advertisements, long newAmount, int newDuration) {
        bestAdvertisements = advertisements;
        bestAmount = newAmount;
        bestDuration = newDuration;
    }

    private void makeAllAdvertisements(List<Advertisement> advertisements) {
        if (advertisements.size() > 0) {
            updateBestAdvertisments(advertisements);
        }

        for (int i = 0; i < advertisements.size(); i++) {
            List<Advertisement> newAdvertisements = new ArrayList<>(advertisements);
            newAdvertisements.remove(i);
            makeAllAdvertisements(newAdvertisements);
        }
    }
}
