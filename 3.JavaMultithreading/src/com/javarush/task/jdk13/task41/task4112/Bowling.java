package com.javarush.task.jdk13.task41.task4112;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Objects.*;

public class Bowling {

    private final Queue<Track> tracks;
    private final Queue<PairOfShoes> shoesShelf;

    public Bowling(int tracksNumber) {
//        IntStream.range(1, tracksNumber + 1).mapToObj(Track::new).forEach(tracks::offer);
        tracks = IntStream.range(1, tracksNumber + 1).mapToObj(Track::new).collect(Collectors.toCollection(ConcurrentLinkedQueue::new));
//        IntStream.range(0, 50).mapToObj(i -> new PairOfShoes(ThreadLocalRandom.current().nextInt(38, 46)))
//                .forEach(shoesShelf::offer);
        shoesShelf = IntStream.range(0, 50).mapToObj(i -> new PairOfShoes(ThreadLocalRandom.current().nextInt(38, 46)))
                .collect(Collectors.toCollection(ConcurrentLinkedQueue::new));

    }

    public synchronized Track acquireTrack() {
        if (tracks.isEmpty()) return null;

        Track track = tracks.poll();
        if (nonNull(track)) track.setPrice(100 - tracks.size() * 10);
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.offer(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) return null;

        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(shoesShelf.poll());
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}
