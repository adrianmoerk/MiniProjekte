package de.gds2.collectionClasses.hashmap;

import java.util.HashMap;

public class KFZMapping {
    private HashMap<String, String> kennzeichen = new HashMap<>();

    public void insert(String kurz, String stadt) {
        this.kennzeichen.put(kurz, stadt);
    }

    public void print(String s) {
        System.out.println(s + "\t:\t" + this.kennzeichen.get(s));
    }

    public void remove(String s) {
        this.kennzeichen.remove(s);
    }

}
