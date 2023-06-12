package com.javarush.task.jdk13.task41.task4118.states;

import com.javarush.task.jdk13.task41.task4118.ui.Player;

public abstract class State {

    protected Player player;

    protected State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
