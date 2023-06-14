package com.javarush.task.jdk13.task41.task4122;

public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public String getText() {
        return currentText.toString();
    }

    public TextWindowState save() {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState state) {
        currentText = new StringBuilder(state.text);
    }

    public static class TextWindowState {
        private final String text;

        public TextWindowState(String text) {
            this.text = text;
        }
    }
}
