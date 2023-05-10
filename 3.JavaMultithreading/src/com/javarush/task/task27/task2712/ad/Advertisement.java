package com.javarush.task.task27.task2712.ad;

public class Advertisement {

    private final Object content;
    private final String name;
    private long initialAmount;
    private int hits;
    private final int duration;

    private long amountPerOneDisplaying;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        if (hits > 0) amountPerOneDisplaying = initialAmount / hits;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate() {
        if (hits == 0) {
            throw  new UnsupportedOperationException();
        }
        hits--;
    }
}
