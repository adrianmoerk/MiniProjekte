package de.IGW.arrays;

import static java.util.Arrays.sort;

public class Median {

    // methode zum berechnen der mediane rekusiv
    public static double medianRecursive(int[] a, int left, int right) {
        return medianRecursive(a, 0, a.length - 1);
    }
}
