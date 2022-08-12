package com.javarush.task.jdk13.task41.task4122;

public class Notepad {

    private TextWindow textWindow;

    public Notepad(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public void save() {
    }

    public void undo() {
    }

    public String print() {
        return textWindow.getText();
    }
}
