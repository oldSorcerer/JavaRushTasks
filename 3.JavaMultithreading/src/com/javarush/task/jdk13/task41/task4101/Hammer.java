package com.javarush.task.jdk13.task41.task4101;

public class Hammer {
    public boolean hit(Nail nail) {
        if (nail.visiblePart > 0) {
            nail.visiblePart--;
        }
        return nail.visiblePart == 0;
    }
}
