package com.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static java.util.Objects.nonNull;

public class Team implements Callable<Integer> {
    private final String title;
    private final Set<Bowler> members;
    private final Bowling bowling;
    private Track track;

    public Team(String title, Bowling bowling) {
        this.members = new HashSet<>();
        int numberOfMembers = ThreadLocalRandom.current().nextInt(4, 10);
        for (int i = 0; i < numberOfMembers; i++) {
            this.members.add(new Bowler());
        }
        this.title = title;
        this.bowling = bowling;
    }

    @Override
    public Integer call() throws Exception {
        int moneySpent = 0;
        if (!stakeOutTrack() || !getShoes()) {
            return moneySpent;
        }

        moneySpent += track.getPrice();
        moneySpent += members.size() * 10;
        moneySpent += play();
        while (ThreadLocalRandom.current().nextBoolean()) {
            moneySpent += play();
        }

        finish();
        return moneySpent;
    }

    private boolean stakeOutTrack() {
        track = bowling.acquireTrack();
        if (nonNull(track)) {
            System.out.printf("Команда '%s' застолбила дорожку №%d за $%d\n", title, track.getNumber(), track.getPrice());
            return true;
        }
        System.out.printf("Для команды '%s' не нашлось свободной дорожки\n", title);
        return false;
    }

    private boolean getShoes() {
        Set<PairOfShoes> shoes = bowling.acquireShoes(members.size());
        if (nonNull(shoes)) {
            Iterator<PairOfShoes> iterator = shoes.iterator();
            members.forEach(member -> member.putOn(iterator.next()));
            System.out.printf("Команда '%s' переобулась\n", title);
            return true;
        }
        System.out.printf("Команде '%s' не хватило обуви.\n", title);
        bowling.releaseTrack(track);
        return false;
    }

    private int play() {
        int spentMoney = ThreadLocalRandom.current().nextInt(5, 200);
        System.out.printf("Команда '%s' гоняет шары, заказывает еду и выпивку на $%d\n", title, spentMoney);
        try {
            TimeUnit.MILLISECONDS.sleep(spentMoney * 10L);
        } catch (InterruptedException ignored) {
        }
        return spentMoney;
    }

    private void finish() {
        bowling.releaseTrack(track);
        Set<PairOfShoes> shoes = new HashSet<>();
        for (Bowler bowler : members) {
            shoes.add(bowler.returnShoes());
        }
        bowling.releaseShoes(shoes);
    }
}
