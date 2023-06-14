package com.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public abstract class BoardGame {

    private int playersAmount;

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

    protected abstract void initialize();

    protected abstract void play();

    protected abstract void end();

    protected void printWinner() {
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }

    public final void start(int playersAmount) {
        setPlayersAmount(playersAmount);
        initialize();
        play();
        end();
        printWinner();
    }
}
