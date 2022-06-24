package de.gds2.collectionClasses.dict;

import java.util.Hashtable;

public class Hashmap {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(3, "Klaus");
        h.put(2, "Laus");
        h.put(1, "Hassib");
        System.out.println(h.get(3));

    }
}
