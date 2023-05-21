package com.javarush.task.jdk13.task41.task4101;

import java.util.HashSet;
import java.util.Set;

/* 
Микроскопом по гвоздям
*/

public class Solution {

    public static void main(String[] args) {
        HardWorker worker1 = new HardWorker("Bob", getNailsPack(), new Hammer());
        HardWorker worker2 = new HardWorker("Bob Jr.", getNailsPack(), new MicroscopeAdapter(new Microscope()));

        worker1.hammerAllNails();
        worker2.hammerAllNails();
    }

    public static Set<Nail> getNailsPack() {
        Set<Nail> nailPack = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            nailPack.add(new Nail());
        }
        return nailPack;
    }
}
