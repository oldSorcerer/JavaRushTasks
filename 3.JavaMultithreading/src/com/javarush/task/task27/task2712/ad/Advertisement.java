package com.javarush.task.task27.task2712.ad;

public class Advertisement {
    private Object content; // видео
    private String name;
    private long initialAmount; // начальная сумма, стоимость рекламы в копейках.
    private int hits; // количество оплаченных показов
    private int duration; // продолжительность в секундах
    private long amountPerOneDisplaying; // стоимость одного показа

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        this.amountPerOneDisplaying = hits > 0 ? initialAmount / hits : 0;
    }

    public void revalidate() {
        if (hits == 0) throw new NoVideoAvailableException("");

        hits--;
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

    public int getHits() {
        return hits;
    }

    @Override
    public String toString() {
        return String.format("%s is displaying... %d, %d", name, amountPerOneDisplaying, amountPerOneDisplaying * 1000 / duration);
    }
}
