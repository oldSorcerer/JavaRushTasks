package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UndoMenuListener implements MenuListener {

    View view;
    JMenuItem undoMenuItem;
    JMenuItem redoMenuItem;

    @Override
    public void menuSelected(MenuEvent MenuEvent) {
        undoMenuItem.setEnabled(view.canUndo());
        redoMenuItem.setEnabled(view.canRedo());
    }

    @Override
    public void menuDeselected(MenuEvent MenuEvent) {

    }

    @Override
    public void menuCanceled(MenuEvent MenuEvent) {

    }
}