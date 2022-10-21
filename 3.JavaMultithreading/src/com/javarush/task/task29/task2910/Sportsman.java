package com.javarush.task.task29.task2910;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

import static com.javarush.task.task29.task2910.Constants.*;

public class Sportsman {

    private BigDecimal chanceToHit;
    private BigDecimal averageSpeed;
    private BigDecimal resultTime = new BigDecimal("0.");
    private int number;
    private int countHitOutTarget = 0;

    public Sportsman(int number) {
        this.number = number;
        chanceToHit = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(MIN_CHANCE_TO_HIT_IN_TARGET.doubleValue(), MAX_CHANCE_TO_HIT_IN_TARGET.doubleValue()));
    }

    public void calculateFullTime() {
        resultTime = resultTime.add(BigDecimal.valueOf(countHitOutTarget * PENALTY_TIME_PER_ONE_MISS));
        resultTime = resultTime.add(calculateTimeToRace());
    }

    private BigDecimal calculateTimeToRace() {
        return new BigDecimal(RACE_LENGTH / averageSpeed.doubleValue() * 3600).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public void calculateNumberOfMiss() {
        for (int i = 0; i < NUMBER_OF_FIRE_LINES * 5; i++) {
            double temp = Math.random();
            if (temp < (1 - chanceToHit.doubleValue())) {
                countHitOutTarget++;
            }
        }
    }

    public void setAverageSpeed(BigDecimal averageSpeed) {
        this.averageSpeed = averageSpeed.setScale(4, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal getResultTime() {
        return resultTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCountHitOutTarget() {
        return countHitOutTarget;
    }

    public void setCountHitOutTarget(int countHitOutTarget) {
        this.countHitOutTarget = countHitOutTarget;
    }

    public void setChanceToHit(BigDecimal chanceToHit) {
        this.chanceToHit = chanceToHit;
    }

    public void setResultTime(BigDecimal resultTime) {
        this.resultTime = resultTime;
    }

    public void printResultInfo() {
        System.out.printf("Спортсмен № %02d: Время - %6.2f секунд. Средняя скорость - %2.4f км/час. Количество промахов %d%n", number, resultTime.doubleValue(), averageSpeed, countHitOutTarget);
    }
}