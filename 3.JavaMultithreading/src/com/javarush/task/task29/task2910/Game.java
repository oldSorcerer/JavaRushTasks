package com.javarush.task.task29.task2910;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.javarush.task.task29.task2910.Constants.*;

public class Game {
    private List<Sportsman> members;
    Sportsman controlSportsman;

    public Game() {
        initializeControlSportsman();
        members = new ArrayList<>();
        for (int i = 0; i < SPORTSMAN_COUNT; i++) {
            members.add(new Sportsman(i + 1));
        }
    }

    private void initializeControlSportsman() {
        controlSportsman = new Sportsman(0);
        controlSportsman.setAverageSpeed(new BigDecimal(20.));
        controlSportsman.setChanceToHit(MAX_CHANCE_TO_HIT_IN_TARGET);
        controlSportsman.setCountHitOutTarget(2);
        controlSportsman.setResultTime(new BigDecimal("3640.00"));
        System.out.println("РЕЗУЛЬТАТ КОНТРОЛЬНОГО СПОРТСМЕНА:");
        controlSportsman.printResultInfo();
    }

    public void startCompetition() {
        for (int i = 0; i < members.size(); i++) {
            members.get(i).calculateNumberOfMiss();
            BigDecimal timeToRace = controlSportsman.getResultTime().subtract(BigDecimal.valueOf(members.get(i).getCountHitOutTarget() * PENALTY_TIME_PER_ONE_MISS));
            members.get(i).setAverageSpeed(new BigDecimal(RACE_LENGTH / (timeToRace.doubleValue() / 3600)).setScale(4, BigDecimal.ROUND_HALF_UP));
            members.get(i).calculateFullTime();
        }
    }

    public void printAllResults() {
        for (int i = 0; i < members.size(); i++) {
            members.get(i).printResultInfo();
        }
    }

    public void printSportsmanWithEqualTime() {
        for (Sportsman sportsman : getSportsmanWithEqualTime()) {
            sportsman.printResultInfo();
        }
    }

    private List<Sportsman> getSportsmanWithEqualTime() {
        List<Sportsman> result = new ArrayList<>();
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getResultTime().equals(controlSportsman.getResultTime())) {
                result.add((members.get(i)));
            }
        }
        return result;
    }
}