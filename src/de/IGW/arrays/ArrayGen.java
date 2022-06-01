package de.IGW.arrays;

public class ArrayGen {
    // funktion zum erzeugen eines arrays mit zufälligen werten und zufälligen indexen
    public static int[] genArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
