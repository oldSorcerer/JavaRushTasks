package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {

    private final View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }

}
