package com.javarush.task.jdk13.task41.task4118.ui;

import com.javarush.task.jdk13.task41.task4118.states.ReadyState;
import com.javarush.task.jdk13.task41.task4118.states.State;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private State state;
    private boolean playing = false;
    private final List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        state = new ReadyState(this);
        setPlaying(true);
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}