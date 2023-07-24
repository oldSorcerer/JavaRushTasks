package com.javarush.task.task36.task3601;

public class View {

    private final Controller controller = new Controller();

    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}
