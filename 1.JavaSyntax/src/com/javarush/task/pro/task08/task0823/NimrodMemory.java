package com.javarush.task.pro.task08.task0823;

/* 
Очистка памяти корабля
*/

public class NimrodMemory {

    public static long[] santaFabrica = new long[99000];
    public static long[] eroticSimulators = new long[100500];

    public static void main(String[] args) {
        // test
        markForDeletion();
        System.out.println(Long.toBinaryString(santaFabrica[0]));
    }

    public static void markForDeletion() {
        for (int i = 0; i < santaFabrica.length; i++) {
            santaFabrica [i] |= (1 << 13);
            santaFabrica [i] |= (1 << 21);
            santaFabrica [i] |= (1 << 29);
        }
        for (int i = 0; i < eroticSimulators.length; i++) {
            eroticSimulators [i] |= 1 << 13;
            eroticSimulators [i] |= 1 << 21;
            eroticSimulators [i] |= 1 << 29;
        }
    }
}
