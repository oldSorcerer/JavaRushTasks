package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FrameListener extends WindowAdapter {

    View view;

    @Override
    public void windowClosing(WindowEvent e) {
        view.exit();
    }
}