package com.javarush.task.task32.task3209.actions;

import com.javarush.task.task32.task3209.View;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.swing.*;
import java.awt.event.ActionEvent;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UndoAction extends AbstractAction {

    View view;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        view.undo();
    }
}
