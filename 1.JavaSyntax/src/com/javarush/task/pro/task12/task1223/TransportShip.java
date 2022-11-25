package com.javarush.task.pro.task12.task1223;

public class TransportShip {
    public Integer speed;
    public Integer acceleration;
    public Passenger[] passengers;
    public OnBoardSystem onBoardSystem = new OnBoardSystem();

    public class OnBoardSystem {
        public Integer calculateJumpTime(Integer distance) {
            int time = 0;
            int way = 0;
            while (way < distance){
                time++;
                way = (speed * time) + (acceleration * time * time / 2);
            }
            return time - 1;
        }
    }
}
