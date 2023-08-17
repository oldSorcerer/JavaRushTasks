package com.javarush.task.pro.task11.task1129;

public class Human {
    private final BioNanoBot[] bioNanoBots = new BioNanoBot[30];

    public void load(Class<?>[] playlist) {
        for (int i = 0; i < bioNanoBots.length; i++) {
            bioNanoBots[i] = new BioNanoBot(playlist.clone());
        }
    }
}
