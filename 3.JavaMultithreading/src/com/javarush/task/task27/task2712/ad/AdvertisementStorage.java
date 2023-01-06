package com.javarush.task.task27.task2712.ad;

public class AdvertisementStorage {

    private static final AdvertisementStorage instance = new AdvertisementStorage();

    private AdvertisementStorage() {
    }

    public static AdvertisementStorage getInstance() {
        return instance;
    }
}
