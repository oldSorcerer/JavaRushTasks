package com.javarush.task.jdk13.task41.task4112;

import java.util.concurrent.TimeUnit;

public class Bowler {
    private PairOfShoes shoes;

    public PairOfShoes returnShoes() {
        PairOfShoes shoes = this.shoes;
        this.shoes = null;
        return shoes;
    }

    public void putOn(PairOfShoes shoes) {
        this.shoes = shoes;
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ignored) {
        }
    }
}
