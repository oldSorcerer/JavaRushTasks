package com.javarush.task.task05.task0523;

/* 
Конструктор
*/

public class Circle {
    public Color color = new Color();

    public Circle() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public static class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
