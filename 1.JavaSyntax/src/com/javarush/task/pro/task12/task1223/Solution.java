package com.javarush.task.pro.task12.task1223;

/* 
Экстренная посадка
*/

public class Solution {

    public static TransportShip ship;

    static {
        ship = new TransportShip();
        ship.speed = 1000;
        ship.acceleration = 500;
        ship.passengers = new Passenger[]{new Passenger("Диего"), new Passenger("Амиго")};
    }

    public static void main(String[] args) {
        Integer delay = ship.onBoardSystem.calculateJumpTime(12345);
        for (Passenger passenger : ship.passengers) {
            passenger.jump(delay);
        }
    }
}
