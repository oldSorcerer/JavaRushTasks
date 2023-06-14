package com.javarush.task.jdk13.task41.task4122;

public class Notepad {

    private TextWindow textWindow;
    private TextWindow.TextWindowState savedTextWindow;

    public Notepad(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public void save() {
        savedTextWindow = textWindow.save();
    }

    public void undo() {
        textWindow.restore(savedTextWindow);
    }

    public String print() {
        return textWindow.getText();
    }
}
