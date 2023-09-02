package com.javarush.task.task37.task3710.decorators;

import com.javarush.task.task37.task3710.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setBorderColor() {
        System.out.println(String.format("Setting the border color for %s to red", decoratedShape.getClass().getSimpleName()));
    }

    @Override
    public void draw() {
        setBorderColor();
        decoratedShape.draw();
    }
}
