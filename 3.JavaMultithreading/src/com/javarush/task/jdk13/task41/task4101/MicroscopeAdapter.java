package com.javarush.task.jdk13.task41.task4101;

public class MicroscopeAdapter extends Hammer {

    private final Microscope microscope;

    public MicroscopeAdapter(Microscope microscope) {
        this.microscope = microscope;
    }

    @Override
    public boolean hit(Nail nail) {
        microscope.bang();
        return false;
    }
}
