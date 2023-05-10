package com.javarush.task.task27.task2712.ad;

public class AdvertisementManager {

    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();

    private final int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() throws NoVideoAvailableException {
        if (storage.list().isEmpty()) {
            throw  new NoVideoAvailableException();
        }

    }
}
