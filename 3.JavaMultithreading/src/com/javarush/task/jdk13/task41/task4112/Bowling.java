package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.IntStream;

public class Bowling {

    private final Queue<Track> tracks;
    private final Queue<PairOfShoes> shoesShelf;

    public Bowling(int tracksNumber) {
        tracks = new LinkedList<>();
        IntStream.range(0, tracksNumber).mapToObj(Track::new).forEach(tracks::add);
        shoesShelf = new LinkedList<>();
        IntStream.range(38, 45).mapToObj(PairOfShoes::new).forEach(shoesShelf::add);

    }

    public synchronized Track acquireTrack() {
        return new Track(1);
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.add(track);
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
        shoesShelf.addAll(shoes);
    }
}
