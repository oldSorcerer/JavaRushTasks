package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.model.Box;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {

    private View view;

    public Field(View view) {
        this.view = view;
    }

    public void paint(Graphics g) {
        Box box = new Box(5,5);
    }
}
