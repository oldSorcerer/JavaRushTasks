package com.javarush.task.pro.task11.task1129;


import java.util.Random;

public class BioNanoBot {
    private final Class<?>[] playlist;

    public BioNanoBot(Class<?>[] playlist) {
        this.playlist = playlist;
        try {
            ((Music) this.playlist[new Random().nextInt(playlist.length)].getDeclaredConstructor().newInstance()).play();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
