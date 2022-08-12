package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.Set;

public class Bowling {

    public Bowling(int tracksNumber) {
    }

    public synchronized Track acquireTrack() {
        return new Track(1);
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(new PairOfShoes(42));
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
    }
}
