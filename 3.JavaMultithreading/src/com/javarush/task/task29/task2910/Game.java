package com.javarush.task.task29.task2910;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static com.javarush.task.task29.task2910.Constants.*;

public class Game {
    private final List<Sportsman> sportsmenList;
    Sportsman controlSportsman;

    public Game() {
        initializeControlSportsman();
        sportsmenList = new ArrayList<>();
        for (int i = 0; i < SPORTSMAN_COUNT; i++) {
            sportsmenList.add(new Sportsman(i + 1));
        }
    }

    private void initializeControlSportsman() {
        controlSportsman = new Sportsman(0);
        controlSportsman.setAverageSpeed(new BigDecimal("20."));
        controlSportsman.setChanceToHit(MAX_CHANCE_TO_HIT_IN_TARGET);
        controlSportsman.setCountHitOutTarget(2);
        controlSportsman.setResultTime(new BigDecimal("3640.00")); // fucking BigDecimal
        System.out.println("РЕЗУЛЬТАТ КОНТРОЛЬНОГО СПОРТСМЕНА:");
        controlSportsman.printResultInfo();
    }

    public void startCompetition() {
        for (Sportsman sportsman : sportsmenList) {
            sportsman.calculateNumberOfMiss();
            BigDecimal timeToRace = controlSportsman.getResultTime().subtract(BigDecimal.valueOf(sportsman.getCountHitOutTarget() * PENALTY_TIME_PER_ONE_MISS));
            sportsman.setAverageSpeed(new BigDecimal(RACE_LENGTH / (timeToRace.doubleValue() / 3600)).setScale(4, RoundingMode.HALF_UP ));
            sportsman.calculateFullTime();
        }
    }

    public void printAllResults() {
        for (Sportsman member : sportsmenList) {
            member.printResultInfo();
        }
    }

    public void printSportsmanWithEqualTime() {
        for (Sportsman sportsman : getSportsmanWithEqualTime()) {
            sportsman.printResultInfo();
        }
    }

    private List<Sportsman> getSportsmanWithEqualTime() {
        List<Sportsman> result = new ArrayList<>();
        for (Sportsman member : sportsmenList) {
            if (member.getResultTime().equals(controlSportsman.getResultTime())) {
                result.add(member);
            }
        }
        return result;
    }
}