package com.javarush.task.jdk13.task41.task4101;

import java.util.Set;

public class HardWorker {
    private final String name;
    private final Set<Nail> nails;
    private final Hammer hammer;

    public HardWorker(String name, Set<Nail> nails, Hammer hammer) {
        this.name = name;
        this.nails = nails;
        this.hammer = hammer;
    }

    public void hammerAllNails() {
        for (Nail nail : nails) {
            boolean hammered = false;
            while (!hammered) {
                hammered = hammer.hit(nail);
            }
        }
        System.out.println(name + " done!");
    }
}
