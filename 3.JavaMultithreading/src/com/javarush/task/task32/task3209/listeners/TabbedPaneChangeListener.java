package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TabbedPaneChangeListener implements ChangeListener {

    View view;

    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}