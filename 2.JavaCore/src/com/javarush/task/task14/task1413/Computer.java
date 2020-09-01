package com.javarush.task.task14.task1413;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer (Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
