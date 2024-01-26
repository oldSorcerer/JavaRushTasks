package com.javarush.task.task37.task3711;

public class Computer {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final HardDrive hardDrive = new HardDrive();


    public void run(){
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
